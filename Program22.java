// Print a Reversed Linked List

public class Program22 {

    static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void recursive(Node head) {
        if (head == null) {
            return;
        }

        recursive(head.next);
        System.out.print(head.data + " ");
    }

    public static void main(String[] args) {
        Node ll = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, null)))));

        recursive(ll);
    }
}
