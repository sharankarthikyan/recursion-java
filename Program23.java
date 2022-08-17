// Sum Numbers in a Linked List

public class Program23 {

    static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static int recursive(Node head) {
        if (head == null) { // base case
            return 0;
        }
        // recursive case
        return head.data + recursive(head.next);
    }

    public static void main(String[] args) {
        Node ll = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, null)))));
        System.out.println(recursive(ll));
    }
}
