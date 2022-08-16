// Modulo operation

public class Program05 {
    public static int recursive(int dividend, int divisor) {
        if (divisor == 0) {
            return -1;
        }

        // Base case
        if (dividend < divisor) {
            return dividend;
        } else { // Recursive case
            return recursive(dividend - divisor, divisor);
        }
    }

    public static void main(String[] args) {
        System.out.println(recursive(15, 4));
    }
}
