// Sum of integers from 1 to n

public class Program4 {
    public static int recursive(int n) {
        if (n == 1) {
            return n;
        }
        return n + recursive(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(recursive(5));
    }
}
