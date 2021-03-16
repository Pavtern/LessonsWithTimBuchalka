package Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();


    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' +(numRows - 1);
        char a = 65;

        for (char row = 'A'; row <= lastRow; row++){
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++){
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = null;
        for (Seat seat: seats){
            if(seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }
         if (requestedSeat == null){
             System.out.println("There is no seat " + seatNumber);
             return false;
         }
        return requestedSeat.reserve();
    }

    public void getSeats(){
        for(Seat seat: seats){
            System.out.println(seat.getSeatNumber());
        }
    }

    private class Seat{
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
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
    }
}
