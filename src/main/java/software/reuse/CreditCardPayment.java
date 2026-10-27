package software.reuse;

public class CreditCardPayment implements PaymentMethod {
    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean pay(double amount) {
        if (amount <= 0) {
            System.out.println("Credit Card: invalid amount.");
            return false;
        }
        System.out.println("Paid Rs. " + amount + " using Credit Card " + cardNumber);
        return true;
    }
}