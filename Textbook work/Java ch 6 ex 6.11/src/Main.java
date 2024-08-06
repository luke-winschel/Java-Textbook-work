//(Financial application: compute commissions) Write a method that computes the commission and prints as a table.
public class Main {
    //Class that computes the base calculation for commission.
    public static double computeCommission (double salesAmount){
        //Sales amount divided by ten gives a baseline for our final amount.
        double commission = salesAmount * 0.10;
        //Return the value of commission.
        return commission;
    }
    //Main Class
    public static void main(String[] args) {
        //Establish Variable that will help determine commission
        int j = -100;
        //Print Headers
        System.out.println("Sales Amount: " + " \t " + "Commission");
        //For loop that counts by 5000 and prints the sales amount and the commission.
        for (int i = 10000; i <= 100000; i+=5000){
                //Gets the values of the counter and passes through the computer commission class and stores in the variable 'a'.
                double a = computeCommission(i);
                //Prints the counter value and the sum of values 'a' and 'j'
                System.out.println(i + "\t         " + (a+j));
                //For each cycle through the loop the value of 'j' goes up by 100.
                j += 100;
            }
        }
    }
