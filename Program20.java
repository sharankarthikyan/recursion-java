// Find if the Array is a Palindrome

public class Program20 {
    public static boolean recursive(int arr[], int currentIdx) {
        if (currentIdx == arr.length / 2) {
            return true;
        } else if (arr[currentIdx] != arr[arr.length - 1 - currentIdx]) {
            return false;
        } else {
            return recursive(arr, currentIdx + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 8, 9, 8, 6, 5, 4 };
        System.out.println(recursive(arr, 0));
    }
}
