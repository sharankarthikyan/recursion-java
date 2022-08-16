// Print all Permutations of a String

public class Program14 {
    public static String swap(String str, int i, int j) {
        char[] arr = str.toCharArray();
        char ch = arr[i];
        arr[i] = arr[j];
        arr[j] = ch;
        return String.valueOf(arr);
    }

    public static void recursive(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
            return;
        }

        for (int i = left; i <= right; i++) {
            String swapped = swap(str, left, i);
            recursive(swapped, left + 1, right);
        }

    }

    public static void main(String[] args) {
        String str = "abc";
        recursive(str, 0, str.length() - 1);
    }
}
