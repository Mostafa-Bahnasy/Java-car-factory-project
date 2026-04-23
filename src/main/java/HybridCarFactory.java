package main.java;

public class HybridCarFactory extends CarFactory {
    @Override
    public CarEngine createCarEngine() {
        return new HybridEngine();
    }
    
}
