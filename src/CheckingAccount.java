public class CheckingAccount extends Account {
    public CheckingAccount(double balance) {
        super(balance);
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
}
