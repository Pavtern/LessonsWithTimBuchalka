package Composition.Bathroom;

public class Sink {
    private int size;

    public Sink() {
    }

    public Sink(int size) {
        this.size = size;
    }

    public void waterOn(){
        System.out.println("Water flows...");
    }

    public void waterOff(){
        System.out.println("Water no longer flows.");
    }
}
