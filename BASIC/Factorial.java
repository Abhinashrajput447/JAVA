import java.util.Scanner;
import java.math.BigInteger;

public class Factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      System.out.print("Enter a non-negative integer: ");
      if (!sc.hasNextInt()) {
        System.out.println("Error: input is not an integer.");
        return;
      }

      int n = sc.nextInt();
      if (n < 0) {
        System.out.println("Error: factorial is not defined for negative numbers.");
        return;
      }

      BigInteger fact = BigInteger.ONE;
      for (int i = 2; i <= n; i++) {
        fact = fact.multiply(BigInteger.valueOf(i));
      }

      System.out.println(n + "! = " + fact);
    } finally {
      sc.close();
    }
  }
}
