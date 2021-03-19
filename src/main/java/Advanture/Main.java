package Advanture;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java", null));

        Map<String, Integer> tempExit = new HashMap<>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill", tempExit));


        tempExit = new HashMap<>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring", tempExit));


        tempExit = new HashMap<>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "You are in a valley beside a stream", tempExit));


        tempExit = new HashMap<>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "You are in the forest", tempExit));


        Pattern patternWest = Pattern.compile("WEST");
        Pattern patternEast = Pattern.compile("EAST");
        Pattern patternNorth = Pattern.compile("NORTH");
        Pattern patternSouth = Pattern.compile("SOUTH");
        Pattern patternQuite = Pattern.compile("QUITE");


        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for(String exit: exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();

            Matcher eastMatcher = patternEast.matcher(direction.toUpperCase());
            Matcher westMatcher = patternWest.matcher(direction.toUpperCase());
            Matcher northMatcher = patternNorth.matcher(direction.toUpperCase());
            Matcher southMatcher = patternSouth.matcher(direction.toUpperCase());
            Matcher quiteMatcher = patternQuite.matcher(direction.toUpperCase());

            if(eastMatcher.find()){
                direction = "E";
            }
            if(westMatcher.find()){
                direction = "W";
            }
            if(northMatcher.find()){
                direction = "N";
            }
            if(southMatcher.find()){
                direction = "S";
            }
            if(quiteMatcher.find()){
                direction = "Q";
            }

            if(exits.containsKey(direction)) {
                loc = exits.get(direction);

            } else {
                System.out.println("You cannot go in that direction");
            }
        }

    }
}
