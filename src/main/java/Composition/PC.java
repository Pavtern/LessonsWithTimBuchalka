package Composition;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        System.out.println("Logo");
    }

    public void showToScreen(int x, int y, String color){
        monitor.drawPixAt(x, y, color);
    }

    public void runWindows(){
        motherboard.loadProgram("Windows");
    }
    public void runProgram(String programName){
        motherboard.loadProgram(programName);
    }
}

