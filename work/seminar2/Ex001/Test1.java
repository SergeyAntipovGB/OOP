package work.seminar2.Ex001;

public class Test1 implements Numeric {
    
    int start;
    int val;

    public Test1() {
        start = 0;
        val = 0;
    }

    @Override
    public int getNext() {
        val += 2;
        return val;
    }

    @Override
    public void reset() {
        start = 0;
        val = 0;        
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
