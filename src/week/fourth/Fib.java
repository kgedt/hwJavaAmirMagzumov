package week.fourth;

public class Fib {
    public static long calculate(int num) {
        if (num <= 1) return num;
        long a = 1;
        long b = 1;
        long result = 0;
        for (int i = 2; i < num; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }
    private Fib() {}
}
