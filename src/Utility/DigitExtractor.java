package Utility;

public class DigitExtractor {

    public static int last(int n){
        if (n < 0) {
            n = -n;
        };
        return n % 10;
    }

    public static int secondTolast(int n){
        if (n < 0) {
            n = -n;
        }
        int f = n / 10;
        return f % 10;
    }

    public static int AnothersecondTolast(int n){
        String s = Integer.toString(n);
        n = Math.abs(n);
        return (n / 10) % 10;
    }

    public static void main(String [] args){
        System.out.println(AnothersecondTolast(2753));
        /* the == should mean it prints out true if the correct answer is 3 */
        System.out.println(AnothersecondTolast(-749));



    }

}
