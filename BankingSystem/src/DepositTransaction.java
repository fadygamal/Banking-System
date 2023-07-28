public class DepositTransaction extends Transaction{

    @Override
    public void perform_transaction() {
        System.out.println("Deposit transaction done successfully");
    }
}
