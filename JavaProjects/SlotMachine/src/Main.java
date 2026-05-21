import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int balance = 100;
        int bet;
        int payOut;
        String playAgain = "y";
        String[] row ;

        System.out.println("*--*--*--*--*--*--*--*--*--*--*--*--*--*--*");
        System.out.println("      || Welcome to the Java Slots ||      ");
        System.out.println("      || Symbols:  7️⃣ 💎 🔔 🍒 🍋 ||      ");
        System.out.println("*--*--*--*--*--*--*--*--*--*--*--*--*--*--*");

        while(balance > 0){
            System.out.println("Your Balance = "+balance);
            System.out.print("Please Enter Your Bet : ");
            bet = sc.nextInt();
            sc.nextLine();
            if(bet <= 0){
                System.out.println("Bet Must Be Greater Then 0");
            }
            else if(bet > balance){
                System.out.println("Insufficient Balance");
                continue;
            }else{
                balance -= bet;
            }

            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payOut = getPayout(row,bet);

            if(payOut > 0){
                System.out.println("You Won : "+payOut+"rs.");
                balance += payOut;
            }else{
                System.out.println("You Lost : "+bet+"rs.");
            }

            System.out.print("Do You Want To Play Again (y/n) : ");
            playAgain = sc.nextLine();

            if (!playAgain.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
    static String[] spinRow(){
        Random rand = new Random();
        String[] row = new String[3];
        String[] symbols = {"7️⃣", "💎", "🔔", "🍒", "🍋"};
        for(int i = 0; i < 3; i++){
            row[i] = symbols[rand.nextInt(symbols.length)];
        }
        return row;
    }
    static void printRow(String[] row){
        System.out.println("--*----*----*--");
        System.out.println(" "+String.join(" | ", row));
        System.out.println("--*----*----*--");
    }
    static int getPayout(String[] row, int bet){
        if(row[0].equals(row[1]) &&  row[1].equals(row[2])){
            return switch(row[0]){
                case "7️⃣" -> bet*20;
                case "💎" -> bet*10;
                case "🔔" -> bet*5;
                case "🍒" -> bet*4;
                case "🍋" -> bet*3;
                default -> 0;
            };
        }else if(row[0].equals(row[1])){
            return switch(row[0]) {
                case "7️⃣" -> bet * 10;
                case "💎" -> bet * 5;
                case "🔔" -> bet * 4;
                case "🍒" -> bet * 3;
                case "🍋" -> bet * 2;
                default -> 0;
            };
        }else if(row[1].equals(row[2])){
            return switch(row[1]) {
                case "7️⃣" -> bet * 10;
                case "💎" -> bet * 5;
                case "🔔" -> bet * 4;
                case "🍒" -> bet * 3;
                case "🍋" -> bet * 2;
                default -> 0;
            };
        }

        return 0;
    }
}
