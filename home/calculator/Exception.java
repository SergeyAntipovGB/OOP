package home.calculator;

public class Exception {
    private static boolean FlagIllegalArgument;
    
    public static void openFlag() {
        FlagIllegalArgument = true;
    }

    public static void resetFlag() {
        FlagIllegalArgument = false;
    }

    public static boolean getFlag() {
        return FlagIllegalArgument;
    }

}
