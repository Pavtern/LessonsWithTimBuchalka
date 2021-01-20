package Hamburger;

public class HealthyHamburger extends Hamburger{
    private int price = 7;
    private String additionalComponent5;
    private String additionalComponent6;
    public HealthyHamburger(String meat) {
        super("Brown rye bread roll", meat);
    }

    @Override
    protected int addPrice() {
        numberOfAdds++;
        price += priceOfAdditional;
        return price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void adding(String additionalComponent) {
        if(additionalComponent1 == null){
            this.additionalComponent1 = additionalComponent;
            addPrice();}
        else if(additionalComponent2 == null){
            this.additionalComponent2 = additionalComponent;
            addPrice();}
        else if(additionalComponent3 == null){
            this.additionalComponent3 = additionalComponent;
            addPrice();}
        else if(additionalComponent4 == null){
            this.additionalComponent4 = additionalComponent;
            addPrice();}
        else if(additionalComponent5 == null){
            this.additionalComponent5 = additionalComponent;
            addPrice();}
        else if(additionalComponent6 == null){
            this.additionalComponent6 = additionalComponent;
            addPrice();}
        else System.out.println("It's too much!");
    }
}
