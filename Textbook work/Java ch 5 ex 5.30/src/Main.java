// (Financial Application: compound value) Write a program that prompts the user to enter an amount, the annual interest rate , and the number of months then display
//the amount in the savings account after the given month.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sum = 0;
        Scanner input = new Scanner(System.in);

        //Get user input for the deposit
        System.out.println("Please enter the amount of money that you'd like to deposit: ");
        int deposit = input.nextInt();

        //Get user input for the interest rate on the account.  Getting as a whole number.
        System.out.println("Please enter the yearly interest rate as a percent: ");
        double interest = input.nextInt();
        //Divide by 100 to get the percentage as a decimal
        double interest_decimal = interest / 100;
        //Dividing by 12 to get the monthly interest percentage
        double interest_rate = interest_decimal / 12;

        //Get user input for value of the account after requested months
        System.out.println("Please enter the number of months you'd like to view: ");
        int months = input.nextInt();

        //Loop that calculates the account value up to the number of requested months
        for (int i = 1; i <= months; i++) {
            sum =+ (deposit + sum) * (1 + interest_rate);
            System.out.println("After month: " + i + " the account value would be: " + String.format("%.3f", sum));
        }
    }
}
