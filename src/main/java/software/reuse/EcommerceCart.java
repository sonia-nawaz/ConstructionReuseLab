package software.reuse;

import java.util.ArrayList;
import java.util.List;

public class EcommerceCart {
    private final PaymentMethod paymentMethod;
    private final List<Double> items = new ArrayList<>();

    public EcommerceCart(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void addItem(double price) {
        items.add(price);
    }

    public double getTotal() {
        double total = 0;
        for (double p : items) total += p;
        return total;
    }

    public boolean checkout() {
        double total = getTotal();
        System.out.println("Checking out. Total = Rs. " + total);
        return paymentMethod.pay(total);
    }
}