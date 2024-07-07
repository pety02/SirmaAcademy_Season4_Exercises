package professionalAcademyPart.week4_lecture2.task5;

// Task: Refactor the WeatherReporter class so that it doesn't depend on a specific
// temperature sensor implementation.
public class WeatherReporter {

    public String report(TemperatureSensor sensor) {
        return "Current temperature: " + sensor.getTemperature();
    }
}