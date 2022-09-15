/*
 * Tanner Bessette
 * 9/14/2022
 * HW 3
 */

package HW3;

import Utility.Investment;

import java.util.Scanner;

public class UpdatedInvestment {

    public static double investment(double c, double r, int t, int n) {
        return c * Math.pow(1 + r / n, t * n);

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter an initial investment: ");
        double initial_investment = 0;
        if (in.hasNextDouble()) {
            initial_investment = in.nextDouble();
        }
        else{
            System.err.print("Error: integer expected. You entered: " + initial_investment);
            return;
        }

        if (initial_investment <= 0) {
            System.err.println("Error: initial deposit should be greater than zero. You entered: "
                    + initial_investment);
            return;
        } else {
            System.out.print("Enter an interest rate as a decimal: ");
            double interest_rate = 0;
            if (in.hasNextDouble()) {
                interest_rate = in.nextDouble();
            }
                else {
                    System.err.println("Error: interest rate should be expressed as a decimal between 0 and 1.\n" +
                            "For example 8% should be entered as .08.You entered: " + interest_rate);
                    return;
                }
               if (interest_rate < 0) {
                System.err.println("Error: initial deposit should be greater than zero. You entered: " + interest_rate);
                return;
            }
            System.out.print("Please enter the number of years as an integer: ");
            int years = 0;
            if(in.hasNextInt()) {
                years = in.nextInt();
            }
                else {
                    System.err.println("Error: years should be expressed as an integer. You entered: " + years);
                    return;
            }
                if (years <= 0) {
                    System.err.println("Error: years should be greater than zero. You entered: " + years);
                    return;
                }
                System.out.print("Please enter the number of times to compound per year as an integer: ");
                int compound = 0;
                if(in.hasNextInt()) {
                    compound = in.nextInt();
                }
                    else {
                        System.err.println("Error: number of times to compound per year should be " +
                                "expressed as an integer. You entered: " + compound);
                }   if (compound <= 0) {
                        System.err.println("Error: number of times to compound per year should be " +
                                "greater than 0. You entered: " + compound);
            }
            System.out.printf("Your investment is  worth $%.2f",
                    UpdatedInvestment.investment(initial_investment,interest_rate,years,compound));

        }



    }
}

