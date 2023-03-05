package algorithms;

import java.util.Arrays;
import java.util.LinkedList;

public class Sortings {
    //Bucket
    // TC: best, avg O(n+k), worst O(nlogn)
    // SC: O(n)
    public static void BucketSort(int[] a) {
        int size = 10;
        LinkedList<Integer>[] buckets = new LinkedList[size];

        for (int i = 0; i < size; i++)
            buckets[i] = new LinkedList<>();

         // { [0-9] [10-19] [20-29] ... [80-89] [90-99] }

        // Impelement with insertion add
        // 16 89, 25
        // int(16/10) = int(1.6) = 1
        // int(89/10) = int(8.9) = 8
        // int (25/10) = int(2.5) = 2

        // 12 19 25 add(20)
        // 12 19 25 [20] (25 > 20)
        // 12 19 [20] 25 (19 < 20) break

        for (int value : a) {
            int i = value / 10;
            buckets[i].add(value);
            for (int j = buckets[i].size() - 1; j > 0 && buckets[i].get(j - 1) > buckets[i].get(j); j--) {
                int tmp = buckets[i].get(j - 1);
                buckets[i].set(j - 1, buckets[i].get(j));
                buckets[i].set(j, tmp);
            }
        }

        int ind = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                a[ind++] = buckets[i].get(j);
            }
        }
    }

    //Count Sort
    //TC: O(n+k)
    //SC: O(max)
    // Implement with negative values
    public static void CountSort(int[] a) {
        int max = Arrays.stream(a).max().getAsInt();
        int min = Arrays.stream(a).min().getAsInt();
        int[] count = new int[max - min + 1];
        // 1, 4, 6, 4, 8
        // min = 1, max = 8
        // counts = [0, 0, 0, 0, 0, 0, 0, 0, 0]
        // val = [1]
        // counts[val]++
        // counts = [0, 1, 0, 0, 0, 0, 0, 0, 0]
        // val = [4]
        // counts[val]++
        // counts = [0, 1, 0, 0, 1, 0, 0, 0, 0]
        // val = [6]
        // counts[val]++
        // counts = [0, 1, 0, 0, 1, 0, 1, 0, 0]
        // val = [4]
        // counts[val]++
        // counts = [0, 1, 0, 0, 2, 0, 1, 0, 0]
        // val = [8]
        // counts[val]++
        // counts = [0, 1, 0, 0, 2, 0, 1, 0, 1]

        // loop stop

        // for (int val = 0; val < counts.size; val++)
        //      for (int n = 0; n < counts[val]; n++ )
        // []
        // [1]
        // [1, 4, 4]
        // [1, 4, 4, 6]
        // [1, 4, 4, 6, 8] <> [1, 4, 6, 4, 8]

        int zero = count.length - 1 - max; // -2 -1 [0] 1 2 3 4 5 6 7

        for (int value : a) count[zero + value]++;

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                a[index++] = i - zero;
            }
        }
    }

    //Implement with negative
    // TC: O(d(n+k))

    public static void RadixSort(int[] a, int cursor) {
        int pos_count = 0;
        int neg_count = 0;
        for (int val : a) {
            if (val >= 0)
                pos_count++;
            else
                neg_count++;
        }
        int[] pos = new int[pos_count];
        int[] neg = new int[neg_count];
        int p = 0;
        int n = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0)
                pos[p++] = a[i];
            else
                neg[n++] = -a[i];
        }

        Radix(neg, cursor);
        Radix(pos, cursor);

        int i = 0;

        while (--n >= 0) {
            a[i++] = -neg[n];
        }
        while (++n < p) {
            a[i++] = pos[n];
        }
    }

    private static void Radix(int[] a, int cursor) {
        int[] counts = new int[10];
        int[] out = new int[a.length];

        for (int value : a) {
            counts[value / cursor % 10]++;
        }

        for (int i = 1; i < counts.length; i++)
            counts[i] += counts[i - 1];

        for (int i = a.length - 1; i >= 0; i--) {
            int index = a[i] / cursor % 10;
            out[counts[index] - 1] = a[i];
            counts[index]--;
        }

        for (int i = 0; i < a.length; i++)
            a[i] = out[i];
    }
}


