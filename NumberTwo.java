package com.example.java;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by JOE on
 **/
public class NumberTwo {

    public static void mostOccurrenceNumbers(){

        // create instance from Scanner class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number here, 0 to quit.");
        // create Integer variable to store input number
        int inputNumber;
        // create ArrayList to store all the input numbers
        Map<Integer, Integer> inputNumArr = new HashMap<Integer, Integer>();
        ArrayList<Integer> array = new ArrayList<>();
        // use do while loop to repetitively enter number and quit when input number != 0
        do {
            inputNumber = in.nextInt();
            if (!inputNumArr.containsKey(inputNumber)) {
                // if Map inputNumArr does not contain the input number, set the value to 1
                inputNumArr.put(inputNumber,1);
            } else {
                // if the Map contains the input number, increment the value
                inputNumArr.put(inputNumber, inputNumArr.get(inputNumber)+1);
            }
            // add the input number into ArrayList
            array.add(inputNumber);
        } while (inputNumber != 0);
        // set the max value(frequency of most occurrence)to 0
        int max = 0;
        // create set instance from HashSet class
        Set<Integer> mostOccurrenceNumber = new HashSet<>();
        // get the max value from the ArrayList
        for (int elem : array) {
            if (inputNumArr.get(elem) > max) {
                max = inputNumArr.get(elem);
            }
        }
        // get the input number which has most occurrence
        for (int elem : array) {
            if (inputNumArr.get(elem) == max) {
                mostOccurrenceNumber.add(elem);
            }
        }
        System.out.println("The most occurrence numbers: ");
        for (int elem : mostOccurrenceNumber) {
            System.out.print(elem + " ");
        }
    }

    public static void main(String args[]) {
        NumberTwo.mostOccurrenceNumbers();
    }

}
