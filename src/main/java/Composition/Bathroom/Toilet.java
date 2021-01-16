package Composition.Bathroom;

public class Toilet {
    private int size;
    private int volume;

    public Toilet() {
    }

    public Toilet(int size, int volume) {
        this.size = size;
        this.volume = volume;
    }

    public void flush(){
        System.out.println("Psh-sh-sh");
    }

    public int getSize() {
        return size;
    }

    public int getVolume() {
        return volume;
    }
}
