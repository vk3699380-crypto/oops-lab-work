class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.accountHolder = "Ravi";
        b.accountNumber = 12345;
        b.balance = 1000;
        b.deposit(500);
        b.withdraw(300);
        b.displayBalance();
    }
}
