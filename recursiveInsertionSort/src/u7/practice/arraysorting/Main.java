package u7.practice.arraysorting;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {12, 56, 4, 22, 90, 4, 0, -99, 1000};

        recursiveIS(intArray, intArray.length);

        for (int value : intArray) {
            System.out.println(value);
        }
    }

    public static void recursiveIS(int[] input, int numItems) {

        if (numItems < 2) {
            return;
        }
        recursiveIS(input, numItems - 1);

        int newElement = input[numItems - 1];
        int i;

        for (i = numItems - 1; i > 0 && input[i - 1] > newElement; i--) {

            input[i] = input[i - 1];
        }

        input[i] = newElement;

        System.out.println("Result of items when numItems = " + numItems);
        for (int value : input) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("----------------------------------------------------");
    }
}
