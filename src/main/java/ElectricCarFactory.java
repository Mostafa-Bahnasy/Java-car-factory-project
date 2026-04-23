package main.java;

public class ElectricCarFactory extends CarFactory {
    @Override
    public CarEngine createCarEngine() {
        return new ElectricEngine();
    }
    
}
