class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(int accNo, String holder, double bal) {
        accountNumber = accNo;
        accountHolder = holder;
        balance = bal;
    }

    public void setBalance(double bal) {
        balance = bal;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int accNo, String holder, double bal) {
        super(accNo, holder, bal);
    }

    void display() {
        System.out.println("Account: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + getBalance());
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101, "Ankit", 50000);
        sa.display();
        sa.setBalance(60000);
        sa.display();
    }
}
