package professionalAcademyPart.week4_lecture2.task3;

// The problem here is that ElectricEngine do not start by default so it
// leads to not typical behavior of the classes.
public class ElectricEngine extends Engine {
    @Override
    public void start() {
        throw new UnsupportedOperationException("Electric engines don't start traditionally");
    }
}
