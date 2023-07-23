package home.lesson4.task1;

import work.seminar4.task1.Gen1;

public class Main {
    
    public static void main(String[] args) {

        MyType<Integer> imt = new MyType<Integer>(88);
        imt.showType();
        int v = imt.getMt();
        System.out.println("Значение iob " + v);

        MyType<String> smt = new MyType<>("Строка");
        smt.showType();
        String s = smt.getMt();
        System.out.println("Значение sob " + s);


        Gen1<Integer, String> mt = new Gen1<>(77, "Тест");
        mt.showType();
        int w = mt.getOb1();
        String str = mt.getOb2();
        System.out.println("Значение ob.v " + w);
        System.out.println("Значение ob.str " + str);
    }
}