// Sort an Array

import java.util.Arrays;

public class Program21 {
    public static void recursive(int[] arr, int n) {
        if (n == 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        recursive(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 60, 5, 11, 3, 10, 1, 9 };
        recursive(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
