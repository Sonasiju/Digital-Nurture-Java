import java.util.Scanner;
public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year");
        double num = scanner.nextDouble();   
        if ((num % 4 == 0 && num % 100 !=0) || (num % 400 == 0))
        {
            System.out.println(" LEAP YEAR ");
        }
        else
        {
            System.out.println(" NOT A LEAP YEAR ");
        }
         scanner.close();
}
    }
}
   