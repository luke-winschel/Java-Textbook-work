//(Game: Add three numbers)  Write a program that randomly generates 3 single digit integers and prompts the user to enter the sum of the numbers
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //Randomly generate 3 numbers less than 10
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);
        int num3 = (int)(Math.random()*10);

        //Get the answer of the 3 randomly generated numbers
        int equation_answer = num1 + num2 + num3;

        //Display the equation to the end user and read the users input.
        System.out.println("What is the sum of the following equation: " + num1 + " + " + num2 + " + " + num3 + "?");
        int user_answer = input.nextInt();

        //Conditional statement
        //If the users answer matches the computers answer, print that the answer is correct.
        if (user_answer == equation_answer){
            System.out.println("Correct! The answer is: " + equation_answer);
        }
        //If the user answer doesn't match the computers answer, print that the answer is incorrect.
        else if (user_answer != equation_answer) {
            System.out.println("Incorrect!  The answer is: " + equation_answer);
        }
        //Else error for testing purposes
        else{
            System.out.println("Error!");
        }

    }
}