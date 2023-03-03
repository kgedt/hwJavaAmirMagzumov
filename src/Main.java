import java.util.Arrays;

import static algorithms.Sortings.*;

public class Main {
    public static void runRadixSort(int[] a) {
        int max = Arrays.stream(a).max().getAsInt();
        int cursor = 1;
        while (max != 0) {
            RadixSort(a, cursor);
            max /= 10;
            cursor *= 10;
        }
    }

    public static void main(String[] args) {
        int[] radix_arr = {10, 21, 24, 31, 501, 1, 123, -2, -5, -1};
        int[] count_arr = {7, 0, 1, 7, 2, 3, -2, 4, 5, 6, -1, 7};
        int[] bucket_arr = {10, 21, 24, 31, 501, 1, 123};
        runRadixSort(radix_arr);
        CountSort(count_arr);
        BucketSort(bucket_arr);
        System.out.println("Radix: " + Arrays.toString(radix_arr));
        System.out.println("Count: " + Arrays.toString(count_arr));
        System.out.println("Bucket: " + Arrays.toString(bucket_arr));
    }
}