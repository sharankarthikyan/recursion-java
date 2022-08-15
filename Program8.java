// Is Prime

public class Program8 {
    public static boolean recursive(int num, int i) {
        if (num < 2) { // 1st base case
            return false;
        } else if (i == 1) { // 2nd base case
            return true;
        } else if (num % i == 0) { // 3rd base case
            return false;
        } else { // recursive case
            return recursive(num, i - 1);
        }
    }

    public static void main(String[] args) {
        int input = 11;
        System.out.println(recursive(input, input / 2));
    }
}
