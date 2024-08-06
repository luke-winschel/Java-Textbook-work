//(Game: Rock, Paper, Scissors)  Write a program that prompts the user to enter a number (Choose Rock, paper, or scissors) and randomly generate a computer input.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input  = new Scanner (System.in);
        //Generates a random number for selection
        int com_selection = (int)(Math.random()*3);

        //Gets user input for selection
        System.out.println("Rock: 0, Paper: 1, Scissors: 2");
        System.out.println("Please enter your selection (0,1,2): ");
        int user_selection = input.nextInt();

        //Conditional statement for possible outcomes
        //Computer selecting rock outcomes.
        //Both pick Rock.  Results in a tie.
        if (com_selection == 0 && user_selection == 0){
            System.out.println("Tie! You both picked: Rock!");
        }
        //Computer selects Rock, user selects Paper.  User wins.
        else if (com_selection == 0 && user_selection == 1) {
            System.out.println("You win!  You picked: Paper and the computer picked: Rock!");
        }
        //Computer selects Rock, user selects Scissors.  User Loses
        else if (com_selection == 0 && user_selection == 2) {
            System.out.println("You lose! You picked: Scissors and the computer picked: Rock!");
        }
        //Computer selecting Paper outcomes
        //Computer selects paper, user selects Rock.  User loses.
        else if (com_selection == 1 && user_selection == 0) {
            System.out.println("You lose! You picked: Rock and the computer picked: Paper!");
        }
        //Computer selects paper, user selects paper.  Results in a tie.
        else if (com_selection == 1 && user_selection == 1) {
            System.out.println("Tie! You both picked: Paper!");
        }
        //Computer selects paper, user selects Scissors.  User wins
        else if (com_selection == 1 && user_selection == 2) {
            System.out.println("You win! You selected: Scissors and the computer selected: Paper!");
        }
        //Outcomes of computer selecting Scissors
        //Computer selects scissors, user selects rock.  User wins
        else if (com_selection == 2 && user_selection == 0) {
            System.out.println("You Win! You selected: Rock and the computer selected: Scissors!");
        }
        //Computer selects scissors, user selects paper.  User loses
        else if (com_selection == 2 && user_selection == 1) {
            System.out.println("You Lose!  You selected: Paper and the computer selected: Scissors!");
        }
        //Computer selects Scissors, user selects scissors.  Results in a tie.
        else if (com_selection == 2 && user_selection == 2) {
            System.out.println("Tie! You both picked: Scissors!");
        }
        //Catches any inputs that are outside the 0 - 2 window
        else if (user_selection > 2 || user_selection < 0) {
            System.out.println("Invalid input! Please try again.");
        }
        //Else error for testing.
        else{
            System.out.println("Error!");
        }

    }
}