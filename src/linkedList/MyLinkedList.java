package linkedList;

public class MyLinkedList {
    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("LinkedList is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value + " ");
                temp = temp.next;
                if (temp != null) {
                    System.out.print("-> ");
                } else {
                    System.out.println();
                }
            }
        }
    }

    public static Node addToHead(Node head, int value) {
        Node newNode = new Node(value);
        if (head != null) {
            newNode.next = head;
        }
        return newNode;
    }

    public static Node addToTail(Node head, int value) {
        Node newNode = new Node(value);
        if (head == null) {
            return newNode;
        } else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return head;
    }

    public static Node addToIndex(Node head, int value, int index) {
        if (index == 0) {
            return addToHead(head, value);
        } else {
            Node newNode = new Node(value);
            Node curNode = head;
            int count = 0;
            while (curNode != null) {
                count++;
                if (count == index) {
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    break;
                }
                curNode = curNode.next;
            }
        }
        return head;
    }

    public static Node removeAtHead(Node headNode) {
        if (headNode != null) {
            return headNode.next;
        }
        return headNode;
    }

    public static Node removeAtTail(Node headNode) {
        if (headNode == null) return null;
        Node lastNode = headNode;
        Node prevNode = null;
        while (lastNode.next != null) {
            prevNode = lastNode;
            lastNode = lastNode.next;
        }
        if (prevNode == null) {
            return null;
        } else {
            prevNode.next = lastNode.next;
        }
        return headNode;
    }

    public static Node removeAtIndex(Node headNode, int index) {
        if (headNode == null || index < 0) return null;
        if (index == 0) return removeAtHead(headNode);

        Node curNode = headNode;
        Node prevNode = null;
        int count = 0;
        boolean bIsFound = false;
        while(curNode != null){
            if (count == index) {
                // remove curNode
                bIsFound = true;
                break;
            }
            prevNode = curNode;
            curNode = curNode.next;
            count++;
        }
        if(bIsFound){
            prevNode.next = curNode.next;
        }

        return headNode;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

        printLinkedList(n1);
        n1 = addToHead(n1, 0);
        n1 = addToTail(n1, 4);
        n1 = addToIndex(n1, 12, 5);
        printLinkedList(n1);
        n1 = removeAtHead(n1);
        n1 = removeAtTail(n1);
        n1 = removeAtIndex(n1, 2);
        printLinkedList(n1);
    }
}
