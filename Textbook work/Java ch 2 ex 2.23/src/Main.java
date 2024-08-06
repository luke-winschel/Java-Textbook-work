//(Cost of driving) Write a program that prompts the user to enter the distance to drive, fuel efficiency of the car in miles per gallon and the price per gallon.  Then display the cost of the trip.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    //Get user input for distance to be driven
    System.out.println("Please enter the distance that will be driven: ");
    double distance = input.nextDouble();

    //Get user input for Miles per gallon of the vehicle
    System.out.println("Please enter the miles per gallon: ");
    double mpg = input.nextDouble();

    //Get user input for the cost of gas per gallon
    System.out.println("Please enter the cost of gas per gallon: ");
    double cost = input.nextDouble();

    //Find the number of gallons used
    double gallons = distance / mpg;
    //Multiply the number of gallons used by the cost per gallon to find the cost of the trip
    double cost_of_trip = gallons * cost;

    //Print the results
    System.out.println("The cost of driving is: $" + String.format("%.2f", cost_of_trip));
    }
}