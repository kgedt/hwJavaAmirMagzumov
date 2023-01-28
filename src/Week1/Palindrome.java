package Week1;

public class Palindrome {
    public Palindrome() {}

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) return false;
        return true;
    }
    public static boolean isPalindrome(Integer num) {

        String str = num.toString();
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) return false;
        return true;
    }
}
