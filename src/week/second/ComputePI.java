package week.second;

public class ComputePI {
    public static void main(String[] args) {
        double PI1 = 4, PI2 = 4, PI3 = 4, PI4 = 4;
        double sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;
        int n1 = 1_000, n2 = 10_000, n3 = 100_000, n4 = 1_000_000;

        int pow = 0;
        for (int i = 1; i <= n1; i += 2) {
            sum1 += Math.pow(-1, pow++) * (1 / (double) i);
        }
        PI1 *= sum1;
        System.out.println("PI1 = " + PI1);

        pow = 0;
        for (int i = 1; i <= n2; i += 2) {
            sum2 += Math.pow(-1, pow++) * (1 / (double) i);
        }
        PI2 *= sum2;
        System.out.println("PI2 = " + PI2);

        pow = 0;
        for (int i = 1; i <= n3; i += 2) {
            sum3 += Math.pow(-1, pow++) * (1 / (double) i);
        }
        PI3 *= sum3;
        System.out.println("PI3 = " + PI3);

        pow = 0;
        for (int i = 1; i <= n4; i += 2) {
            sum4 += Math.pow(-1, pow++) * (1 / (double) i);
        }
        PI4 *= sum4;
        System.out.println("PI4 = " + PI4);

        System.out.println("\nPI = " + Math.PI);
    }
}
