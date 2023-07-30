public class SavingsAccount extends Account{

//    Attributes
    private final double interestRate=0.14;
    double intersetAmount;

//    Encapsulation
    public double getInterestRate() {
        return interestRate;
    }

//    Constructors
    public SavingsAccount(double balance) {
        super(balance);
    }
    public SavingsAccount() {
    }

//    Methods
    public double calculateInterset(){
        intersetAmount = getBalance() * interestRate;
        return intersetAmount;
    }
}
