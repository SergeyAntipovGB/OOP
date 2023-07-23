package work.seminar4.task1;

public class Main {
    
    public static void main(String[] args) {

        Gen<Integer> iob = new Gen<Integer>(88);
        iob.showType();
        int v = iob.getOb();
        System.out.println("Значение iob " + v);

        Gen<String> sob = new Gen<>("Строка");
        sob.showType();
        String s = sob.getOb();
        System.out.println("Значение sob " + s);


        Gen1<Integer, String> ob = new Gen1<>(77, "Тест");
        ob.showType();
        int w = ob.getOb1();
        String str = ob.getOb2();
        System.out.println("Значение ob.v " + w);
        System.out.println("Значение ob.str " + str);
    }
}