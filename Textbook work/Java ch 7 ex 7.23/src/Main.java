// (Game: locker puzzle) A school has 100 lockers and 100 students. All lockers are closed on the first day of school.
//As the students enter, the first student, denoted S1, opens every locker. Then the second student, S2, begins with the second locker,
// denoted L2, and closes every other locker.  Student S3 begins with the third locker and changes every third locker (closes it if it was open,
//and opens it if it was closed). Student S4 begins with locker L4 and changes every fourth locker. Student S5 starts with L5 and changes every
// fifth locker, and so on, until student S100 changes L100.
// After all the students have passed through the building and changed the lockers, which lockers are open? Write a program to find your answer
// and display all open locker numbers separated by exactly one space. (Hint: Use an array of 100 Boolean elements, each of which indicates
// whether a locker is open (true) or closed (false). Initially, all lockers are closed.)
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //Establish array to store the open locker numbers.
        int open [] = new int[10];
        //Establish variables for the number of open and closed lockers
        int open_counter = 0;
        int closed_counter = 0;
        //Boolean array that stores the true (open) or false (closed) value.
        boolean lockers [] = new boolean[101];

        //Initializing array, by setting all lockers to closed
        for (int i = 0; i < 100; i++){
            lockers [i] = false;
        }
        //First student opens every locker
        for (int s1 = 0; s1 <= 100; s1++){
            lockers [s1] = true;
        }
        //Second student closes every other locker starting with locker number 2
        for(int s2 = 1; s2 < 100; s2 += 2){
            lockers[s2] = false;
        }

        //Third - one hundredth student changes every nth locker
        //Nested loops that dictate which student and which lockers are being manipulated.
        //Outer loop for gap between lockers and counter for which student.
        for(int counter = 3; counter <= 100; counter++) {
            //Inner loop does the locker manipulating
            for (int student = counter - 1 ; student < 100; student += counter) {
                //Conditional statements for locker manipulation.
                //If the locker is closed, then the student is to open it
                if (lockers[student] == false) {
                    lockers[student] = true;
                //If the locker is open, then the student is to close it.
                } else if (lockers[student] == true) {
                    lockers[student] = false;
                //Else statement with error for testing
                } else {
                    System.out.println("Error!");
                    break;
                }
            }
        }
        //Loop that counts the number of lockers that are open and closed
        for (int z = 0; z < 100; z++){
            //If the indexed value of the array returns true (open), then the open counter adds one.
            if (lockers[z] == true){
                open[open_counter] = (z + 1);
                open_counter += 1;
            }
            //If the indexed value of the array returns false (closed), then the closed counters adds one.
            else if (lockers[z] == false){
                closed_counter += 1;
            }
            //Else statement that returns error for testing.
            else{
                System.out.println("Error!");
            }
        }
        //Final print statements that give us the resutls
        System.out.println("There are: " + open_counter + " lockers open and " + closed_counter + " lockers closed.");
        //Print Statement with for loop that lists the locker numbers that finished opened.
        System.out.println("The open lockers are: ");
        for (int j = 0; j < open.length; j++){
            System.out.println("L" + open[j]);
        }
    }
}