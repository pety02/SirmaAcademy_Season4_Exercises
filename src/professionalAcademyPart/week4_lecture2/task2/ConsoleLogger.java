package professionalAcademyPart.week4_lecture2.task2;

public class ConsoleLogger implements Loggable {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
