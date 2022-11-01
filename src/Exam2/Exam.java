package Exam2;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;

public class Exam {

    public static String [] load_words(String path, int n) {

        // connect to the web page
        URL url = null;  // null is the nothing value --> like none in Python
        Scanner s = null;

        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // create an array of strings
        String [] words = new String[n];
        int i = 0;
        while(s.hasNextLine()){
            words[i++] = s.nextLine();
        }

        String [] palindromes = new String [9];

        // want to check if each word is a palindrome, and if it is add it to the palindromes string
        while (i < words.length/2) {
            if (words[i].equals(words[words.length - 1 - i])){
                i++;
                palindromes += words[i];
            }
            else {
                break;
            }

        }
        // make the palindrome alphabetical before returning
        return palindromes;
    }

    // would need to change this before calling
    public static void reverse(int [] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

    }

    public static void main(String[] args) {
        String [] words = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt", 2309);
        Random rng = new Random();
        rng.setSeed(23);
        // call on a reverse function to reverse the order of the already alphabetical ordered arrays to make them in
                // reverse alphabetical order
        System.out.println(reverse(palindromes));
    }

}
