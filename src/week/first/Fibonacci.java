package week.first;

public class Fibonacci {
    public static long calculate(int num) {
        if (num <= 1) return num;
        long a = 1, b = 1;
        long result = 0;
        for (int i = 2; i < num; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }
}

//