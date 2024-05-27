package entryAcademyPart.week2_lecture2.task4;

public class Vehicle {
    private String type;
    private String model;
    private Engine engine;
    private int fuel;

    public Vehicle(String type, String model, Engine engine, int fuel) {
        this.type = type;
        this.model = model;
        this.engine = engine;
        this.fuel = fuel;
    }

    public void drive(int fuelLoss) {
        if (fuelLoss > fuel) {
            fuel = 0;
        } else {
            fuel -= fuelLoss;
        }
        engine.consumeFuel(fuelLoss);
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}