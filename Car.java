class Car {
    // Private fields (encapsulation)
    private int currentSpeed;
    private double fuelAmount;
    private boolean engineOn;

    private static final int TOP_SPEED = 180;

    // Setters
    public void setCurrentSpeed(int speed) {
        this.currentSpeed = speed;
    }

    public void setFuelAmount(double fuel) {
        this.fuelAmount = fuel;
    }

    public void setEngineOn(boolean status) {
        this.engineOn = status;
    }

    // Methods
    public void start() {
        if (fuelAmount > 0) {
            engineOn = true;
            System.out.println("Engine is now running...");
        } else {
            System.out.println("Cannot start engine — fuel tank empty!");
        }
    }

    public void stop() {
        engineOn = false;
        currentSpeed = 0;
        System.out.println("Engine turned off.");
    }

    public void accelerate() {
        if (!engineOn) {
            System.out.println("Cannot accelerate — engine is off!");
            return;
        }

        if (fuelAmount <= 0) {
            System.out.println("Out of fuel! Refuel before driving.");
            stop();
            return;
        }

        if (currentSpeed < TOP_SPEED) {
            currentSpeed += 20;
            fuelAmount -= 2;
            System.out.println("Speeding up... Current speed: " + currentSpeed + " km/h");
        } else {
            System.out.println("Reached maximum speed!");
        }
    }

    public void refuel(double liters) {
        if (liters > 0) {
            fuelAmount += liters;
            System.out.println("Added " + liters + " litres of fuel. Total fuel: " + fuelAmount + " litres.");
        } else {
            System.out.println("Invalid fuel amount.");
        }
    }

    public void displayStatus() {
        System.out.println("\n=== CAR STATUS ===");
        System.out.println("Engine: " + (engineOn ? "ON" : "OFF"));
        System.out.println("Speed: " + currentSpeed + " km/h");
        System.out.println("Fuel: " + fuelAmount + " litres");
        System.out.println("==================\n");
    }

    // Getters
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public boolean isEngineRunning() {
        return engineOn;
    }
}
public class VehicleSimulator {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.displayStatus();
        myCar.start();
        myCar.accelerate();
        myCar.refuel(5);
        myCar.start();
        myCar.accelerate();
        myCar.accelerate();
        myCar.displayStatus();
        myCar.stop();
        myCar.displayStatus();
    }
}

