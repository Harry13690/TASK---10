package task10.Question_4;

public class Account {

    private double balance = 10000.00;
    private int amt;

    //Default Constructor
    public Account(){
    }

    //Constructor with Two Arugments
    public Account(String type, int id) {
    }

    //Function to Withdraw
    public void withdraw(int amt){
        balance = balance - amt;
        System.out.println("Your Balance after Withdraw : " + balance);
    }

    //Function to Deposit
    public void deposit(int amt){
        balance = balance + amt;
        System.out.println("Your Balance after Deposit : " + balance);
    }
}
