import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Welcome to the number guessing game!");
        System.out.println("Please enter numbers 1-10");
        int guess = scanner.nextInt();
        int number = r.nextInt(11);
        if(guess < 0 || guess > 10){
            System.out.println("Please enter values between 1 and 10");
            guess = scanner.nextInt();
        } else if(guess < number) {
            System.out.println("Failed guess. Please enter a larger number");
            guess = scanner.nextInt();
        }
        else {
            System.out.println("Failed guess. Please enter a smaller number");
            i++;
            guess = scanner.nextInt();
        }
        System.out.println("Congrulations, you win!");
        System.out.println(i + ". You guessed on the try!");
    }
}