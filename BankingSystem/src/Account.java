public class Account extends BankAccount{

//    Attributes
    private String gender;
    private int age;
    private String typeOfAccount;

    //    Encapsulation
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTypeOfAccount() {
        return typeOfAccount;
    }

    public void setTypeOfAccount(String typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }

//    Constructors
    public Account(int accountNumber, String accountHolderName, double balance, String gender, int age, String typeOfAccount) {
        super(accountNumber, accountHolderName, balance);
        this.gender = gender;
        this.age = age;
        this.typeOfAccount = typeOfAccount;
    }

    public Account(double balance) {
        super(balance);
    }

    public Account() {
    }

//    Methods
    public void accountDetails(){

        System.out.println("Your account details: "+"Account Number: "+getAccountNumber()+" Account Holder name: "+getAccountHolderName()+" Balance: "+getBalance()+" Gender: "+gender+" Age: "+age+" Account Type: "+typeOfAccount);

    }
}
