/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Integer number = 12;
        Integer counter = 0;
        Boolean correct = false;
        while (!correct) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Guess the number between 1 and 20");

            Integer guess = userInput.nextInt();
            if (guess < 0 || guess > 21) {
                System.out.print("Guess is not within the number range ");
            }
            else if (guess > number) {
                System.out.print("Guess is too large ");
                counter++;
            } else if (guess < number && guess > 0) {
                System.out.print("Guess is too small ");
                counter++;
            } else if (guess == (number)) {
                System.out.print("Correct!");
                counter++;
                correct = true;
                System.out.println("It took you " + counter + " " + "guesses.");

            }


        }
    }
}
