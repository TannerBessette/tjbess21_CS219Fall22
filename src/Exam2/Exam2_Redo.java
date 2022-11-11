package Exam2;

import java.net.URL;
import java.util.Scanner;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;



public class Exam2_Redo {

    public static String [] load_words(String path, int n) {
        // connect to the web page of speeds
        URL url = null;    // null is the "nothing value"
        Scanner s = null;

        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // create an array of strings
        String[] words = new String[n];
        int i = 0;
        while (s.hasNextLine()) {
            words[i++] = s.nextLine();
        }
        return words;
    }

    public static String [] isPalindrome(String [] words) {
        int count = 0;
        String[] palindromes = new String[9];
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(reverse_string(words[i]))) {
                palindromes[count] = words[i];
                count++;
            }
        }
        return palindromes;
    }


    public static String reverse_string(String r) {
        String m = "";
        for (int i = r.length() - 1; i >= 0; i--) {
            m += r.charAt(i);
        }
        return m;
    }

    public static String [] reverse_arr(String [] palindromes) {
        for (int i = 0; i < palindromes.length/2; i++) {
            String temp = palindromes[i];
            palindromes[i] = palindromes[palindromes.length - 1 - i];
            palindromes[palindromes.length - 1 - i] = temp;
        }
        return palindromes;
    }


    public static void main(String[] args) {
        String [] words = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt",
                2309);
        String [] reverse_pal = reverse_arr(isPalindrome(words));
        for (int i = 0; i < 9; i++){
            System.out.println(reverse_pal[i]);
        }

    }



}
