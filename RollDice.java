/***********************************************
 * @ file RollDice.java
 * @ brief This program calculate the probability in rolling dice.
 * @ author Jianqiu Xu (Tony)
 * @ date September 30, 2017
 ***********************************************/
import java.util.Random;

public class RollDice {
    public static void main(String[] args){
        Random rand = new Random();
        int i;
        int n;
        int number = 0;
        double probability = 0;
        int[] occur = new int[13];

        //Part 1
        //Summation
        System.out.print("  summation");
        for(i = 2; i <= 12; i++){

            System.out.print("        " + i);

        }

        //Occurrence
        System.out.println("");
        System.out.print("  occurrence");
        for(i = 2; i <= 12; i++){

            for(n = 1; n <= 6; n++){

                if(i - n > 0 && i - n <= 6){

                    number++;

                }
            }

            System.out.print("        " + number);
            number = 0;

        }

        //Probability
        System.out.println("");
        System.out.print("probability(%)");
        for(i = 2; i <= 12; i++){

            for(n = 1; n <=6; n++){

                if(i - n > 0 && i - n <= 6){

                    number++;
                    probability = ((double) number / 36) * 100;

                }
            }

            System.out.printf("     %.2f", probability);
            number = 0;

        }

        System.out.println("");
        System.out.println("");

        //Part 2
        //Summation
        System.out.print("  summation");
        for(i = 2; i <= 12; i++){

            System.out.print("        " + i);

        }

        int Dice1 = 0;
        int Dice2 = 0;
        int DiceSum = 0;

        //100 Rolls
        System.out.println("");
        System.out.print("  100 rolls(%)");

        //Use array to store occurrence
        //Set Random Dice Result
        for(i = 1; i <= 100; i++){

            Dice1 = rand.nextInt(6) + 1;
            Dice2 = rand.nextInt(6) + 1;
            DiceSum = Dice1 + Dice2;
            occur[DiceSum] ++;

        }

        for(i = 2; i < occur.length; i++){

            System.out.print("       " + occur[i]);

        }

        for(i = 2; i <= 12; i++){

            occur[i] = 0;
        }

        System.out.println("");
        System.out.print("  1000 rolls(%)");

        //1000 Rolls
        for(i = 1; i <= 1000; i++){

            Dice1 = rand.nextInt(6) + 1;
            Dice2 = rand.nextInt(6) + 1;
            DiceSum = Dice1 + Dice2;
            occur[DiceSum] ++;

        }

        for(i = 2; i < occur.length; i++) {

            System.out.print("      " + occur[i] / 10.0);

        }
        for(i = 2; i <= 12; i++){

            occur[i] = 0;
        }

        System.out.println("");
        System.out.print("  10000 rolls(%)");

        //10000 Rolls
        for(i = 1; i <= 10000; i++){
            Dice1 = rand.nextInt(6) + 1;
            Dice2 = rand.nextInt(6) + 1;
            DiceSum = Dice1 + Dice2;
            occur[DiceSum] ++;

        }

        for(i = 2; i < occur.length; i++) {
            System.out.print("     " + occur[i] / 100.0);

        }

    }

}
