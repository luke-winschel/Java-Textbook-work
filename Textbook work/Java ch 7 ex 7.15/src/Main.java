//(Eliminate duplicates) Write a method that returns a new array by eliminating duplicate values in the array.
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    //Method that takes array from user input and sorts out the duplicates returning another array of unique values.
    public static int[] eliminateDuplicates(int[] list) {
        //Sorts the array in smallest to largest values.
        Arrays.sort(list);
        //Establish counters variable
        int counter = 0;
        //For loop that cycles through the array from 0.
        for (int i = 0; i < list.length; i++) {
            //Establish variable that stores the value of the currently indexed item.
            int index = list[i];
            //Nested loop that starts from 1 and reads the value of the array.
            for (int j = i + 1; j < list.length; j++) {
                //Establish variable that stores the value of the currently indexed item in the second loop.
                int index2 = list[j];
                //Conditionals statement that checks if the values of both indexed items are the same.
                if (index == index2) {
                    //If both items are equal then the variable counter goes up by one and the block jumps out of the nested loop.
                    counter += 1;
                    break;
                }
            }
        }
        //Establish another counter variable for indexing into a new array.
        int loop_counter = 0;
        //Establish a new array varibale to store the unique values.
        int[] unique = new int[list.length - counter];
        //For loop that cycles through the array from 0.
        for (int a = 0; a < list.length; a++) {
            //Establish a boolean variable that determines if an indexed item is a duplicate.
            //This variable will reset on every count of the outer loop.
            boolean duplicate = false;
            //Establish variable that stores the value of the currently indexed item.
            int current = list[a];
            //Nested loop that starts from 1 and reads the value of the array.
            for (int b = a + 1; b < list.length; b++) {
                //Establish variable that stores the value of the currently indexed item in the second loop.
                int current2 = list[b];
                //Conditional statement that determines if the two indexed items match.
                if (current == current2) {
                    //If the two indexed items are equal, then the variable 'duplicate' becomes true.
                    duplicate = true;
                }
            }
            //Conditional Statement that checks the value of the duplicate variable at the end of the outer loop.
            if (!duplicate){
                //If the value of duplicate is false, then the value is inserted into the array at the position of the value of the loop_counter variable.
                unique[loop_counter] = list[a];
                //loop_counter variable plus 1 to ensure variables are placed properly in the array.
                loop_counter += 1;
            }
        }
        //Return the array of unique values.
        System.out.println(Arrays.toString(unique));
        return unique;
    }

    //Main Method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Establish new array variable
        int [] list = new int [10];

        //For loop that prompts the user for input and adds the input to the array.
        for (int i = 0; i < list.length; i++){
            System.out.println("Please enter a number: ");
            list [i] =  input.nextInt();
        }
        //Call the method to remove duplicates.
     eliminateDuplicates(list);
    }
}