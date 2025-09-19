class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String isbn, String t, String a) {
        ISBN = isbn;
        title = t;
        author = a;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    EBook(String isbn, String t, String a) {
        super(isbn, t, a);
    }

    void display() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor());
    }

    public static void main(String[] args) {
        EBook eb = new EBook("12345", "Java Guide", "James Gosling");
        eb.display();
    }
}
