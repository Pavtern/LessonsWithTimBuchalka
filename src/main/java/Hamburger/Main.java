package Hamburger;

public class Main {

    public static void main(String[] args) {
        HealthyHamburger healthyHamburger = new HealthyHamburger("Chicken");
        System.out.println(healthyHamburger.getPrice());
        healthyHamburger.adding("Cheese");
        System.out.println(healthyHamburger.getNumberOfAdds());
        healthyHamburger.adding("Cheese");
        healthyHamburger.adding("Cheese");
        healthyHamburger.adding("Cheese");
        healthyHamburger.adding("Cheese");
        healthyHamburger.adding("Cheese");
        System.out.println(healthyHamburger.getNumberOfAdds());
        System.out.println(healthyHamburger.getPrice());
        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("Hot", "Beef");
        deluxeHamburger.adding("Cheese");
        System.out.println(deluxeHamburger.getNumberOfAdds());
        System.out.println(deluxeHamburger.getPrice());


    }
}
