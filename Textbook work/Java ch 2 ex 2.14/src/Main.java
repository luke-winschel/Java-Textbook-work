//(Health Application: computing BMI) Write a program that prompts the user to enter a weight in pounds and a height in inches and displays the BMI
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //Get user input for the height
        System.out.println("Please enter a height in inches: ");
        double height = input.nextDouble();
        //Get user input for weight
        System.out.print("Please enter a weight in pounds: ");
        double weight = input.nextDouble();

        //Convert inches and pounds inputs to Kilograms and Meters
        double meters = height * 0.0254;
        double kilos = weight * 0.45359237;

        //Square the meters for the equation
        double meters_sqrd = Math.pow(meters, 2);

        //New BMI variable stores the answer to the BMI equation
        double bmi = kilos / meters_sqrd;

        //Print the results
        System.out.println("BMI is: " + String.format("%.4f",bmi));

    }

}