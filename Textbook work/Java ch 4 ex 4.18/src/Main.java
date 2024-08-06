//(Student major and status)  Write a program that prompts the user to enter two characters and displays the major and status.  The first character represents the major and the second character represents the status
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Establish two empty string variables to store the year and major in.
        String major = "";
        String year = "";

        //Get user input for the Major and year
        System.out.println("M for Mathematics, C for Computer Science, or I for information technology");
        System.out.println("Please enter a character for your major followed by the year of school you are in: ");
        String response = input.next();

        //Isolate the two characters from the input
        char input_major = response.charAt(0);
        int input_year = response.charAt(1);

        //For statement that reads the first character of the input and determines what the major is.
        if (input_major == 'M' || input_major == 'm') {
            major = "Mathematics";
        } else if (input_major == 'C' || input_major == 'c') {
            major = "Computer Science";
        } else if (input_major == 'I' || input_major == 'i') {
            major = "Information Technology";
        } else {
            System.out.println("Invalid input! Please enter a valid major");
        }

        //For statement that reads the second character of the input and determine what year is.
        if (input_year == 49) {
            year = "Freshman";
        } else if (input_year == 50) {
            year = "Sophomore";
        } else if (input_year == 51) {
            year = "Junior";
        } else if (input_year == 52) {
            year = "Senior";
        } else {
            System.out.println("Invalid input!  Please enter a valid year!");
        }
        //Print the results.
        System.out.println(year + " " + major);
    }
}