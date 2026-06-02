import java.util.Scanner;
public class EvenOdd {
      public static void mian(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter a number");
          double num=scanner.nextDouble();
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