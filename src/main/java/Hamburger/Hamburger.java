package Hamburger;

public class Hamburger {
    protected int numberOfAdds = 0;
    protected int price = 5;
    protected String breadRoll;
    protected String meat;
    protected String additionalComponent1;
    protected String additionalComponent2;
    protected String additionalComponent3;
    protected String additionalComponent4;
    protected int priceOfAdditional = 1;

    public void adding(String additionalComponent){
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
        else System.out.println("It's too much!");
    }



    protected int addPrice(){
        numberOfAdds++;
        price += priceOfAdditional;
        return price;
    }

    public Hamburger(String breadRoll, String meat) {
        this.breadRoll = breadRoll;
        this.meat = meat;
    }


    public int getNumberOfAdds() {
        return numberOfAdds;
    }

    public int getPrice() {
        return price;
    }


    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }
}
