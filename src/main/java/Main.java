package main.java;

public class Main {
    public static void main(String[] args) {

        
        // Test 1: Hybrid Factory & Threshold Logic
        System.out.println("=== TEST 1: HYBRID CAR ===");
       
        Car myCar = Car.create(new HybridCarFactory());
        
        myCar.start();
        myCar.accelerate(); // 20 km/h (Electric)
        myCar.accelerate(); // 40 km/h (Electric)
        myCar.accelerate(); // 60 km/h (Should trigger Gas logic internally)
        myCar.stop();

        // Test 2: Electric Factory & Speed Limit
        System.out.println("\n=== TEST 2: ELECTRIC CAR & LIMITS ===");
        
        myCar = Car.create(new ElectricCarFactory());
        myCar.start();
        for(int i = 0; i < 11; i++) { // Attempt to go over 200
            myCar.accelerate();
        }
        myCar.stop();

        // Test 3: Engine Replacement
        System.out.println("\n=== TEST 3: ENGINE REPLACEMENT ===");
        
        // Take the existing electric car and swap its engine for a gas one
        myCar = Car.create(new GasCarFactory()  );
        myCar.start();
        myCar.accelerate();
        myCar.stop();
    }
}