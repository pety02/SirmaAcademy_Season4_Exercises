package professionalAcademyPart.week3_lecture3.task3;

public class Scale <T extends Comparable<T>> {
    private T left;
    private T right;
    public Scale(T left, T right) {
        this.setLeft(left);
        this.setRight(right);
    }

    public T getLeft() {
        return left;
    }

    public void setLeft(T left) {
        this.left = left;
    }

    public T getRight() {
        return right;
    }

    public void setRight(T right) {
        this.right = right;
    }

    public T getHeavier() {
        int compared = this.left.compareTo(this.right);
        if(compared < 0) {
            return this.right;
        } else if(compared == 0) {
            return null;
        } else {
            return this.left;
        }
    }

    public static void main(String[] args) {
        Scale<Integer> scale = new Scale<>(15, 5);
        System.out.println(scale.getHeavier());
    }
}