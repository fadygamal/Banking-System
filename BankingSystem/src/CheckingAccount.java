public class CheckingAccount extends Account{
//    Attributes
    private String checkReceiver;
    private double checkAmount;

//    Encapsulation

    public String getCheckReceiver() {
        return checkReceiver;
    }

    public void setCheckReceiver(String checkReceiver) {
        this.checkReceiver = checkReceiver;
    }

    public double getCheckAmount() {
        return checkAmount;
    }

    public void setCheckAmount(double checkAmount) {
        this.checkAmount = checkAmount;
    }
//    Constructors
    public CheckingAccount(String checkRecever, double checkAmount) {
        this.checkReceiver = checkRecever;
        this.checkAmount = checkAmount;
    }

//    Methods
    public void issueCheck(){
        System.out.println("This check for "+ checkReceiver +" with amount of "+ checkAmount);
    }
}


