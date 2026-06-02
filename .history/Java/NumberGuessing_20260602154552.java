import java.util.Scanner;
public class NumberGuessing {
    public static void main(string[] args) {
      Scanner scanner = new Scanner(System.in);
      int numberToGuess = (int) (Math.random() * 100) + 1;
       int userNumber = 0;
       while (userNumber != numberToGuess)
       {
        System.out.println("Guess a number between 1 and 100");
        userNumber= scanner.nextInt();

        if(userNumber > numberToGuess)
        {
            System.out.println("Too high! Try smaller number ");
            userNumber= scanner.nextInt();
        }
        else (userNumber < numberToGuess)
        {
            System.out.println("Too low! Try bigger number ");
            userNumber= scanner.nextInt();
        }
       }





    }



}