//(The account Class) Design a class named account.  Write a program that creates an Account object with an account ID.  Use the withdraw and deposit methods, and display the account balance, interest, and date created.
//Main Class
public class Main {
    public static void main(String[] args) {
        //Create new account
        Account account1 = new Account();
        //Set account ID, Balance, and Annual Interest Rate
        account1.setId(1122);
        account1.setBalance(20000);
        account1.setAnnualInterestRate(4.5);
        //Call the withdraw function, withdrawing $25000
        account1.withdraw(2500);
        //Call deposit function, depositing $3000
        account1.deposit(3000);

        //Print out the account ID, Date Created, Monthly interest rate, and the account balance.
        System.out.println("Account number: " + account1.getId() + " opened on: " + account1.getDateCreated());
        System.out.println("The monthly interest on account number: " + account1.getId() + " is " + account1.getMonthlyInterestRate() +"%");
        System.out.println("Account Balance: $" + account1.getBalance());
    }
}