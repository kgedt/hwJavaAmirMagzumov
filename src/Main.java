import week.fourth.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        GPA gpa = new GPA();
//        gpa.addDiscipline("Statistics", 4, 100);
//        gpa.addDiscipline("Java", 6, 0);
//        gpa.addDiscipline("Algorithms", 5, 95);
//        gpa.addDiscipline("Differential Equations", 5, 80);
//        System.out.println(gpa.getGPA());

        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0.0 || height <= 0.0 || extraBuckets < 0) return -1;

        double fullArea = width*height;

        int requiredNumberOfBuckets = fullArea/areaPerBucket > (int) (fullArea/areaPerBucket)
                ? (int) (fullArea/areaPerBucket) + 1 : (int) (fullArea/areaPerBucket);

        return requiredNumberOfBuckets - extraBuckets;
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double avg;
        int cnt = 0;
        int current;

        while (true) try {
            current = sc.nextInt();
            sum += current;
            cnt++;
        } catch (InputMismatchException IME) {
            try {
                avg = sum / cnt;
            } catch(ArithmeticException AE) {
                System.out.println("NO INPUT");
                break;
            }
            System.out.println(String.format("SUM = %d AVG = %.2f", sum, avg));
            break;
        }
    }
}