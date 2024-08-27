import java.util.Date;
//Account Class
public class Account {
    //Set Classes variables and their defaults
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated = new Date();

    //Accessor and mutators for the id, balance, and annualInterestRate.
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate / 100;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    //Accessor for dateCreated.
    public Date getDateCreated(){
        return dateCreated;
    }

    //Functions to return the monthly interest rate and the monthly interest.
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }
    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }

    //Functions to enable withdraws and deposits.
    public void withdraw(int w){
        balance =- w;
    }
    public void deposit(int d){
        balance += d;
    }

}
