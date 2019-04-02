package u7.practice.mergesort;

public class Main {
    public static int count = 0;
    public static void main(String[] args) {
	    int[] intArray = {7, 5, 3, 1,2,9,0,6,8};

        mergeSort(intArray, 0, intArray.length);
        //System.out.println(count);

        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }
    public static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }
    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] < input[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while(i < mid && j < end) {

            if (input[i] <= input[j]) {
                temp[tempIndex++] = input[i++];
            }
            else {
                count ++;
                temp[tempIndex++] = input[j++];
            }
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);


    }
}
