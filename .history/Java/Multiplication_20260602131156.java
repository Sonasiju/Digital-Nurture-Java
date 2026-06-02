import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
     System.out.println("Enter a number");
        double num = scanner.nextDouble();
        System.out.println("Enter the range");
        int n = scanner.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println( "num * " + i + " = " + num * i);
        }
        scanner.close();
    }
}