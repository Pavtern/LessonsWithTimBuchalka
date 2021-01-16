package SimpleClass;

public class Main {
    public static void main(String[] args) {
        Outlander outlander = new Outlander(3);
        outlander.changeVelocity(12,15);
        System.out.println(outlander.getCurrentGear());
        outlander.accelerate(20);
        System.out.println(outlander.getCurrentGear());
        outlander.accelerate(-20);
        System.out.println(outlander.getCurrentGear());
    }
}
