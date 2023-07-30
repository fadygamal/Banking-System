public class BankAccount {

//    Attributes
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    //    Encapsulation
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

//    Constructions
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public BankAccount() {
    }

//    Methods
    public void deposit(double money) {
         balance += money;
    }

    public void withdraw(double money) {
        if (balance >= money) {
            balance -= money;
        } else {
            System.out.println("Error!");
        }
    }


}
