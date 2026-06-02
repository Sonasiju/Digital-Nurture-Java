import java.util.Scanner;
public class NumberGuessing {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int numberToGuess = (int) (Math.random() * 100) + 1;
       int userNumber = 0;
       System.out.println("I have selected a number between 1 and 100. Can you guess it?");
       System.out.println("Guess a number between 1 and 100");
        userNumber= scanner.nextInt();
       while (userNumber != numberToGuess)
       {
    
        if(userNumber > numberToGuess)
        {
            System.out.println("Too high! Try smaller number ");
            userNumber= scanner.nextInt();
        }
        else
        {
            System.out.println("Too low! Try bigger number ");
            userNumber= scanner.nextInt();
        }
        scanner.close();
       }
         System.out.println("Congratulations! You guessed the number " + numberToGuess);

    }

}