// Is this String a Palindrome

public class Program15 {
    public static boolean recursive(String text) {
        if (text.length() == 0 || text.length() == 1) {
            return true;
        } else if (text.charAt(0) == text.charAt(text.length() - 1)) {
            return recursive(text.substring(1, text.length() - 1));
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(recursive("madam"));
    }
}
