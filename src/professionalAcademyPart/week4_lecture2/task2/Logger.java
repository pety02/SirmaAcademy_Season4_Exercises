package professionalAcademyPart.week4_lecture2.task2;

public class Logger {
    public void logToConsole(String message) {
        // Practically do the same as before
        ConsoleLogger consoleLogger = new ConsoleLogger();
        consoleLogger.log(message);

        // System.out.println(message);
    }
    public void logToFile(String message, String filename) {
        // Code to write message to a file
        FileLogger fileLogger = new FileLogger(filename);
        fileLogger.log(message);
    }
}