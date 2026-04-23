package main.java;

public class HybridEngine  implements CarEngine {
    private final GasEngine gas = new GasEngine();
    private final ElectricEngine electric = new ElectricEngine();
    private int speed;
    private boolean isElectricMode;
    public HybridEngine() {
        this.speed = 0;
        this.isElectricMode = true;
    }


    @Override
    public void increaseSpeed() {
        this.speed += 1;
        if(this.speed >= 50) {
            this.isElectricMode = false;
            System.out.println("Switching to Gas mode.");
        }
        if(isElectricMode) {
            System.out.println("Electric engine speed: " + this.speed);
            this.electric.setSpeed(this.speed); 
        } else {
            System.out.println("Gas engine speed: " + this.speed);
            this.gas.setSpeed(this.speed);
        }
    }

    @Override
    public void decreaseSpeed() {
        if (this.speed >= 1) {
            this.speed -= 1;
        } else {
            System.out.println("Electric engine is already at minimum speed.");
        }
        if(this.speed < 50) {
            this.isElectricMode = true;
            System.out.println("Switching to Electric mode.");
        }
        if(isElectricMode) {
            System.out.println("Electric engine speed: " + this.speed);
            this.electric.setSpeed(this.speed);

        } else {
            System.out.println("Gas engine speed: " + this.speed);
            this.gas.setSpeed(this.speed);
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
        if(this.speed >= 50) {
            this.isElectricMode = false;
            System.out.println("Switching to Gas mode.");
        }
        else {
            this.isElectricMode = true;
            System.out.println("Switching to Electric mode.");
        }
        if(isElectricMode) {
            System.out.println("Electric engine speed set to: " + this.speed);
        } else {
            System.out.println("Gas engine speed set to: " + this.speed);
        }
    }

}
