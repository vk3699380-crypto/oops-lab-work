class InsufficientFundsException extends Exception {
    InsufficientFundsException(String msg) { super(msg); }
}
class ATM {
    private int balance = 10000;
    void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) throw new InsufficientFundsException("Insufficient funds: Balance is ₹" + balance);
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: ₹" + balance);
    }
    public static void main(String[] args) {
        ATM atm = new ATM();
        try {
            atm.withdraw(12000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}