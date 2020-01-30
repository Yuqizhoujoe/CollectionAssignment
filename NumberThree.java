package com.example.java;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by JOE on
 **/
public class NumberThree {

    public static void displayNonduplicateWords(String filePath) throws IOException {
        // set BufferReader to null
        BufferedReader in = null;
        try {
            // read the file
            in = new BufferedReader(new FileReader(filePath));
            // create text variable
            String text;
            // convert the text into lowercase
            text = in.readLine().toLowerCase();
            // replace the comma with "" in the string
            text = text.replaceAll("[,]", "");
            // create ArrayList to store the String Array
            List<String> list = new ArrayList<>();
            for (String elem : text.split(" ")) {
                list.add(elem);
            }
            // sort the ArrayList ascending
            Collections.sort(list);
            // loop through the Array List
            for (String elem : list) {
                // print the frequency of String which is equal to 1
                if (Collections.frequency(list, elem) == 1) {
                    System.out.print(elem + " ");
                }
            }
        } finally {
            // close the file
            if (in != null) {
                in.close();
            }
        }

    }

    public static void main(String args[]) throws IOException {
        NumberThree.displayNonduplicateWords("file/Student.txt");
    }

}
