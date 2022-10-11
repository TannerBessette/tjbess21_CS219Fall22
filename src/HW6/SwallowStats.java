package HW6;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class SwallowStats {

    public static void swallow_stats(){

        // connect to the web page of speeds
        URL url = null;  // null is the nothing value --> like none in Python
        Scanner s = null;
        String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt";

        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        double sum = 0.0;
        int count = 0;
        double maximum = 0.0;
        double minimum = Double.POSITIVE_INFINITY;

        // What is true? --> if we get here we were able to connect to the website

        while (true) {
            if (!s.hasNextLine())
                break;

            String line = s.nextLine(); // read a line of the website

            if(line.indexOf("#") == -1 && !line.equals("")) { // modify condition
                sum = sum + Double.parseDouble(line);
                count++;
                if (Double.parseDouble(line) > maximum) {
                    maximum = Double.parseDouble(line);
                }

                if (Double.parseDouble(line) < minimum) {
                    minimum = Double.parseDouble(line);
                }

            }


        }

        System.out.println("The maximum swallow speed is: " + maximum);
        System.out.println("The minimum swallow speed is: " + minimum);
        System.out.printf("Average swallow speed is %.2f\n", sum / count);


    } // average swallow speed

    public static void main(String[] args) {
        swallow_stats();
    }

}
