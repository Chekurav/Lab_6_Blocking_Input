import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int randomNumber = generator.nextInt(10) + 1; // random number 1 to 10
        int guess = 0;
        String trash = "";
        boolean done = false;

        // get guess
        do
        {
            System.out.print("Guess a number between 1 and 10: ");

            if (in.hasNextInt())
            {
                guess = in.nextInt();
                in.nextLine(); // clear the buffer

                if (guess >= 1 && guess <= 10)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Number must be between 1 and 10!");
                }
            }
            else
            {
                trash = in.nextLine(); // read bad input as string
                System.out.println("You entered: " + trash);
                System.out.println("Invalid input! Please enter a number.");
            }

        }while(!done);

        System.out.println("The random number was: " + randomNumber);

        if (guess > randomNumber)
        {
            System.out.println("Your guess was too high!");
        }
        else if (guess < randomNumber)
        {
            System.out.println("Your guess was too low!");
        }
        else
        {
            System.out.println("You got right on the money!");
        }
    }
}