package Composition.Bathroom;

public class Tub {
    private int size;
    private int volume;

    public Tub() {
    }

    public Tub(int size, int volume) {
        this.size = size;
        this.volume = volume;
    }

    public void takeABath(){
        System.out.println("The bath is almost ready...");
    }

    public int getSize() {
        return size;
    }

    public int getVolume() {
        return volume;
    }
}
