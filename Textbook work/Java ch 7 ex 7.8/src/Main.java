//(Average an Array) Write two overload methods that return the average of an array.  Write a program that prompts the user to enter 10 integers and have the average displayed. Then enter 10 double values and display the average.
import java.util.Scanner;

public class Main {

    //Class for the int array to calculate average.
    public static double intaverage(int[] array) {
        //Establish variables
        int sum = 0;
        int average = 0;
        //For loop that grabs the value of the current index.
        for (int i = 0; i <= array.length - 1; i++) {
            //Adds the value of the current index to the value of sum.
            sum += array[i];
        }
        //Calculate Average.
        average = sum / array.length;
        //Return the value of average.
        System.out.println(average);
        return average;
    }

    //Class for the double array to calculate average.
    public static double doubleaverage(double[] array_2) {
        //Establish variables.
        double sum_2 = 0;
        double average_2 = 0;
        //For loop that grabs the value of the current index.
        for (int i = 0; i <= array_2.length - 1; i++) {
            //Adds the value of the current index to the value of sum.
            sum_2 += array_2[i];
        }
        //Calculate Average.
        average_2 = sum_2 / array_2.length;
        //Return the value of average.
        System.out.println(average_2);
        return average_2;
    }

    public static void main(String[] args) {
        //Establish array variables.
        int[] array = new int[10];
        double[] array_2 = new double [10];
        Scanner input = new Scanner(System.in);
        //Gives user instructions
        System.out.println("Please enter 10 integers: ");
        //For loop that prompts user to enter an integer until the array is full
        for (int a = 0; a <= 9; a++) {
            System.out.println("Please enter an integer: ");
            //Gets the user input and adds it to the array in the index of the loop counter.
            array[a] = input.nextInt();
        }
        //Prints the Average of the array with the integers provided by the user.
        System.out.print("The Average of the first array is: ");
        intaverage(array);

        //Gives user instruction for the second array.
        System.out.println("Please enter 10 double values: ");

        //For loop that prompts user to enter a double until the array is full
        for (int b = 0; b <= 9; b++) {
            System.out.println("Please enter a value: ");
            //Gets the user input and adds it to the array in the index of the loop counter.
            array_2[b] = input.nextDouble();
        }
        //Prints the Average of the array with the doubles provided by the user.
        System.out.print("The Average of the second array is: ");
        doubleaverage(array_2);
    }
}
