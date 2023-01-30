package Week1;

public class Factorial {
    public static long calculate(int n) {
        if (n <= 1) return 1;
        long result = 1;
        while (n >= 1)
            result *= n--;
        return result;
    }
}

//