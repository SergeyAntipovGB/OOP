package work.seminar7_patterns.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Приватный конструктор, чтобы предотвратить создание экземпляров извне
    }

    public void showMessage() {
        System.out.println("Hello, I am a singleton!");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}