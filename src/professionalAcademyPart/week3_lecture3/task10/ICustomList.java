package professionalAcademyPart.week3_lecture3.task10;

public interface ICustomList<T> {
    void add(T element);
    T remove(int index);
    boolean contains(T element);
    void swap(int fstIndex, int sndIndex);
    int countGreaterThan(T element);
    T getMax();
    T getMin();
}