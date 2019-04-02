package u7.practice.arraysorting;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] intArray = {25, 32, 20, 30, 35, 35, 39, 85, 69, 83, 9, 100, 91, 97, 100, 17, 42, 75, 71, 3, 16, 59, 4, 24, 17, 90, 65, 76, 53, 11, 45, 37, 59, 73, 38, 73, 34, 48, 79, 11, 46};
	Arrays.parallelSort(intArray);
	for(int value : intArray) {
	    System.out.print(value+" ");
    }
    }
}
