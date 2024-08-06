//(Find the number of years) Write a program that prompts the user to enter the minutes and displays the maximum number of years and remaining days for the minutes
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //Get user input
        System.out.println("Please enter the number of minutes: ");
        int response = input.nextInt();

        //Convert the response into number of days
        int hours = response / 60;
        int days = hours / 24;

        //Divide by 365 to get number of years
        int years = days / 365;
        //Use remainder operator to get remaining days that the minutes add to
        int num_days = days % 365;

        //Print the response
        System.out.println(response + " minutes is approximately " + years + " years and " + num_days + " days!");
    }
}