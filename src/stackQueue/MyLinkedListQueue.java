package stackQueue;

public class MyLinkedListQueue implements IStackQueue {

    public class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    Node headNode, tailNode;

    public MyLinkedListQueue() {
        headNode = tailNode = null;
    }

    @Override
    public boolean push(int value) {
        if (isFull()) return false;
        Node newNode = new Node(value);
        if (isEmpty()) {
            headNode = tailNode = newNode;
        } else {
            tailNode.next = newNode;
            tailNode = newNode;
        }
        return true;
    }

    @Override
    public int pop() {
        if (isEmpty()) return -1;
        int value = headNode.value;
        if (headNode == tailNode) {
            headNode = tailNode = null;
        } else {
            headNode = headNode.next;
        }
        return value;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return (headNode == null) && (tailNode == null);
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node curNode = headNode;
        while (curNode != null) {
            System.out.print(curNode.value + " ");
            curNode = curNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.show();

        queue.pop();
        queue.show();

        queue.pop();
        queue.show();

        queue.pop();
        queue.show();

        queue.pop();
        queue.show();
    }
}
