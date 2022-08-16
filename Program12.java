// Merging Strings in Alphabetic Order

public class Program12 {
    public static String recursive(String one, String two) {
        if (one == null || one.equals("")) {
            return two == null ? one : two;
        } else if (two == null || two.equals("")) {
            return one;
        } else if (one.charAt(0) > two.charAt(0)) {
            return two.charAt(0) + recursive(one, two.substring(1));
        } else { // This recusive case handles == and <.
            return one.charAt(0) + recursive(one.substring(1), two);
        }
    }

    public static void main(String[] args) {
        System.out.println(recursive("abc", "cba"));
    }
}
