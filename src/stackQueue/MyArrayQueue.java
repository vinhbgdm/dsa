package stackQueue;

public class MyArrayQueue implements IStackQueue {

    private int[] array;
    private int SIZE;
    private int headIndex;
    private int tailIndex;

    MyArrayQueue(int size) {
        SIZE = size;
        array = new int[SIZE];
        headIndex = tailIndex = -1;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()) {
            if (isEmpty()) {
                headIndex++;
            }
            tailIndex++;
            array[tailIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        int value = -1;
        if (!isEmpty()) {
            value = array[headIndex];
            headIndex++;
            if (headIndex > tailIndex) {
                headIndex = tailIndex = -1;
            }
        }
        return value;
    }

    @Override
    public boolean isFull() {
        return tailIndex == SIZE - 1;
    }

    @Override
    public boolean isEmpty() {
        return (headIndex == -1) && (tailIndex == -1);
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int i = headIndex; i <= tailIndex; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MyArrayQueue myArrayQueue = new MyArrayQueue(3);

        myArrayQueue.push(1);
        myArrayQueue.push(2);
        myArrayQueue.push(3);
        myArrayQueue.push(4);
        myArrayQueue.show();

        myArrayQueue.pop();
        myArrayQueue.show();

        myArrayQueue.pop();
        myArrayQueue.show();

        myArrayQueue.pop();
        myArrayQueue.show();
    }
}
