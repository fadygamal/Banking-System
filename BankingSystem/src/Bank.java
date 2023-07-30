public class Bank implements BankingSystem{
    @Override
    public void creating_accounts() {
        System.out.println("The account created successfully");
    }

    @Override
    public void depositing() {
        System.out.println("Depositing done successfully");
    }

    @Override
    public void withdrawing_money() {
        System.out.println("withdrawing done successfully");
    }

    @Override
    public void viewing_balance() {
        System.out.println("The balance: 200");
    }
}
