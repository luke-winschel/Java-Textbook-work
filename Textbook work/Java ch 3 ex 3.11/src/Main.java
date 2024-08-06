//(Find the number of days in a month)  Write a program that prompts the user to enter a month and year and displays the number of days in a month.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //Create Boolean variable that dictates if the year entered is a leap year.
        boolean leap_year = false;

        //Get user input for the month.
        System.out.println("Please enter a month (1-12): ");
        int month = input.nextInt();

        //Get user input for the year.
        System.out.println("Please enter the year: ");
        int year = input.nextInt();

        //Conditional that determines if the year entered is a leap year
        if (year % 4 == 0){
            leap_year = true;
        }
        //Conditional statement that determines which switch statement to utilize for number of days in a month.
        if (leap_year == true){
            //If year entered is a leap year, use the following switch statement.
            switch (month){
                case 1:
                    System.out.println("In " + year + " January will have 31 days!");
                    break;
                case 2:
                    System.out.println("In " + year + " February will have 29 days!");
                    break;
                case 3:
                    System.out.println("In " + year + " March will have 31 days!");
                    break;
                case 4:
                    System.out.println("In " + year + " April will have 30 days!");
                    break;
                case 5:
                    System.out.println("In " + year + " May will have 31 days!");
                    break;
                case 6:
                    System.out.println("In " + year + " June will have 30 days!");
                    break;
                case 7:
                    System.out.println("In " + year + " July will have 31 days!");
                    break;
                case 8:
                    System.out.println("In " + year + " August will have 31 days!");
                    break;
                case 9:
                    System.out.println("In " + year + " September will have 30 days!");
                    break;
                case 10:
                    System.out.println("In " + year + " October will have 31 days!");
                    break;
                case 11:
                    System.out.println("In " + year + " November will have 30 days!");
                    break;
                case 12:
                    System.out.println("In " + year + " December will have 31 days!");
                    break;
            }
        }
        else if (leap_year != true) {
            //If the year entered is not a leap year, use the following switch statement.
            switch (month){
                case 1:
                    System.out.println("In " + year + " January will have 31 days!");
                    break;
                case 2:
                    System.out.println("In " + year + " February will have 28 days!");
                    break;
                case 3:
                    System.out.println("In " + year + " March will have 31 days!");
                    break;
                case 4:
                    System.out.println("In " + year + " April will have 30 days!");
                    break;
                case 5:
                    System.out.println("In " + year + " May will have 31 days!");
                    break;
                case 6:
                    System.out.println("In " + year + " June will have 30 days!");
                    break;
                case 7:
                    System.out.println("In " + year + " July will have 31 days!");
                    break;
                case 8:
                    System.out.println("In " + year + " August will have 31 days!");
                    break;
                case 9:
                    System.out.println("In " + year + " September will have 30 days!");
                    break;
                case 10:
                    System.out.println("In " + year + " October will have 31 days!");
                    break;
                case 11:
                    System.out.println("In " + year + " November will have 30 days!");
                    break;
                case 12:
                    System.out.println("In " + year + " December will have 31 days!");
                    break;
            }
        }
        //Else error for testing purposes.
        else{
            System.out.println("Error!");
        }
    }
}