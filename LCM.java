import java.util.*;

public class LCM {
  private static long lcm_naive(int a, int b) {
    for (long l = 1; l <= (long) a * b; ++l)
      if (l % a == 0 && l % b == 0)
        return l;

    return (long) a * b;
  }
  
  private static long lcm(int a, int b) {
    
	int max = a;
	int min = b;
	
	if (b > a){
		max = b;
		min = a;
	}
		

	for (long l = max; l <= (long) a * b; l += max)
      if (l % a == 0 && l % b == 0)
        return l;

    return (long) a * b;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm(a, b));
  }
}
