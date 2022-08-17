// Search for a Value in a Linked List

public class Program24 {

    static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static boolean recursive(Node head, int n) {
        if (head == null) {
            return false;
        } else if (head.data == n) {
            return true;
        } else {
            return recursive(head.next, n);
        }
    }

    public static void main(String[] args) {
        Node ll = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, null)))));
        System.out.println(recursive(ll, 5));
    }
}
