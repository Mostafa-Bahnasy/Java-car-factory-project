package main.java;

public abstract class CarFactory {
    public CarEngine updateEngine() {
            CarEngine engine = createCarEngine();
            return engine;
    }
    public abstract CarEngine createCarEngine();
}
