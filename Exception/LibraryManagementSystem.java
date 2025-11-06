import java.util.*;
class BookNotAvailableException extends Exception { BookNotAvailableException(String msg) { super(msg); } }
class InvalidReturnException extends Exception { InvalidReturnException(String msg) { super(msg); } }
class UserLimitExceededException extends Exception { UserLimitExceededException(String msg) { super(msg); } }
class LibraryManagementSystem {
    Map<String, Boolean> books = new HashMap<>();
    Map<String, Integer> users = new HashMap<>();
    LibraryManagementSystem() {
        books.put("Java", true);
        books.put("Python", false);
    }
    void borrowBook(String user, String book) throws Exception {
        if (!books.containsKey(book) || !books.get(book)) throw new BookNotAvailableException("Book not available.");
        if (users.getOrDefault(user, 0) >= 5) throw new UserLimitExceededException("User limit exceeded.");
        books.put(book, false);
        users.put(user, users.getOrDefault(user, 0) + 1);
        System.out.println(user + " borrowed " + book);
    }
    void returnBook(String user, String book) throws Exception {
        if (books.get(book)) throw new InvalidReturnException("Book not borrowed.");
        books.put(book, true);
        System.out.println(user + " returned " + book);
    }
    public static void main(String[] args) {
        LibraryManagementSystem l = new LibraryManagementSystem();
        try {
            l.borrowBook("Ankit", "Python");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}