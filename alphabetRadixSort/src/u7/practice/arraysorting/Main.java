package u7.practice.arraysorting;

import java.util.Arrays;

public class Main {

    public static void main(String args[]) {

        String[] radixStringArray = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        radixSort(radixStringArray, 26, 5);

        for (int i = 0; i < radixStringArray.length; i++) {
            System.out.println(radixStringArray[i]);
        }
    }

    public static void radixSort(String[] input, int radix, int width) {

        for (int i = width - 1; i >= 0; i--) {
            radixSingleSort(input, i, radix);
        }
    }
    public static void radixSingleSort(String[] input, int position, int radix) {

        int numItems = input.length;

        int[] countArray = new int[radix];

        for (String value: input) {
            countArray[getLetterIndex(position, value)]++;
        }

        //Adjust the count array
        for (int j = 1; j < radix; j++) {

            countArray[j] += countArray[j - 1];
        }

        String[] temp = new String[numItems];

        for(int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {

            temp[--countArray[getLetterIndex(position, input[tempIndex])]] = input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {

            input[tempIndex] = temp[tempIndex];
        }

    }

    public static int getLetterIndex(int position, String value) {

        return value.charAt(position) - 'a';
    }

}
