package u7.practice.insertionsort;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args)throws IOException {

        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0)
        {
            t--;
            long count = 0;
            int n = sc.nextInt();
            int[] intArray = new int[n];

            for(int x=0;x<n;x++)
            {
                intArray[x] = sc.nextInt();

            }

           // Array: 2 1 3 1 2 -> 1 2 3 1 2 -> 1 1 2 3 2 -> 1 1 2 2 3
           // Moves:   -        1       -    2         -  1            = 4

            for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {

                int newElement = intArray[firstUnsortedIndex];

                int i;


                for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {

                    intArray[i] = intArray[i - 1];
                    count++;
                }

                intArray[i] = newElement;
            }

            System.out.println(count);
        }
    }
}
