public class CheckingAccount extends Account{
//    Attributes
    private String checkRecever;
    private double checkAmount;

//    Encapsulation

    public String getCheckRecever() {
        return checkRecever;
    }

    public void setCheckRecever(String checkRecever) {
        this.checkRecever = checkRecever;
    }

    public double getCheckAmount() {
        return checkAmount;
    }

    public void setCheckAmount(double checkAmount) {
        this.checkAmount = checkAmount;
    }
//    Constructors
    public CheckingAccount(String checkRecever, double checkAmount) {
        this.checkRecever = checkRecever;
        this.checkAmount = checkAmount;
    }

//    Methods
    public void issueCheck(){
        System.out.println("This check for "+checkRecever+" with amount of "+ checkAmount);
    }
}


