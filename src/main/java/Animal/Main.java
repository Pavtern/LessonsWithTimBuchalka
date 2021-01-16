package Animal;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bobic", 12, 12, 2, 4, 1, 21, "Go");

        dog1.eat();
        dog1.walking();
        dog1.running();
        dog1.no();

//        House blueHouse = new House("blue");
//        House greenHouse = new House("green");
//        blueHouse = greenHouse;
//        System.out.println(blueHouse.getColor());
//        blueHouse.setColor("blue");
//        greenHouse.setColor("green");
//        System.out.println(blueHouse.getColor());
//        System.out.println(greenHouse.getColor());
    }
}
