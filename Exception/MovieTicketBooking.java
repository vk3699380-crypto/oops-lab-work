import java.util.*;
class InvalidSeatException extends Exception { InvalidSeatException(String msg) { super(msg); } }
class SeatAlreadyBookedException extends Exception { SeatAlreadyBookedException(String msg) { super(msg); } }
class MovieTicketBooking {
    Map<Integer, Boolean> seats = new HashMap<>();
    MovieTicketBooking() {
        for (int i = 1; i <= 5; i++) seats.put(i, false);
    }
    void bookSeat(int seat) throws InvalidSeatException, SeatAlreadyBookedException {
        if (!seats.containsKey(seat)) throw new InvalidSeatException("Invalid seat number");
        if (seats.get(seat)) throw new SeatAlreadyBookedException("Seat already booked");
        seats.put(seat, true);
        System.out.println("Seat " + seat + " booked successfully");
    }
    public static void main(String[] args) {
        MovieTicketBooking m = new MovieTicketBooking();
        try {
            m.bookSeat(2);
            m.bookSeat(2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}