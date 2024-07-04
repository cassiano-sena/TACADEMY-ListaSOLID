public class SavingsAccount extends Account {
    public SavingsAccount(double balance) {
        super(balance);
    }
    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}
