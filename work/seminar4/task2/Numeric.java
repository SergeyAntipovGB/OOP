package work.seminar4.task2;

public class Numeric<T extends Number> {
    
    T num;

    public Numeric(T n) {
        num = n;
    }

    public double reciprocal() {

        return 1 / num.doubleValue();

    } 

    public double fraction() {
        return num.doubleValue() - num.intValue();
    } 
}
