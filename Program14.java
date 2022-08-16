// Print all Permutations of a String

public class Program14 {
    public static void swap(char[] arr, int i, int j) {
        char ch = arr[i];
        arr[i] = arr[j];
        arr[j] = ch;
    }

    public static void recursive(char[] arr, int len) {
        if (len == 1) {
            System.out.println(arr);
            return;
        }

        for (int i = 0; i < len; i++) {
            swap(arr, i, len - 1);
            recursive(arr, len - 1);
            swap(arr, i, len - 1);
        }

    }

    public static void main(String[] args) {
        char[] arr = { 'a', 'b', 'c' };
        recursive(arr, arr.length);
    }
}
