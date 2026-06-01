// 1. Hello World Program

public class HelloWorld {
    public static void main (String[] args) {
        System.out.println("Hello World");
    }
}

// 2. Simple Calculator

import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter first number");
      double num1 = scanner.nextDouble();

      System.out.println("Enter second number");
      double num2 = scanner.nextDouble();

      System.out.println("Choose an operation");
      char op = scanner.next().charAt(0);

      double result=0;

        switch(op)
        {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                     result = num1/num2;
                }         
                else {
                    System.out.println("Error");
                }
                break;
            default:
                System.out.println("Invalid operator");  
        }

    }
}