package software.reuse;

public class JazzCashPayment implements PaymentMethod {
    private final String mobileNumber;
    private double balance;

    public JazzCashPayment(String mobileNumber, double balance) {
        this.mobileNumber = mobileNumber;
        this.balance = balance;
    }

    @Override
    public boolean pay(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("JazzCash (" + mobileNumber + "): payment failed. Balance: Rs. " + balance);
            return false;
        }
        balance -= amount;
        System.out.println("Paid Rs. " + amount + " using JazzCash " + mobileNumber
                + " (remaining: Rs. " + balance + ")");
        return true;
    }
}