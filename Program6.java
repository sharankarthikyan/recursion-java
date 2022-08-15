// Fibonacci Sequence

public class Program6 {
    public static int recursive(int n) {
        if (n <= 1) {
            return n;
        }

        return recursive(n - 2) + recursive(n - 1);
    }

    public static void main(String[] args) {
        int input = 5, i = 0;

        while (i < input) {
            System.out.print(recursive(i) + " ");
            i++;
        }
    }
}
