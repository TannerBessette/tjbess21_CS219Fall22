package Utility;

import java.util.Scanner;

public class Weather {
    public static double windchill(double t,   // temperature
                                   double v){   // velocity in mph
        return 35.75 + 0.6215*t + (0.4275*t - 35.75)* Math.pow(v, 0.16);
                // Math.pow(v, 0.16) raises v to the 0.16 power
    }

    public static void main(String [] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter temperature in degrees F: ");
        double temperature = kbd.nextDouble();

        System.out.print("Enter a wind velocity in MPH: ");
        double velocity = kbd.nextDouble();

        // System.out.printf("The windchill for " + temperature + " degrees Farenheit at " +
                       // velocity + " MPH is %.2f\n", windchill(temperature, velocity));
        System.out.printf("The windchill for %.1f degreees at %.1f MPH is %.2f\n",
                temperature, velocity, windchill(temperature, velocity));

        // See what this outputs (similar to something we could see on a test):
        System.out.println("They said \"Don't\ndo\nit\"");

    }
}
