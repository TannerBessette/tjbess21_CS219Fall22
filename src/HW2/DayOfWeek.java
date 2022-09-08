/*
 * Tanner Bessette
 * 9/6/2022
 * HW 2
 */

package HW2;
import java.util.Scanner;

public class DayOfWeek {
    public static int dayofweek(int m, int d, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
        return d0;
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a number 1-12 corresponding to a month: ");
        int m  = s.nextInt();

        System.out.print("Please enter a number 1-31 corresponding to a day: ");
        int d = s.nextInt();

        System.out.print("Please enter a number 1-2022 corresponding to a year: ");
        int y = s.nextInt();

        System.out.print("The day of the week is: ");
        System.out.println(dayofweek(m,d,y));

    }

}