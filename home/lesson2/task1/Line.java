package home.lesson2.task1;

public abstract class Line {
    protected double width;

    public double getWidth() {
        return width;
    }
    
    /**
     * Вызов публичного поля интерфейса Stateble
     */
    public void setWidth() {
        this.width = Stateble.WIDTHSTATIC;
    }
}
