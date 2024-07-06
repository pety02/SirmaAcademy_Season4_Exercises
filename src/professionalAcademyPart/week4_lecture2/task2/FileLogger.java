package professionalAcademyPart.week4_lecture2.task2;

public class FileLogger implements Loggable {
    private String filename;

    public FileLogger(String filename) {
        this.setFilename(filename);
    }
    @Override
    public void log(String message) {
        // prints in a file with name this.filename
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
