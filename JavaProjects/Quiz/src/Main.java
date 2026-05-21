import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String []Questions = {"Which planet is known as the Red Planet?",
                "Who invented the telephone?",
                "Which country is famous for the Eiffel Tower?",
                "What does AI stand for?",
                "Which is the largest ocean in the world?"
        };

        String [][] Options = {
                {"1. Earth", "2. Venus", "3. Mars", "4. Jupiter"},
                {"1. Thomas Edison", "2. Alexander Graham Bell", "3. Isaac Newton", "4. Nikola Tesla"},
                {"1. Italy", "2. Germany", "3. France", "4. Japan"},
                {"1. Automatic Internet", "2. Artificial Intelligence", "3. Advanced Interface", "4. Artificial Integration"},
                {"1. Indian Ocean", "2. Arctic Ocean", "3. Atlantic Ocean", "4. Pacific Ocean"}
        };

        int [] answers = {3,2,3,2,4};

        Scanner sc = new Scanner(System.in);

        int ans;
        int score = 0;

        System.out.println("*--*--*--*--*--*--*--*--*--*--*--*--*--*--*");
        System.out.println("         || Welcome to the Quiz ||         ");
        System.out.println("*--*--*--*--*--*--*--*--*--*--*--*--*--*--*");

        for(int i = 0; i < Questions.length; i++){
            System.out.println(Questions[i]);
            for(String option : Options[i]){
                System.out.println(option);
            }
                System.out.print("Enter Your Answer : ");
                ans = sc.nextInt();
                if(ans==answers[i]){
                    System.out.println("*----*----*");
                    System.out.println("Correct!✅");
                    System.out.println("*----*----*\n");
                    score+=5;
                }else{
                    System.out.println("*----*----*");
                    System.out.println("Wrong!❌");
                    System.out.println("*----*----*\n");
                }

        }

        System.out.println("Your Score 🏆 : "+score+" Out of "+Questions.length*5);
        sc.close();
    }
}
