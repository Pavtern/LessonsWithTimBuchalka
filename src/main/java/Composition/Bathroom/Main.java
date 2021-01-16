package Composition.Bathroom;

public class Main {
    public static void main(String[] args) {
        Tub tub = new Tub();
        Toilet toilet = new Toilet();
        Sink sink = new Sink();
        Light light = new Light();
        Bathroom bathroom = new Bathroom(23,light,sink,tub,toilet);
        bathroom.morningProgram();
        System.out.println();
        bathroom.morningProgram();
        System.out.println();
        bathroom.morningProgram();
    }
}
