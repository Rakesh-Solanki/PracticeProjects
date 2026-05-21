import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] choice = {"rock", "paper", "scissor"};
        String playerChoice;
        String computerChoice;
        String playAgain = "";


       do{
           System.out.print("\nEnter Your Choice (🪨(rock), 📃(paper), ✂️(scissor): ");
           playerChoice =sc.nextLine().toLowerCase();

           if (!playerChoice.equals("rock") &&
                   !playerChoice.equals("paper") &&
                   !playerChoice.equals("scissor"))
           {
               System.out.println("Invalid Choice");
               continue;
           }

           computerChoice =choice[rand.nextInt(choice.length)];

           System.out.println("Computer Choice : "+computerChoice + (computerChoice.equals(choice[0])?"🪨":(computerChoice.equals(choice[1]))?"📃":"✂️"));

           if(playerChoice.equals(computerChoice))
           {
               System.out.println("It's a Tie! 🤝");
           }else if(playerChoice.equals(choice[0])&&computerChoice.equals(choice[2])||
                   playerChoice.equals(choice[1])&&computerChoice.equals(choice[0])||
                   playerChoice.equals(choice[2])&&computerChoice.equals(choice[1]))
           {
               System.out.println("You Won! 🏆");
           }else
           {
               System.out.println("You Lose! 😔");
           }

           System.out.print("Would You Play Again (yes/no): ");
           playAgain =sc.nextLine().toLowerCase();

       }while(playAgain.equals("yes"));
    }

}
