package Collections.ArrayList;

import java.util.*;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
        @Override
        public int compare(Seat seat1, Seat seat2) {
            return Double.compare(seat1.getPrice(), seat2.getPrice());
        }
    };


    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' +(numRows - 1);

        for (char row = 'A'; row <= lastRow; row++){
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++){
                double price = 12;
                if(row < 'D' && seatNum >= 4 && seatNum <= 9){
                    price = 14;
                } else if(row > 'F' || (seatNum < 4 || seatNum > 9 )){
                    price = 7;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber, 0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat);
        if(foundSeat >= 0){
            return seats.get(foundSeat).reserve();
        }
        System.out.println("There is no seat "+ seatNumber);
        return false;
    }

    public Collection<Seat> getSeats(){
        return seats;
        }


    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved = false;
        private double price;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        public boolean reserve(){
            if (!reserved) {
                reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
            }
            return false;
        }

        public boolean cancel(){
            if(reserved){
                reserved = false;
                System.out.println("Reservation of seat "+ seatNumber + " is canceled");
                return true;
            }
            System.out.println("Seat is already free");
            return true;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public int compareTo(Seat seat) {
            return seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }
    }
}
