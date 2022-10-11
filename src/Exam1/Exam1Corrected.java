package Exam1;

import java.util.Scanner;

public class Exam1Corrected {
    public static void main(String[] args) {
        boolean valid = false;
        Scanner kbd = new Scanner(System.in);
        int num = 0;
        while (!valid) {
            System.out.print(" Enter a positive integer: ");
            if (kbd.hasNextInt()) {
                num = kbd.nextInt();
                if (num <= 0) {
                    System.out.print("Error: please enter a number greater than 0. You entered: " +
                            num);
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: please enter a number greater than 0. You entered %s",
                        kbd.next());
            }


        }
        System.out.println(getInts(num));
    }

    public static int getInts(int num) {
        int digits = 0;
        int n = 0;
        while (num > 0) {
            n = num % 10;
            num = num / 10;
            if (n > 2 && n < 7)
                digits ++;
        }
        return digits;
    }
}

