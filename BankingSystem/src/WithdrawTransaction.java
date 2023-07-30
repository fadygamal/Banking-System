public class WithdrawTransaction extends Transaction{
    @Override
    public void perform_transaction() {
        System.out.print("Withdraw ");
        super.perform_transaction();
    }
}
