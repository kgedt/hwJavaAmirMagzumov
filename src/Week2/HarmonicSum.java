package Week2;

public class HarmonicSum {
    public static void main(String[] args) {
        final int N = 50_000;
        double sumLR = 0.0;
        double sumRL = 0.0;
        double absDiff;

        for (int i = 1; i <= N; ++i) {
            sumLR += 1 / (double) i;
            sumRL += 1 / (double) (N - i + 1);
        }

        absDiff = Math.abs(sumLR - sumRL);
        System.out.println("abs Diff = " + absDiff);
    }
}
