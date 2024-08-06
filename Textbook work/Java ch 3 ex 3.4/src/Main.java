//(Random Month)  Write a program that randomly generates a number between 1 and 12 and displays the English month name.
public class Main {
    public static void main(String[] args) {
        //Randomly generate a number between one and 12
        int month = (1 + (int)(Math.random()*12));

        //Switch statement that matches the number to the month and displays the number and the month.
        switch(month){
            case 1:
                System.out.println(month + " January!");
                break;
            case 2:
                System.out.println(month + " February!");
                break;
            case 3:
                System.out.println(month + " March!");
                break;
            case 4:
                System.out.println(month + " April!");
                break;
            case 5:
                System.out.println(month + " May!");
                break;
            case 6:
                System.out.println(month + " June!");
                break;
            case 7:
                System.out.println(month + " July!");
                break;
            case 8:
                System.out.println(month + " August!");
                break;
            case 9:
                System.out.println(month + " September!");
                break;
            case 10:
                System.out.println(month + " October!");
                break;
            case 11:
                System.out.println(month + " November!");
                break;
            case 12:
                System.out.println(month + " December!");
                break;
            //Default error for testing
            default:
                System.out.println("Error!");
                break;
        }
    }
}