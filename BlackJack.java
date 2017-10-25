/***********************************************
 * @ file BlackJack.java
 * @ brief This program can implement a simplified version of Blackjack.
 * @ author Jianqiu Xu (Tony)
 * @ date September 26, 2017
 ***********************************************/
import java.util.Random;
import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        System.out.println("===============================================================\n"
                + "Black Jack Table\n"
                + "===============================================================");
        System.out.println();

        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();

        int scorePlayer = 0;//Player's score
        int scoreDealer = 0;//Dealer's score
        int winPlayer = 0;//Count Player's win
        int winDealer = 0;//Count Dealer's win
        int card;
        String choice;
        String option = "y";


        //Player's Round
        while (option.equals("y")) {

            System.out.println("Players turn");
            card = rand.nextInt(11) + 1;
            System.out.print("card: " + card);
            scorePlayer = scorePlayer + card;
            System.out.println(" Current score: " + scorePlayer);


            while (scorePlayer < 21) {

                System.out.print("(h) hit me again! (d) I'm done! : ");
                choice = scnr.nextLine();

                if (choice.equals("h")) {

                    card = rand.nextInt(11) + 1;
                    System.out.print("card: " + card);
                    scorePlayer = scorePlayer + card;
                    System.out.println(" Current score: " + scorePlayer);

                } else {

                    break;

                }

            }
            System.out.println("Player's final score is: " + scorePlayer);
            System.out.println();

            //Dealer's Round
            while (scoreDealer <= 17) {

                System.out.println("Dealer's turn");
                card = rand.nextInt(11) + 1;
                System.out.print("Card: " + card);
                scoreDealer = scoreDealer + card;
                System.out.println(" Current score: " + scoreDealer);

            }
            System.out.println("Dealer's final score is " + scoreDealer);


            //Results
            if (scorePlayer <= 21 && scoreDealer <= 21 && scorePlayer > scoreDealer) {

                System.out.print("Player won!");
                winPlayer++;

            } else if (scorePlayer <= 21 && scoreDealer <= 21 && scorePlayer < scoreDealer) {

                System.out.print("Dealer won!");
                winDealer++;

            } else if (scorePlayer <= 21 && scoreDealer <= 21 && scorePlayer == scoreDealer) {

                System.out.print("Tie!");

            } else if (scorePlayer > 21 && scoreDealer > 21) {

                System.out.print("Tie!");

            } else if (scorePlayer <= 21 && scoreDealer > 21) {

                System.out.print("Player won!");
                winPlayer++;

            } else if (scorePlayer > 21 && scoreDealer <= 21) {

                System.out.print("Dealer won!");
                winDealer++;

            }

            //Play again
            System.out.println("");
            System.out.println("");
            System.out.print("Play again? (y/n): ");
            option = scnr.nextLine();
            scorePlayer = 0;
            scoreDealer = 0;

        }

        System.out.println("Player won " + winPlayer + " times.");
        System.out.println("Dealer won " + winDealer + " times.");

    }
}
