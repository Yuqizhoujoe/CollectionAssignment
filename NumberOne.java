package com.example.java;

import java.util.*;

/**
 * Created by JOE on
 **/
public class NumberOne {

    public static void displayVowelAndConsonant(){

        // create instance from Scanner class for user input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the text here: ");
        // store user input into String variable with converting to UpperCase
        String text = in.nextLine().toUpperCase();
        // set Integer variable to count vowels and consonants
        int countVowel = 0, countConsonant = 0;
        // create Character Array to store vowels
        char[] vowelArr = new char[]{'A', 'E', 'I', 'O', 'U'};
        // create List to store vowels from Character Array
        List<Character> vowels = new ArrayList<>();
        for (char c : vowelArr) {
            vowels.add(c);
        }
        // create a Set to store all vowel characters
        Set<Character> vowelSet = new HashSet<>();
        // use List.contains() to check if the character is vowel or consonant
        for (int i = 0; i < text.length(); i++) {
            if (vowels.contains(text.charAt(i))) {
                countVowel += 1;
                vowelSet.add(text.charAt(i));
            } else {
                countConsonant += 1;
            }
        }
        System.out.println("The number of vowels: " + countVowel +
                "\nThe number of consonants: " + countConsonant);
        System.out.println("The vowel characters are: ");
        for (char elem : vowelSet) {
            System.out.print(elem + " ");
        }
    }


    public static void main(String args[]) {
        NumberOne.displayVowelAndConsonant();
    }

}
