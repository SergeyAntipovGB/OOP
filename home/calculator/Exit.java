package home.calculator;

/** Класс является индикатором для
 * завершения работы программы.
 * Используется в классе Presenter
 */
public class Exit {
    private boolean exitFlag;
    
    /** Конструктор класса
     * 
     */
    public Exit() {
        this.exitFlag = false;
    }

    /* Геттер и сеттер */
    public void onExit() {
        exitFlag = true;
    }
    
    public boolean isExit() {
        return exitFlag;
    }

}
