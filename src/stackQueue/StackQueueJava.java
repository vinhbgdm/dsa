package stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueJava {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        for (Integer i : myStack) {
            System.out.print(i + " ");
        }

        System.out.println("\nPeek: " + myStack.peek());
        System.out.println("Pop: " + myStack.pop());
        System.out.println("\nPeek: " + myStack.peek());
        System.out.println("Pop: " + myStack.pop());
        System.out.println("\nPeek: " + myStack.peek());
        System.out.println("Pop: " + myStack.pop());

        System.out.println("\nIsEmpty: " + myStack.isEmpty());

        System.out.println("======================");

        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);

        for (Integer i : myQueue) {
            System.out.print(i + " ");
        }

        System.out.println("\nRemove: " + myQueue.remove());
        System.out.println("Remove: " + myQueue.remove());
        System.out.println("Remove: " + myQueue.remove());

        System.out.println("\nIsEmpty: " + myQueue.isEmpty());
    }
}
