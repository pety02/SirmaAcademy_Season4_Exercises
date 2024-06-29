package professionalAcademyPart.week3_lecture1.task4;

import java.util.Scanner;

public class GenericBox<T> {
    private T[] values;

    public GenericBox(T[] values) {
        this.setValue(values);
    }

    public T[] getValue() {
        return values;
    }

    public void setValue(T[] values) {
        this.values = values;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(this.values != null) {
            for (T value : this.values) {
                sb.append(String.format("%s: %s%n", value.getClass().getName(), value));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String[] inputs = new String[length];
        for (int i = 0; i < length; i++) {
            inputs[i] = scanner.nextLine();
        }
        GenericBox<String> box = new GenericBox<>(inputs);
        System.out.println(box);
    }
}
