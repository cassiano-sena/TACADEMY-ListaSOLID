public class PaymentSystem {
    private PaymentMethod paymentMethod;

    public PaymentSystem(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount) {
        paymentMethod.pay(amount);
    }
}
