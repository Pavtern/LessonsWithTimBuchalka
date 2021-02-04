package Interfaces;

public class Gearbox {
    private boolean clutchIsIn;

    public void operateClutch(String inOrOut){
        clutchIsIn = inOrOut.equalsIgnoreCase("in");
    }
}
