package u7.practice.bucketsort;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {54, 83, 46, 66, 95, 92, 43};

        bucketSort(intArray);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void bucketSort(int[] input) {
        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            // using LinkedList as the buckets
            //buckets[i] = new LinkedList<Integer>();
            // using ArrayList as the buckets
            //buckets[i] = new ArrayList<Integer>();
            // using Vector as the buckets
            buckets[i] = new Vector<Integer>();
        }

        for (int i = 0; i < input.length; i++) {
            buckets[hash(input[i])].add(input[i]);
        }

        for (List bucket: buckets) {
            Collections.sort(bucket);
        }

        int j = 0; // tracking input array
        for (int i = 0; i < buckets.length; i++) {
            for (int value: buckets[i]) {   // tracking buckets
                input[j++] = value;
            }
        }
    }

    private static int hash(int value) {
        return value / (int)10 % 10;
    }
}
