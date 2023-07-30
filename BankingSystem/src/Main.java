import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Account info
        BankAccount ba = new BankAccount(123,"Ramy",500);
        System.out.println("Account Number: "+ba.getAccountNumber()+" Name: "+ba.getAccountHolderName()+" Balance: "+ba.getBalance());

//        Deposit
        ba.deposit(2000);
        System.out.println("New balance "+ba.getBalance());

//        Withdraw
        ba.withdraw(500);
        System.out.println("New balance "+ba.getBalance());

//        Account Details
        Account a = new Account(123,"Rami",2000,"Male",20,"Primmer");
        a.accountDetails();

//        Interest
        SavingsAccount s = new SavingsAccount(200);
        System.out.println(s.calculateInterset());

//        issuing Checks
        CheckingAccount c = new CheckingAccount("Ahmed",200);
        c.issueCheck();

//        Deposit Transaction
        DepositTransaction dt=new DepositTransaction();
        dt.perform_transaction();

//        Withdraw Transaction
        WithdrawTransaction wt = new WithdrawTransaction();
        wt.perform_transaction();

//        Banking System
        Bank b2 = new Bank();
        b2.creating_accounts();
        b2.depositing();
        b2.viewing_balance();
        b2.withdrawing_money();
    }








    }
