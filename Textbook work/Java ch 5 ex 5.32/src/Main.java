//Generate a lottery of two numbers.  The two digits in the number are distinct
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //Generate random 2 digit number
        int lottery = (int)(Math.random() * 100);
        //Divide by 10 to isolate the first digit of the random number
        int lottery_digit_1 = lottery / 10;
        //Use the remainder function to get the second digit of the random number
        int lottery_digit_2 = lottery % 10;

        //While loop that checks the values of the two digits of the random number
        //If the values of the two digits match then a new random number is generated
        //This continues unit a number with two unique digits is generated
        while (lottery_digit_1 == lottery_digit_2){
         lottery= (int)(Math.random() * 100);
        }
        //Get user input for the lottery pick guess
        System.out.println("Note that the lottery pick cannot contain the same two numbers!");
        System.out.println("Please enter your lottery pick: ");
        int guess = input.nextInt();

        //Divide by 10 to get the first digit of the guess
        int guess_digit_1 = guess / 10;
        //Use the remainder function to get the second digit of the guess
        int guess_digit_2 = guess % 10;

        //Using conditional statements to find the correct output for the guess
        //If the value of the randomly generated lottery pick match the user guess.
        if (guess == lottery)
            System.out.println("Exact match! You win $10,000" + " The lottery number was: " + lottery);
        //If the first digit of the guess number matches the second digit of the lottery number and the second guess digit matches the first lottery digit.
        else if (lottery_digit_2 == guess_digit_1 && lottery_digit_1 == guess_digit_2)
            System.out.println("Match all digits! You win $3,000" + " The lottery number was: " + lottery);
        //If the first guess digit matches only the first or second digit of the lottery number or the second digit of the guess number matches only the first or second digit of the lottery number.
        else if (guess_digit_1 == lottery_digit_1 || guess_digit_1 == lottery_digit_2 || guess_digit_2 == lottery_digit_1 || guess_digit_2 == lottery_digit_2)
            System.out.println("Match one digit! You win $1,000" + " The lottery number was: " + lottery);
        //If there are no matches
        else
            System.out.println("Sorry, no match." + " The lottery number was: " + lottery);
                }
            }