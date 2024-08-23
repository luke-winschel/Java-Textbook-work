//Write a program that repeatedly prompts the user to enter a capital for a state.  Upon receiving the user input, the program reports whether the answer is correct
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Set Scanner Attribute to allow inputs to be used
        Scanner input = new Scanner(System.in);
        int correct_counter = 0;
        //Create new array where left column is the State and the right column is the Capital.
        String[][] state_and_capital =
                {{"Alabama", "Montgomery"},
                {"Alaska", "Juneau"},
                {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"},
                {"California", "Sacramento"},
                {"Colorado", "Denver"},
                {"Connecticut", "Hartford"},
                {"Delaware", "Dover"},
                {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"},
                {"Hawaii", "Honolulu"},
                {"Idaho", "Boise"},
                {"Illinois", "Springfield"},
                {"Indiana", "Indianapolis"},
                {"Iowa", "Des Moines"},
                {"Kansas", "Topeka"},
                {"Kentucky", "Frankfort"},
                {"Louisiana", "Baton Rouge"},
                {"Maine", "Augusta"},
                {"Maryland", " Annapolis"},
                {"Massachusetts", "Boston"},
                {"Michigan", "Lansing"},
                {"Minnesota", "Saint Paul"},
                {"Mississippi", "Jackson"},
                {"Missouri", "Jefferson City"},
                {"Montana", "Helena"},
                {"Nebraska", "Lincoln"},
                {"Nevada", "Carson City"},
                {"New Hampshire", "Concord"},
                {"New Jersey", " Trenton"},
                {"New Mexico", "Santa Fe"},
                {"New York", "Albany"},
                {"North Carolina", "Raleigh"},
                {"North Dakota", "Bismark"},
                {"Ohio", "Columbus"},
                {"Oklahoma", "Oklahoma City"},
                {"Oregon", "Salem"},
                {"Pennsylvania", "Harrisburg"},
                {"Rhode Island", "Providence"},
                {"South Carolina", "Columbia"},
                {"South Dakota", "Pierre"},
                {"Tennessee", "Nashville"},
                {"Texas", "Austin"},
                {"Utah", "Salt Lake City"},
                {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"},
                {"Washington", "Olympia"},
                {"West Virginia", "Charleston"},
                {"Wisconsin", "Madison"},
                {"Wyoming", "Cheyenne"} };
        //For loop that counts through the array
        for (int i = 0; i < state_and_capital.length; i++){
            //Prints the prompt for the user to enter the capital for the corresponding state.
            System.out.println("Current Number Correct: " + correct_counter);
            System.out.println("What is the capital of " + state_and_capital[i][0]);
                //Gets the users input.
                String answer = input.nextLine();
            //If statement that determines if the user's answer matches the value in the corresponding capital column
            if (Objects.equals(answer, state_and_capital[i][1])){
                //If correct, print that the users answer is correct.
                System.out.println("Correct!");
                correct_counter += 1;
            }else{
                //If the answer doesn't match the capital column, print that the user is incorrect and what the capital of the current state is.
                System.out.println("Incorrect!  The capital of " + state_and_capital[i][0] + " is " + state_and_capital[i][1]);
            }
        }
    }
}
