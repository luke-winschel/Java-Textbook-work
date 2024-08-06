//(Conversion from kilograms to pounds)  Write a program that displays a table of kilograms to pounds conversion table.
public class Main {
    public static void main(String[] args) {
        //Prints the headers
        System.out.println("Kilograms:" + '\t' + "Pounds:");
        //For loop that prints the kilos in increments of one and prints the corresponding number of pounds
        for (int i = 1; i <=200; i++){
            int kilos = i;
            double pounds = kilos * 2.2;
            System.out.print(i);
            System.out.println("\t\t\t" + String.format("%.1f",pounds));
        }
    }
}