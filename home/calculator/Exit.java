package home.calculator;

public class Exit {
    private boolean exitFlag;
       
    public Exit() {
        this.exitFlag = false;
    }

    public void onExit() {
        exitFlag = true;
    }
    
    public boolean isExit() {
        return exitFlag;
    }

}
