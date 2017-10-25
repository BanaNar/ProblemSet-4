/***********************************************
 * @ file MultiplicationQuiz.java
 * @ brief This program can create a random quiz of related multiplication quiz.
 * @ author Jianqiu Xu (Tony)
 * @ date September 28, 2017
 ***********************************************/
import java.util.Random;
import java.util.Scanner;

public class MultiplicationQuiz {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();
        int numProblem = 0; //number of problems users want to work on
        int min = 0; //the largest number
        int max = 0; //the smallest number
        int i = 1; //the number of problem that user is working on
        int answer = 0; //the correct answer
        int user = 0; //user's answer
        int num1 = 0; //random number 1
        int num2 = 0; //random number 2
        double correct = 0; //number of correct answer
        double percentage;

        System.out.println("Multiplication Quiz Wiz!");
        System.out.println();
        System.out.print("How many problems do you want to work on? ");
        numProblem = scnr.nextInt();
        System.out.print("What is the smallest and largest numbers to use? ");
        min = scnr.nextInt();
        max = scnr.nextInt();
        System.out.println();

        for(i = 0;i < numProblem;i++){
            if(max > min){
                //generate 2 random number if user typed correct smallest and largest number
                num1 = rand.nextInt(max - min + 1) + min;
                num2 = rand.nextInt(max - min + 1) + min;
            }
            else if (max < min){
                System.out.println("Please retype the smallest and largest numbers.");
                return;
            }
            System.out.print("What is " + num1 + " x " + num2 + " = ? ");
            user = scnr.nextInt();
            answer = num1 * num2;
            //compute the correct answer and collect user's answer

            //compare the correct answer with user's answer and give feedback
            if(user == answer){
                System.out.println("Correct!");
                correct++;
                System.out.println();
            }
            else if(user != answer){
                System.out.println("Oops... It's " + answer);
                System.out.println();
            }

        }
        percentage = ((double)correct / (double)numProblem) * 100;

        //show result
        System.out.println("You got " + (int)correct + " out of " + numProblem);
        System.out.println("Your final score is " + (int)Math.round(percentage) + "%");

    }
}