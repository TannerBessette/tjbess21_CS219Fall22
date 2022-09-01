package HW1;

// Exercise 2.3 from Textbook
// Tanner Bessette
public class Time {
    public static void main(String[] args) {
    // Question 2
    int hour = 13;
    int minute = 34;
    System.out.print("The current time is ");
    System.out.print(hour);
    System.out.print(":");
    System.out.print(minute);
    System.out.println(".");
    // Question 3
    System.out.print("Number of seconds since midnight: ");
    System.out.println(hour *60*60+minute*60);
    // Question 4
    System.out.print("Number of seconds left in the day: ");
            System.out.println(24*60*60-(hour*60*60)-(minute *60));
            // Question 5
        double minutes = 34;
        double hours = 13;
        System.out.print("Percent of the day that has passed: ");
    System.out.print(((hours/24)*100) + ((minutes/24/60)*100));
    System.out.println("%");
    // Question 6
    int hour2 = 13;
    int minute2 = 50;
    System.out.print("The elapsed time since I started working on this exercise is ");
    System.out.print(hour2 - hour);
    System.out.print(" hours and ");
    System.out.print(minute2-minute);
    System.out.println("minutes");
}
}
