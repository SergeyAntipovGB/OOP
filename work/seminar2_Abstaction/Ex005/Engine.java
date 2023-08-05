package work.seminar2_Abstaction.Ex005;

public class Engine implements EngineInterface {
    public void start() {
        System.out.println("Engine started");
    }

    public void stop() {
        System.out.println("Engine stopped");
    }
}