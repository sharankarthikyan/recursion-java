// GCD

public class Program7 {
    public static int recursive(int num1, int num2) {

        if (num1 == num2) {
            return num1;
        }

        if (num1 > num2) {
            return recursive(num1 - num2, num2);
        } else {
            return recursive(num1, num2 - num1);
        }
    }

    public static void main(String[] args) {
        System.out.println(recursive(24, 18));
    }
}
