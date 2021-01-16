package SimpleClass;

public class Outlander extends Car {
    private int roadServiceMonth;

    public Outlander(int roadServiceMonth) {
        super("Outlander", "4WD", 5, 4, 5, false);
        this.roadServiceMonth = roadServiceMonth;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity <= 0) stop();
        else if (newVelocity <= 10) changeGear(1);
        else if (newVelocity <= 20) changeGear(2);
        else if (newVelocity <= 30) changeGear(3);
        else if (newVelocity <= 40) changeGear(4);
        else changeGear(5);

        if(newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }

}
