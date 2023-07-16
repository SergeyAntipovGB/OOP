package work.seminar2.Ex004;

public class Start {
    public static void main(String[] args) {
        Test4 t4 = new Test4();

        System.out.println("Админ " + t4.getAdminId());
        
        System.out.println("Пользователь " + t4.getUserId());
        
        System.out.println("Уникальный " + MyIf.getUniqueId());
    }
}
