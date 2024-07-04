public class Order {
    private double amount;
    private Discount discount;

    public Order(double amount, Discount discount) {
        this.amount = amount;
        this.discount = discount;
    }

    public double calculateFinalAmount() {
        return discount.applyDiscount(amount);
    }
}
