package Week2;

import java.lang.Math;

public class nCube {
    public static void main(String[] args) {
        int n = 1;
        while (Math.pow(n + 1, 3) < 12000) n++;
        System.out.println("n^3 < 12.000 is " + n);
    }
}
