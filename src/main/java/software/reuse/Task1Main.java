package software.reuse;

public class Task1Main {
    public static void main(String[] args) {
        System.out.println("--- Cart 1: Credit Card ---");
        EcommerceCart cart1 = new EcommerceCart(new CreditCardPayment("4111-1111-1111-1111"));
        cart1.addItem(1500);
        cart1.addItem(2500);
        System.out.println("Success: " + cart1.checkout());

        System.out.println("\n--- Cart 2: JazzCash ---");
        EcommerceCart cart2 = new EcommerceCart(new JazzCashPayment("0300-1234567", 5000));
        cart2.addItem(3000);
        System.out.println("Success: " + cart2.checkout());

        System.out.println("\n--- Cart 3: JazzCash (insufficient balance) ---");
        EcommerceCart cart3 = new EcommerceCart(new JazzCashPayment("0301-7654321", 1000));
        cart3.addItem(3000);
        System.out.println("Success: " + cart3.checkout());

        System.out.println("\n--- Cart 4: Cash on Delivery (lambda) ---");
        EcommerceCart cart4 = new EcommerceCart(amt -> {
            System.out.println("Cash on Delivery: pay Rs. " + amt + " to the rider.");
            return true;
        });
        cart4.addItem(800);
        System.out.println("Success: " + cart4.checkout());
    }
}