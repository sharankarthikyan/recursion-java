// Decimal to Binary Conversion

public class Program9 {
    public static int recursive(int decimalNum) {
        if (decimalNum == 0) { // base case
            return 0;
        } else { // recursive case
            return (decimalNum % 2 + 10 * recursive(decimalNum / 2));
        }
    }

    public static void main(String[] args) {
        System.out.println(recursive(15));
    }
}
