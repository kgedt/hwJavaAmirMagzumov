package Week1;

public class CheckNumber {
    public static String check(int num) {
        if (0 == num) return "Zero";
        return num > 0 ? "Positive" : "Negative";
    }
}

//
