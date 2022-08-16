// Removing Duplicates in a String

public class Program11 {
    public static String recursive(String str) {
        if (str.length() == 1) {
            return str;
        }

        if (str.charAt(0) == str.charAt(1)) {
            return recursive(str.substring(1));
        } else {
            return str.charAt(0) + recursive(str.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(recursive("Hellllllo Worrld"));
    }
}
