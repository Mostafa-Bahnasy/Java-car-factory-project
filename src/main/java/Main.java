package main.java;

public class Main {
    public static void main(String[] args) {
        // Test 1: Hybrid Factory & Threshold Logic
        System.out.println("=== TEST 1: HYBRID CAR ===");
        CarFactory hybridFactory = new HybridCarFactory();
        Car myCar = new Car(hybridFactory.createCarEngine());
        
        myCar.start();
        myCar.accelerate(); // 20 km/h (Electric)
        myCar.accelerate(); // 40 km/h (Electric)
        myCar.accelerate(); // 60 km/h (Should trigger Gas logic internally)
        myCar.stop();

        // Test 2: Electric Factory & Speed Limit
        System.out.println("\n=== TEST 2: ELECTRIC CAR & LIMITS ===");
        CarFactory electricFactory = new ElectricCarFactory();
        Car electricCar = new Car(electricFactory.createCarEngine());
        
        for(int i = 0; i < 11; i++) { // Attempt to go over 200
            electricCar.accelerate();
        }
        electricCar.stop();

        // Test 3: Engine Replacement
        System.out.println("\n=== TEST 3: ENGINE REPLACEMENT ===");
        CarFactory gasFactory = new GasCarFactory();
        
        // Take the existing electric car and swap its engine for a gas one
        electricCar.setEngine(gasFactory.createCarEngine());
        electricCar.start();
        electricCar.accelerate();
        electricCar.stop();
    }
}