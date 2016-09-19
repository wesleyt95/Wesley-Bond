/*
* Comments Example Program
* Wesley Bond
* July 21st, 2015
*/
import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // New Random Number
        Random random = new Random();
        long from = 1;
        long to = 100;
        int randomNumber = random.nextInt + from;
        // Guess the number
        int guessedNumber = 0;
 
        // Print out the revealed number
        System.out.printf("The number is between %d and %d.\n", from, to);
        
        // Print sequence
        do
        {
            System.out.print("Guess what the number is: ");
            guessedNumber = scan.nextInt();
            if (guessedNumber > randomNumber)
                System.out.println("Your guess is too high!");
            else if (guessedNumber < randomNumber)
                System.out.println("Your guess is too low!");
            else
                System.out.println("You got it!");
        } while (guessedNumber != randomNumber);
    }
} 