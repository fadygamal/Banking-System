public class DepositTransaction extends Transaction{

    @Override
    public void perform_transaction() {
        System.out.print("Deposit ");
        super.perform_transaction();
    }

}
