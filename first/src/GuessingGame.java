import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number;
        int randomNumber = new Random().nextInt(100);

        for (int i = 0; i < 5; i++) {
            System.out.println("Try guessing a random number between 0 and 100");
            number = read.nextInt();

            if(number == randomNumber){
                System.out.println("Congratulations !");
                break;
            }

            if (number < randomNumber){
                System.out.println("The number is less than the correct number");
            }else {
                System.out.println("The number is greater than the correct number");
            }
        }

        System.out.println("Random number is "+ randomNumber);
    }
}
