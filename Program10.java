// Reverse a String

public class Program10 {
    public static String recursive(String str) {
        if (str.isEmpty()) { // base case
            return "";
        } else { // recursive case
            return recursive(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        System.out.println(recursive("Hello World"));
    }
}
