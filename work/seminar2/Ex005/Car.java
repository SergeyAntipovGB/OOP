package work.seminar2.Ex005;

public class Car {
    private EngineInterface engine;

    public Car(EngineInterface engine) {
        this.engine = engine;
    }

    public void startCar() {
        engine.start();
    }

    public void stopCar() {
        engine.stop();
    }
}


// Engine engine = new Engine();
//         Car car = new Car(engine);

//         car.startCar();
//         car.stopCar();