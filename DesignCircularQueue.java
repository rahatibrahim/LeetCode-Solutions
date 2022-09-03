class MyCircularQueue {
    private int[] data;
    private int head, tail, len;

    public MyCircularQueue(int k) {
        data = new int[k];
        head = 0;
        tail = -1;
        len = 0;
    }
    
    public boolean enQueue(int value) {
        if (isFull()) return false;
        if (tail == data.length - 1)
            tail = 0;
        else {
            tail++;
        }
        data[tail] = value;
        len++;
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) return false;
        data[head] = -1;

        head++;
        if (head == data.length)
            head = 0;

        len--;
        return true;
    }
    
    public int Front() {
        if (isEmpty()) return -1;
        return data[head];
    }
    
    public int Rear() {
        if (isEmpty()) return -1;
        return data[tail];
    }
    
    public boolean isEmpty() {
        return len == 0;

    }
    
    public boolean isFull() {
        return len == data.length;
    }
}

public class DesignCircularQueue {
    public static void main(String[] args) {
        MyCircularQueue obj = new MyCircularQueue(4);
        System.out.println(obj.enQueue(1));
        System.out.println(obj.enQueue(2));
        System.out.println(obj.enQueue(3));
        System.out.println(obj.enQueue(4));
        System.out.println(obj.deQueue());
        System.out.println(obj.deQueue());
        System.out.println(obj.enQueue(5));
        System.out.println(obj.enQueue(6));
        System.out.println(obj.Front());
        System.out.println(obj.Rear());
        System.out.println(obj.isEmpty());
        System.out.println(obj.isFull());
    }
}
