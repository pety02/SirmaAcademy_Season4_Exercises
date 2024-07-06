package professionalAcademyPart.week3_lecture3.task10;

import java.util.*;
import java.util.Stack;

public class CustomList<T extends Comparable<T>> implements ICustomList<T> {
    private Stack<T> data;

    public CustomList() {
        this.setData(new Stack<>());
    }

    @Override
    public void add(T element) {
        this.data.push(element);
    }

    @Override
    public T remove(int index) {
        return this.data.pop();
    }

    @Override
    public boolean contains(T element) {
        return this.data.contains(element);
    }

    @Override
    public void swap(int fstIndex, int sndIndex) {
        if (0 <= fstIndex && fstIndex < this.data.size() && 0 <= sndIndex && sndIndex < this.data.size()) {
            T temp = this.data.get(fstIndex);
            this.data.set(fstIndex, this.data.get(sndIndex));
            this.data.set(sndIndex, temp);
        }
    }

    @Override
    public int countGreaterThan(T element) {
        int count = 0;
        for(T el : this.data) {
            if(el.compareTo(element) > 0) {
                count++;
            }
        }

        return count;
    }

    @Override
    public T getMax() {
        T max = this.data.get(0);
        for (int i = 0; i < this.data.size(); i++) {
            for (int j = i + 1; j < this.data.size(); j++) {
                if(this.data.get(i).compareTo(this.data.get(j)) < 0) {
                    max = this.data.get(j);
                }
            }
        }
        return max;
    }

    @Override
    public T getMin() {
        T min = this.data.get(0);
        for (int i = 0; i < this.data.size(); i++) {
            for (int j = i + 1; j < this.data.size(); j++) {
                if(this.data.get(i).compareTo(this.data.get(j)) >= 0) {
                    min = this.data.get(j);
                }
            }
        }
        return min;
    }

    public Stack<T> getData() {
        return data;
    }

    public void setData(Stack<T> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        List<T> lst = this.data.stream().toList();
        StringBuilder sb = new StringBuilder();
        for (T t : lst) {
            sb.append(String.format("%s%n", t));
        }

        return sb.toString();
    }
}