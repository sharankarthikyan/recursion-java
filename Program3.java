// Exponent of a Number

public class Program3 {
    public static long recursive(int base, int pow) {
        if (pow == 0) {
            return 1;
        }

        return base * recursive(base, pow - 1);
    }

    public static void main(String[] args) {
        System.out.println(recursive(5, 2));
    }
}
