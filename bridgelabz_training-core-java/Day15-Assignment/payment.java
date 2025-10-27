interface PaymentProcessor {
    void pay(double amount);

    default void refund(double amount) {
        System.out.println("Refund of Rs." + amount + " initiated (default refund).");
    }
}

class Razorpay implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " done via Razorpay.");
    }
}

class PhonePe implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " done via PhonePe.");
    }
}

public class payment {
    public static void main(String[] args) {
        PaymentProcessor razorpay = new Razorpay();
        PaymentProcessor phonepe = new PhonePe();

        razorpay.pay(800);
        razorpay.refund(200);

        phonepe.pay(1200);
        phonepe.refund(300);
    }
}
