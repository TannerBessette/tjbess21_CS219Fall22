package Exam1;

import java.util.Scanner;

public class Exam1 {

    public static void main(String[] args) {
        boolean valid = false;
        Scanner kbd = new Scanner(System.in);
        int num = 0;
        while (!valid) {
            System.out.print("Enter a positive integer: ");
            if (kbd.hasNextInt()) {
                num = kbd.nextInt();
                if (num <= 0) {
                    System.out.printf("Error: please enter a number greater than 0. You entered %s",
                            kbd.next());
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
        int n = 0;
        int d = 0;
        while (num > 0) {
            if ((num) > (999999)) {
                num = num / 10;
            } else if ((num) <= 999999) {
                num = num / 10;
                n++;
            }
        }
        d = n - 2;
        if (d <= 0) {
            d = 0;
        }
        return d;
    }

    }

