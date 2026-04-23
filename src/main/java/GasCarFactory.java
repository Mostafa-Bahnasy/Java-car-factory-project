package main.java;

public class GasCarFactory extends CarFactory {
    @Override
    public CarEngine createCarEngine() {
        return new GasEngine();
    }
}
