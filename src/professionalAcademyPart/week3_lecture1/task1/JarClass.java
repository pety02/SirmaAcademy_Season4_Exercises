package professionalAcademyPart.week3_lecture1.task1;

import java.util.Stack;

public class JarClass<T> implements Jar<T> {
    private Stack<T> data;

    public JarClass() {
        this.setData(new Stack<>());
    }

    public Stack<T> getData() {
        return data;
    }

    public void setData(Stack<T> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        if(this.data.isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        int size = this.data.size();
        for(T el : this.data) {
            if(size > 1) {
                sb.append(el);
                sb.append(", ");
                size--;
            } else {
                sb.append(el);
                size--;
            }
        }
        sb.append("]");

        return sb.toString();
    }

    @Override
    public void add(T element) {
        this.data.push(element);
    }

    @Override
    public void remove() {
        this.data.pop();
    }

    public static void main(String[] args) {
        JarClass<Integer> numbers = new JarClass<>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(10);

        System.out.println(numbers);
        numbers.remove();
        numbers.remove();
        numbers.remove();
        System.out.println(numbers);
    }
}