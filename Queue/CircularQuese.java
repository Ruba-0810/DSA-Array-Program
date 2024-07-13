package Queue;

public class CircularQuese {
    protected int[] num;
    private static final int DEFEAULT_SIZE = 10;
    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQuese() {
        this(DEFEAULT_SIZE);
    }

    public CircularQuese(int size) {
        this.num = new int[size];
    }

    public boolean isFull() {

        return size == num.length;
    }

    public boolean isEmpty() {

        return end == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        num[end] = item;
        end = end % num.length;
        size++;
        return true;
    }

    public int removed() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int remove = num[front];
        front = front % num.length;
        size--;
        return removed();

    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue empty");

        }
        return num[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.println(num[i] + "");
            i++;
            i %= num.length;

        } while (i != end);
        System.out.println("end");
    }

}
