package Composition.Bathroom;

public class Light {
    private int powerWT;
    private boolean powerON = false;

    public Light() {
    }

    public Light(int powerWT) {
        this.powerWT = powerWT;
    }

    public void powerOnOff(){
        if(powerON){
            System.out.println("Light turns off...");
            powerON = false;
        }else{
            System.out.println("Light turns on...");
            powerON = true;
        }
    }

    public boolean isPowerON() {
        return powerON;
    }

    public int getPowerWT() {
        return powerWT;
    }
}
