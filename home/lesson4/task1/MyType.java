package home.lesson4.task1;

public class MyType<MT> {
    
    MT mt;

    public MyType(MT obj) {
        mt = obj;
    }

    public MT getMt() {
        return mt;
    }

    public void showType() {
        System.out.println("Тип объекта " + mt.getClass().getName());
    }
}
