//LSP (Liskov Substitution Principle)
//Implemente uma classe base Conta e subclasses ContaCorrente e ContaPoupanca.
//Assegure-se de que as subclasses podem substituir a classe base sem alterar o
//comportamento esperado.
public abstract class Account {
    protected double balance;
    public Account(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public abstract void withdraw(double amount);
    public double getBalance() {
        return balance;
    }
}