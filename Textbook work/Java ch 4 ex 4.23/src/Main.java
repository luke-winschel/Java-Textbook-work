//(Financial Application: payroll)  Write a program that reads Name, Hours worked, hourly rate, Federal tax withholding, state tax withholding and prints a payroll statement.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Gets user input for the employee name.
        System.out.println("Please enter the workers name: ");
        String Name = input.next();

        //Gets user input for number of hours the employee worked.
        System.out.println("Please enter the number of hours the employee worked: ");
        double hours = input.nextDouble();

        //Gets user input for the employee's hourly wage.
        System.out.println("Please enter the employees hourly wage: ");
        double wage = input.nextDouble();

        //Gets user input for the Federal Tax withholding rate.
        System.out.println("Enter the Federal tax withholding rate: ");
        double fed_tax = input.nextDouble();

        //Gets user input for the State Tax withholding rate.
        System.out.println("Please enter the State tax withholding rate: ");
        double state_tax = input.nextDouble();

        //Calculates gross pay
        double gross_pay = hours * wage;

        //Calculates fed and state withholding's
        double fed_withholding = gross_pay * fed_tax;
        double state_withholding = gross_pay * state_tax;

        //Converts decimals into the percentages for the printout.
        double fed_rate = fed_tax * 100;
        double state_rate = state_tax * 100;

        //Calculates total deductions.
        double total_deductions = state_withholding + fed_withholding;

        //Calculates the net pay
        double net_pay = gross_pay - total_deductions;

        //Print out of each line with all the pay information.
        System.out.println("Employee Name: " + Name);
        System.out.println("Hours worked: " + hours);
        System.out.println("Pay Rate: $" + wage);
        System.out.println("Gross Pay: $" + String.format("%.2f", gross_pay));
        System.out.println("Deductions:");
        System.out.println('\t' + "Federal Withholding (" + fed_rate + "%): $" + String.format("%.2f",fed_withholding));
        System.out.println('\t' + "State Withholding (" + state_rate + "%): $" + String.format("%.2f", state_withholding));
        System.out.println('\t' + "Total deductions: $" + String.format("%.2f", total_deductions));
        System.out.println("Net pay: $" + String.format("%.2f", net_pay));
    }
}