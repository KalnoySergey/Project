package MainPackage;

public class queue {
    private int[] q_arr;
    private int max;
    private int n;
    private int front;
    private int rear;

    public queue(int max) {
        this.max = max;
        q_arr = new int[this.max];
        rear = -1;
        front = 0;
        n = 0;
    }
    public void add(int elem) {
        if (rear == max - 1) {  // циклический перенос
            rear = -1;
        }
        q_arr[++rear] = elem;  //увеличение Rear и вставка
        n++;  // увеличение количества элементов в очереди
    }
    public int remove() {
        int temp = q_arr[front++]; // получаем первый элемент из очереди
        if (front == max) { // циклический перенос
            front = 0;
        }
        n--; // уменьшаем количество элементов в очереди
        return temp;
    }
    public int getFront() {
        return q_arr[front]; //get last element
    }
    public int getRear() {
        return q_arr[rear]; //get first element
    }
    public boolean is_full() {
        return (n == max - 1);
    }
    public boolean is_empty() {
        return (n == 0);
    }
    public int getSize() {
        return n;
    }
}
