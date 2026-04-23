package main.java;

public class ElectricEngine implements CarEngine {
    private int speed;

    public ElectricEngine() {
        this.speed = 0;
    }

    @Override
    public void increaseSpeed() {
        this.speed += 1;
        System.out.println("Electric engine speed increased to: " + this.speed);
    }

    @Override
    public void decreaseSpeed() {
        if (this.speed >= 1) {
            this.speed -= 1;
            System.out.println("Electric engine speed decreased to: " + this.speed);
        } else {
            System.out.println("Electric engine is already at minimum speed.");
        }
    }
    
    @Override
    public int getSpeed() {
        return this.speed;
    }   

    @Override
    public void setSpeed(int speed) {
        if(speed < 0) {
            System.out.println("Speed cannot be negative. Setting speed to 0.");
            this.speed = 0;
        } else {
            this.speed = speed;
        }
        System.out.println("Electric engine speed set to: " + this.speed);  
    }
}
