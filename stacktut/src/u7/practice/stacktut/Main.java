package u7.practice.stacktut;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
public class Main{

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
            int len = 0;
            Arrays.sort(arr);
            len = i+1;
            double median = 0.0;

            if(len % 2 == 0)
            {
                int pos = len/2;

                 median = (double)((arr[pos - 1] + arr[pos])/2.0);
            }
            else
            {
                 median = (double)arr[(int)(len/2)];
            }
            System.out.println(median);
        }

    }
}