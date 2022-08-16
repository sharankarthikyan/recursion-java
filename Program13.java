// the total number of vowels

public class Program13 {
    public static int recursive(String str) {
        if (str.isEmpty()) {
            return 0;
        } else if (str.charAt(0) == 'A' || str.charAt(0) == 'E' ||
                str.charAt(0) == 'I' || str.charAt(0) == 'O' ||
                str.charAt(0) == 'U' || str.charAt(0) == 'a' || str.charAt(0) == 'e' ||
                str.charAt(0) == 'i' || str.charAt(0) == 'o' || str.charAt(0) == 'u') {
            return 1 + recursive(str.substring(1));
        } else {
            return recursive(str.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(recursive("HELLo Worldoi"));
    }
}
