import java.util.Random;
class NegativeAmountException extends Exception { NegativeAmountException(String msg) { super(msg); } }
class InsufficientFundsException extends Exception { InsufficientFundsException(String msg) { super(msg); } }
class NetworkFailureException extends Exception { NetworkFailureException(String msg) { super(msg); } }
class Transaction {
    void performTransaction() throws NegativeAmountException, InsufficientFundsException, NetworkFailureException {
        int n = new Random().nextInt(3);
        if (n == 0) throw new NegativeAmountException("Transaction failed: Negative amount");
        else if (n == 1) throw new InsufficientFundsException("Transaction failed: Insufficient balance");
        else throw new NetworkFailureException("Transaction failed: Network issue");
    }
    public static void main(String[] args) {
        Transaction t = new Transaction();
        try {
            t.performTransaction();
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println(e.getMessage());
        }
    }
}