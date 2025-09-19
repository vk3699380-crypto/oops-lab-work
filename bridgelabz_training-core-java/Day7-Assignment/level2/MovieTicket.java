class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    void bookTicket(String m, int s, double p) {
        movieName = m;
        seatNumber = s;
        price = p;
    }
    void display() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        MovieTicket t = new MovieTicket();
        t.bookTicket("Inception", 25, 300);
        t.display();
    }
}
