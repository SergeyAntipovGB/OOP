package work.seminar2.Ex001;

public class Test {
    public static void main(String[] args) {
        System.out.println("Операции над t1");
        Test1 t1 = new Test1();
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение " + t1.getNext());
        }
        System.out.println("Сброс ");
        t1.reset();
        System.out.println("Начальное значение 100 ");
        t1.setNum(100);
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение " + t1.getNext());
        }
        
        System.out.println("\nОперации над t2");
        Test2 t2 = new Test2();
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение " + t2.getNext());
        }
        System.out.println("Сброс ");
        t2.reset();
        System.out.println("Начальное значение 200 ");
        t2.setNum(200);
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение " + t2.getNext());
        }
    }
}
