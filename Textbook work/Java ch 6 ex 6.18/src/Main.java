//(Check Password) Write a method that checks whether a string is a valid password.  The password must contain at least 8 characters, only contain letters and numbers, and contain at least 2 digits.
import java.util.Scanner;
public class Main {
    //Class that checks and validates that the password requirements are met.
    public static void checkPassword (String password) {
        //Establish variables.
        int length = password.length();
        int digit_counter = 0;
        //First conditional checks the length of the password.
        //If the password is less than 8 characters it is invalid, otherwise it continues.

        if (length < 8) {
            System.out.println("Invalid Password!");

        //Second condition checks that the password contains only letters and numbers.
        //If a character is not a letter or digit the password is invalid.
        } else {
            //For loop that grabs the indexed value and checks if it is a letter or digit.
            for (int i = 0; i <= length - 1; i++) {
                //Establish Variables
                char index = password.charAt(i);
                //Convert to boolean for conditional statements.
                boolean value = Character.isLetterOrDigit(index);

                //Conditional statement that checks the indexed value.  If the assignment of 'value' is false the password is invalid.
                if (!value) {
                    System.out.println("Invalid Password!");
                    break;
                //Third condition checks that the password contains at least 2 digits.
                //If the password doesn't contain two digits the password is invalid.
                } else {
                    //For loop that grabs the indexes value and checks if it is a digit
                    for (int j = 0; j <= length - 1; j++) {
                        char find_digit = password.charAt(j);
                        boolean digit = Character.isDigit(find_digit);
                        //Conditional statement that checks the indexed value.  If the assignment of 'digit' is True, then the counter adds one to its self.
                        if (digit) {
                            digit_counter += 1;
                        }
                    }
                }
            }
            //Final conditional statement.
            //If the value of 'digit_counter' is greater than or equal to 2, then the password is valid.
            if (digit_counter >= 2){
                System.out.println("Valid Password!");
            }
            //If the value of 'digit_counter' is less than 2 then the password is invalid.
            else{
                System.out.println("Invalid Password!");
            }
        }
    }
    //Main Class
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //Prompts the user to enter a password to test.
        System.out.println("Please enter a password: ");
        String password = input.next();

        //Calls the checkPassword class to validate the password entered.
        checkPassword(password);
    }
}