package u7.practice.hashtable;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws FileNotFoundException
    {

        // Read the file using whitespace as a delimiter (default)
        // so that the input will be split into words

        Scanner file = new Scanner(new File("C:\\Users\\U7K4R5H\\IdeaProjects\\testHash\\src\\u7\\practice\\hashtable\\ans.txt"));

        long startTime = System.nanoTime(); // Start time of creation of HashSet

        Set<String> crime = new HashSet<>();

        // For each word in the input

        while (file.hasNext()) {

            // Convert the word to lower case, trim it and insert into the set
            // In this step, you will probably want to remove punctuation marks

            crime.add(file.next().trim());
        }


        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("RunTime Of Creation of HashSet:==> "+totalTime);	//End time of creation of HashSet
        endTime = 0; totalTime = 0; startTime = 0;

        //Scanner sc = new Scanner(System.in);
        //String search = sc.nextLine();
        //search = search.trim();
        String str = "a";

        // Check if the set contains the search string
        startTime = System.nanoTime();	// Start time of Searching in HashSet

        if (crime.contains(str)) {
            System.out.println(str + " Yes");
        } else {
            System.out.println("No");
        }

        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("RunTime of Searching:==> "+totalTime);	// End time of Searching in HashSet
    }

}
