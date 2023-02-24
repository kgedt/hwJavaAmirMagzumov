package week.second;

public class From100To200 {
    public static void main(String[] args) {
        int counter = 1;
        for (int i = 100; i <= 200; ++i) {
            if ((i % 5 == 0 || i % 6 == 0) && (i % (5 * 6) != 0)) {
                System.out.print(i + " ");
                if (counter % 10 == 0) {
                    System.out.println();
                    counter++;
                } else {
                    counter++;
                }
            }
        }
    }
}
