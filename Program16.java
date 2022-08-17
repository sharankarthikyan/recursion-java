// Find the First Occurrence of a Number in an Array

public class Program16 {
    public static int recursive(int[] arr, int n, int currentIdx) {
        if (arr.length == currentIdx) {
            return -1;
        } else if (arr[currentIdx] == n) {
            return currentIdx;
        } else {
            return recursive(arr, n, currentIdx + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int n = 4;
        System.out.println(recursive(arr, n, 0));
    }
}
