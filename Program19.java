// Invert the Position of Elements in an Array

import java.util.Arrays;

public class Program19 {
    public static void recursive(int[] arr, int currentIdx) {
        if (currentIdx < arr.length / 2) {
            int temp = arr[currentIdx];
            arr[currentIdx] = arr[arr.length - 1 - currentIdx];
            arr[arr.length - 1 - currentIdx] = temp;

            recursive(arr, currentIdx + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, -3, 4, -5, 6, -3, -5, 4 };
        recursive(arr, 0);

        System.out.println(Arrays.toString(arr));
    }
}
