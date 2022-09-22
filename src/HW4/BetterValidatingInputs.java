package HW4;

import HW3.UpdatedInvestment;

import java.util.Scanner;

public class BetterValidatingInputs {
    public static double investment(double initial_investment,
                                    double interest_rate, int years, int compound) {
        return initial_investment * Math.pow(1 + interest_rate / compound, years * compound);

    }

    public static void main(String args[]) {
        Scanner kbd = new Scanner(System.in);
        double initial_investment = getInitialInvestment(kbd);
        double interest_rate = getInterestRate(kbd);
        int years = getYears(kbd);
        int compound = getCompound(kbd);
        System.out.printf("Your investment is  worth $%.2f",
                BetterValidatingInputs.investment(initial_investment, interest_rate, years, compound));

    }

    public static double getInitialInvestment(Scanner i) {
        boolean valid = false;
        double initial_investment = 0;
        while (!valid) {
            System.out.print("Enter an initial investment: ");
            if (i.hasNextDouble()) {
                initial_investment = i.nextDouble();
                if (initial_investment <= 0) {
                    System.out.printf("Error: please enter a number greater than 0. You entered %s",
                            i.next());
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: please enter a number greater than 0. You entered %s",
                        i.next());
            }

        }
        return initial_investment;
    }

    public static double getInterestRate(Scanner r) {
        boolean valid = false;
        double interest_rate = 0;
        while (!valid) {
            System.out.print("Enter an interest rate: ");
            if (r.hasNextDouble()) {
                interest_rate = r.nextDouble();
                if (interest_rate <= 0) {
                    System.out.printf("Error: please enter a decimal. You entered %s",
                            r.next());
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: please enter a decimal. You entered %s",
                        r.next());
            }

        }
        return interest_rate;
    }

    public static int getYears(Scanner y) {
        boolean valid = false;
        int years = 0;
        while (!valid) {
            System.out.print("Enter a number of years: ");
            if (y.hasNextInt()) {
                years = y.nextInt();
                if (years <= 0) {
                    System.out.printf("Error: please enter a number greater than 0. You entered %s",
                            y.next());
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: please enter a number greater than 0. " +
                                "(Example: 5) You entered %s",
                        y.next());
            }

        }
        return years;
    }

    public static int getCompound(Scanner c) {
        boolean valid = false;
        int compound = 0;
        while (!valid) {
            System.out.print("Enter a number of times to compound per year: ");
            if (c.hasNextInt()) {
                compound = c.nextInt();
                if (compound <= 0) {
                    System.out.printf("Error: please enter a number greater than 0. You entered %s",
                            c.next());
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: please enter a number greater than 0. " +
                                "(Example: 2) You entered %s",
                        c.next());
            }

        }
        return compound;
    }
}