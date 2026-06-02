import java.util.Scanner;
import java.math.BigInteger;
public class EvenOdd {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter a number");
          BigInteger num=scanner.nextBigInteger();
            if(num % 2 == 0)
            {
                System.out.println("Even");
            }
            else
            {
                System.out.println("Odd");
            }
      }
}