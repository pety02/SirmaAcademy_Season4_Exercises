package entryAcademyPart.week2_lecture2.task1;

// This class is used in task 1 and task 2
public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public Car() {
        this.setBrand("unknown");
        this.setModel("unknown");
        this.setHorsePower(0);
    }
    public Car(String brand) {
        this.setBrand(brand);
        this.setModel("unknown");
        this.setHorsePower(-1);
    }
    public Car(String brand, String model) {
        this.setBrand(brand);
        this.setModel(model);
        this.setHorsePower(-1);
    }
    public Car(String brand, String model, int horsePower) {
        this.setBrand(brand);
        this.setModel(model);
        this.setHorsePower(horsePower);
    }
    public Car(Car other) {
        this.setBrand(other.getBrand());
        this.setModel(other.getModel());
        this.setHorsePower(other.getHorsePower());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand != null && !brand.isEmpty() ? brand : "unknown";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model != null && !model.isEmpty() ? model : "unknown";
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower <= 0 ? -1 : horsePower;
    }

    // It would be better if we override the @toString method instead of the next method.
    public String carInfo() {
        return "The car is: " + this.brand + " " + this.model + " – " + this.horsePower + " HP.";
    }
}