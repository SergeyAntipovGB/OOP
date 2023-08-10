package home.calculator;

public class Exception {
    private boolean FlagIllegalArgument;

    public Exception() {
        FlagIllegalArgument = false;
    }
    
    public void openFlag() {
        FlagIllegalArgument = true;
    }
    
    public void resetFlag() {
        FlagIllegalArgument = false;
    }
    
    public boolean getFlag() {
        return FlagIllegalArgument;
    }

}
