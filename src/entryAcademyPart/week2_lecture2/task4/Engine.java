package entryAcademyPart.week2_lecture2.task4;

public class Engine {
    private int power;
    private int fuel;

    public Engine(int power, int fuel) {
        this.power = power;
        this.fuel = fuel;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void consumeFuel(int fuelLoss) {
        if (fuelLoss > fuel) {
            fuel = 0;
        } else {
            fuel -= fuelLoss;
        }
    }
}