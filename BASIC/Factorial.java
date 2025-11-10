import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {
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
    }
  }
}
