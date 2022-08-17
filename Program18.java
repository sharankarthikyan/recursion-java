// Replacing each Negative Integer with a 0 in an Array

import java.util.Arrays;

public class Program18 {
    public static void recursive(int[] arr, int currentIdx) {
        if (arr.length == currentIdx) {
            return;
        } else if (arr[currentIdx] < 0) {
            arr[currentIdx] = 0;
            recursive(arr, currentIdx + 1);
        } else {
            recursive(arr, currentIdx + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, -3, 4, -5, 6, -3, -5, 4 };
        recursive(arr, 0);

        System.out.println(Arrays.toString(arr));
    }
}
