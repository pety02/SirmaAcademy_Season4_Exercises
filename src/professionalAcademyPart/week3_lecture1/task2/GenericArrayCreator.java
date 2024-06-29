package professionalAcademyPart.week3_lecture1.task2;

import java.lang.reflect.Array;

import static java.lang.reflect.Array.*;

public interface GenericArrayCreator<T> {
    static <T>T[] create(int length, T item) {
        T[] array = (T[]) newInstance(item.getClass(), length);
        for (int i = 0; i < length; i++) {
            array[i] = item;
        }
        return array;
    }
    static <T>T[] create(Class<T> _class, int length, T item) {
        T[] array = (T[])newInstance(_class, length);
        for (int i = 0; i < length; i++) {
            array[i] = item;
        }
        return array;
    }
}