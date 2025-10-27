interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " done using UPI.");
    }
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " done using Credit Card.");
    }
}

class Wallet implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " done using Wallet.");
    }
}

public class digital {
    public static void main(String[] args) {
        Payment p1 = new UPI();
        Payment p2 = new CreditCard();
        Payment p3 = new Wallet();

        p1.pay(500);
        p2.pay(1000);
        p3.pay(300);
    }
}
