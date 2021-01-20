package Hamburger;

public class DeluxeHamburger extends Hamburger{


    public DeluxeHamburger(String breadRoll, String meat) {
        super(breadRoll, meat);
        addTheStandard();
    }

    private void addTheStandard(){
        additionalComponent1 = "Cola";
        additionalComponent2 = "Cheeps";
        numberOfAdds = 2;
    }

    @Override
    public void adding(String additionalComponent) {
        System.out.println("Adding is unavailable");
    }
}
