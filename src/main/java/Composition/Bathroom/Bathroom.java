package Composition.Bathroom;

public class Bathroom {
    private int size_m2;
    private Light light;
    private Sink sink;
    private Tub tub;
    private Toilet toilet;


    public Bathroom(int size_m2, Light light, Sink sink, Tub tub, Toilet toilet) {
        this.size_m2 = size_m2;
        this.light = light;
        this.sink = sink;
        this.tub = tub;
        this.toilet = toilet;
    }

    public void morningProgram() {
        if (!light.isPowerON())
            light.powerOnOff();
        tub.takeABath();
        sink.waterOn();
        toilet.flush();
        sink.waterOff();
        light.powerOnOff();
    }

    public int getSize_m2() {
        return size_m2;
    }

    public Light getLight() {
        return light;
    }

    public Sink getSink() {
        return sink;
    }

    public Tub getTub() {
        return tub;
    }

    public Toilet getToilet() {
        return toilet;
    }
}
