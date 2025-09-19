class Book {
    String title;
    String author;
    double price;
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        Book b = new Book();
        b.title = "Java Programming";
        b.author = "James Gosling";
        b.price = 350.75;
        b.display();
    }
}
