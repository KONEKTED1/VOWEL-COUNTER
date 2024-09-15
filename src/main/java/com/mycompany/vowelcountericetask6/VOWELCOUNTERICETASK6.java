/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vowelcountericetask6;

/**
 *
 * @author MOFENYI
 */
public class VOWELCOUNTERICETASK6 {

    
public class VowelCounter {

    // Function to count the number of vowels in a string
    public static int countVowels(String sentence) {
        // Convert the string to lowercase to handle case insensitivity
        sentence = sentence.toLowerCase();

        // Define the vowels
        String vowels = "aeiou";
        int vowelCount = 0;

        // Iterate through each character in the string
        for (int i = 0; i < sentence.length(); i++) {
            // Get the current character
            char currentChar = sentence.charAt(i);

            // Check if the current character is a vowel
            if (vowels.indexOf(currentChar) != -1) {
                vowelCount++;
            }
        }

        // Return the total number of vowels
        return vowelCount;
    }

    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.println("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        // Call the countVowels function and display the result
        int numberOfVowels = countVowels(inputSentence);
        System.out.println("Number of vowels: " + numberOfVowels);

     
    }
}
}
