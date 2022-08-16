// Count number of digits in a number

public class Program01 {

    public static int recursive(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return 1 + recursive(n / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(recursive(10123123));
    }
}