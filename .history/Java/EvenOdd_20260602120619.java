import java.util.Scanner;
import java.math.BigInteger;
public class EvenOdd {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter a number");
          BigInteger num=scanner.nextBigInteger();
            if(num.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO))
            {
                System.out.println("Even");
            }
            else
            {
                System.out.println("Odd");
            }
      }
}