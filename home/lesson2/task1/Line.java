package home.lesson2.task1;

public class Line {
    double width;

    public double getWidth() {
        return width;
    }

    // Вызов публичного поля интерфейса Stateble
    public void setWidth() {
        this.width = Stateble.WIDTHSTATIC;
    }
}
