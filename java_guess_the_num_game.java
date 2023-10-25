/*The program generates a random number between 1 and 100.
The user is prompted to enter a guess.
The program tells the user if their guess is too high or too low.
The program continues until the user guesses correctly.
The program displays the number of guesses it took the user to guess correctly.
 */
import java.util.Random;
import java.util.Scanner;
class GuessTheNumber{
    public static void main(String args[])
    {
        //Generate a random number between 1 and 100
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int base_points = 1000;

        //Create a Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        //Initialize the tries to count the number of tries
        int tries = 15;

        //Start the game loop
        while (tries != 0) {

            // Prompt the user to enter a guess
            System.out.println("\nGuess a number between 1 and 100: ");
            int userGuess = scanner.nextInt();
            

            // Check if the user guessed correctly
            if (userGuess == randomNumber)
            {
                System.out.println("You guessed correctly! It took you " + tries + " tries.");
                break;
            }

            // Giveing hints to user
            else if (randomNumber  <=  20)
            {
                System.out.println("\nYour guess number is in the rangle of 0 to 20.");
                if(randomNumber < userGuess )
                {
                    System.out.println("Enter lower number to reach the number");
                }
                else
                {
                    System.out.println("Enter high number to reach the number");
                }
            }
            else if(randomNumber  <= 40 )
                {
                System.out.println("\nYour guess number is in the range of 21 to 40.");
                if(randomNumber < userGuess )
                {
                    System.out.println("Enter lower number to reach the number");
                }
                else
                {
                    System.out.println("Enter high number to reach the number");
                }
            }
            else if(randomNumber <= 60)
                {
                System.out.println("\nYour guess number is in the range of 41 to 60");
                if(randomNumber < userGuess )
                {
                    System.out.println("Enter lower number to reach the number");
                }
                else if(randomNumber > userGuess)
                {
                    System.out.println("Enter high number to reach the number");
                }
            }
            else if (randomNumber  <=  80)
            {
                System.out.println("\nYour guess number is in the rangle of 61 to 80.");
                if(randomNumber < userGuess )
                {
                    System.out.println("Enter lower number to reach the number");
                }
                else
                {
                    System.out.println("Enter high number to reach the number");
                }
            }
            else if (randomNumber  <=  100)
            {
                System.out.println("\nYour guess number is in the rangle of 81 to 100.");
                if(randomNumber < userGuess )
                {
                    System.out.println("Enter lower number to reach the number");
                }
                else
                {
                    System.out.println("Enter high number to reach the number");
                }
            }
            base_points = base_points - 50;
            tries--;
            System.out.println("You have "+tries+ " left");
        }
        System.out.println("Guessed is "+randomNumber);
        if(tries == 0)
        System.out.println("you are out of tries please try again");
        else{
            System.out.println(base_points+ " your score!");
        }
        // Close the Scanner object
        scanner.close();
    }
}
