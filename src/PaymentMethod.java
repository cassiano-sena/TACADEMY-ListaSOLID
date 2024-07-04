//DIP (Dependency Inversion Principle)
//Sistema de Pagamento: Implemente um sistema de pagamento que depende de
//diferentes métodos de pagamento (cartão de crédito, PayPal).
//Use o princípio DIP para garantir que o sistema dependa de abstrações (interfaces) e
//não de implementações concretas.
public interface PaymentMethod {
    void pay(double amount);
}