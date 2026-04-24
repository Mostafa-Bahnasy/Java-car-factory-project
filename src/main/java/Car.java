package main.java;

public class Car {
    private  CarEngine engine;
    private final int brakeValue = 20;
    private final int accelerateValue = 20;
    

    public static Car create(HybridCarFactory factory) {
        Car newCar = new Car();
        newCar.engine = factory.createCarEngine();
        return newCar;
    }

    public static Car create(ElectricCarFactory factory) {
        Car newCar = new Car();
        newCar.engine = factory.createCarEngine();
        return newCar ;
    }
    
    public static Car create(GasCarFactory factory) {
        Car newCar = new Car();
        newCar.engine = factory.createCarEngine(); 
        return newCar;
    }

    public void setEngine(CarEngine newEngine) {
        this.engine = newEngine;
        System.out.println("Car engine changed.");
    }
    public void start() {
        System.out.println("Car started.");
        engine.setSpeed(0);
    }
    public void accelerate() {
        if(this.engine.getSpeed() + accelerateValue > 200) {
            System.out.println("Car is already at maximum speed.");
            return;
        }
        engine.setSpeed(this.engine.getSpeed() + accelerateValue);
        System.out.println("Car accelerated to: " + engine.getSpeed());
    }
    public void brake() {
        engine.setSpeed(this.engine.getSpeed() - brakeValue);
        System.out.println("Car braked. Current speed: " + engine.getSpeed());
    }
    public void stop() {
        System.out.println("Car stopped.");
        engine.setSpeed(0);
    }

}
