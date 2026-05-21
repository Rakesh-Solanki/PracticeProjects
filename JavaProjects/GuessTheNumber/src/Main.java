import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 10;
        int guess;
        int attempts = 1;
        int randomNumber = random.nextInt(min, max+1);

        System.out.println("Guess a number between 1 to 100:" );

        do{
            System.out.print("Guess a Number : ");
            guess = scanner.nextInt();

            if(guess < randomNumber){
                System.out.println("TOO LOW !! Try Again");
            } else if (guess > randomNumber) {
                System.out.println("TOO HIGH !! Try Again");
            }else{
                System.out.println("------------------------------");
                System.out.println("Correct!! The Number is "+randomNumber);
                System.out.printf("-> You guessed in %d attempts", attempts);
            }
            attempts++;
        }while(guess != randomNumber);

        scanner.close();
    }
}
