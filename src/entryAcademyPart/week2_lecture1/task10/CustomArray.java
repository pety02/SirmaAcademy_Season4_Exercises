package entryAcademyPart.week2_lecture1.task10;

public class CustomArray {
    private static int initValue = 1;
    private int[] data;
    private int capacity;
    private int size;
    private void resize() {
        int[] temp = new int[this.capacity];
        System.arraycopy(this.data, 0, temp, 0, this.size);
        this.capacity *= 2;
        this.data = temp;
    }
    public CustomArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.data = new int[capacity];
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity > 0 ? capacity : 8;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = Math.max(size, 0);
    }

    public void add() {
        if(this.size == this.capacity) {
            this.resize();
        }
        this.data[this.size++] = initValue++;
    }

    public void remove() {
        this.size--;
    }

    @Override
    public String toString() {
        if(this.size == 0) {
            return "Empty";
        }

        StringBuilder data = new StringBuilder();
        for (int i = 0; i < this.size; i++) {
            data.append(this.data[i]).append(" ");
        }

        return data.toString();
    }
}