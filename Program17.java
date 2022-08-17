// Count the Number of Occurrences of a Number in an Array

public class Program17 {
    public static int recursive(int[] arr, int n, int currentIdx) {
        if (arr.length == currentIdx) {
            return 0;
        } else if (arr[currentIdx] == n) {
            return 1 + recursive(arr, n, currentIdx + 1);
        } else {
            return recursive(arr, n, currentIdx + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 4, 5, 6, 3, 5, 4 };
        int n = 4;
        System.out.println(recursive(arr, n, 0));
    }
}
