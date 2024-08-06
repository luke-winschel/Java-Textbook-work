public class JavaCh6Ex69 {
    //Class to convert feet to meters by passing the values of foot to the class
    public static double footToMeter (double foot){
        //Calculation for conversion of feet to meters
        double meter = 0.305 * foot;
        //Return the value of the calculation
        return meter;
    }
    //Class to convers meters to feet by passing the values of meters to the class
    public static double meterToFoot (double meter){
        //Calculation for conversion of meters to feet
        double foot = 3.279 * meter;
        //Returns the value of the calculation
        return foot;
    }
    //Main class
    public static void main(String[] args) {
        //Prints header
        System.out.println("Feet:" + "\t" + "Meters:");
        //For loop that counts by one for the feet and passes the value of the counter through the foot to meters class.
        for (double i = 1; i <= 10; i++){
            System.out.println(i + " \t" + footToMeter(i));
        }
        //Print line for space between the tables
        System.out.println();
        //Prints header
        System.out.println("Meters:" + "\t" + "Feet:");
        //For loop that counts by five for the meters and passes the value of the counter through the meters to foot class.
        for (double j = 20; j <=65; j+=5){
            System.out.println(j + " \t" + meterToFoot(j));
        }
    }
    
}
