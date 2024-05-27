package entryAcademyPart.week2_lecture2.task4;

public class VehicleTest {
    public static void main(String[] args) {
        Engine engine = new Engine(100, 200);
        Vehicle vehicle = new Vehicle("a", "b", engine, 200);
        vehicle.drive(100);
        System.out.println(vehicle.getFuel());
    }
}