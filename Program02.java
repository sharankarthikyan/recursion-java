// Find the length of the Linked List

public class Program2 {

    public static class Node {
        int data;
        Node next = null;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static int recursive(Node head) {
        if (head.next == null) {
            return 1;
        }

        return 1 + recursive(head.next);
    }

    public static void main(String[] args) {
        Node linkedList = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, null)))));
        System.out.println(recursive(linkedList));
    }
}
