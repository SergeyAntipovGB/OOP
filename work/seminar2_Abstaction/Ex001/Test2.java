package work.seminar2_Abstaction.Ex001;

public class Test2 implements Numeric {
        
    int start;
    int val;

    public Test2() {
        start = 0;
        val = 0;
    }

    @Override
    public int getNext() {
        val += 20;
        return val;
    }

    @Override
    public void reset() {
        start = 10;
        val = 10;        
    }

    @Override
    public void setNum(int x) {
        start = x;
        val = x;
    }

    public void promo() {
        System.out.println("Привет!");
    }
}
