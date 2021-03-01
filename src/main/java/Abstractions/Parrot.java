package Abstractions;

public class Parrot extends Bird implements CanFly {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Yes, I'm flying!");
    }
}
