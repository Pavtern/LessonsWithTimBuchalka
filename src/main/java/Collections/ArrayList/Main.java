package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Fake", 8, 12);
        List<Theatre.Seat> seats = new ArrayList<>(theatre.getSeats());
        Collections.sort(seats, Theatre.PRICE_ORDER);
        printList(seats);

    }

    public static void printList(List<Theatre.Seat> list){
        double price = 7;
        for(Theatre.Seat seat : list){
            if(price < seat.getPrice()){
                price = seat.getPrice();
                System.out.println();
            }
            System.out.print(" " + seat.getSeatNumber() + " "+ seat.getPrice() + "$");
        }
        System.out.println();
        System.out.println("=================================================================================");
    }


}
