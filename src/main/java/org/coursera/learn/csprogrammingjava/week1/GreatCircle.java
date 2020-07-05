package org.coursera.learn.csprogrammingjava.week1;

public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));

        // calc
        double r = 6371.0; // the mean radius of the Earth (in kilometers).
        double tmp = Math.pow(Math.sin((x2 - x1) / 2), 2.0)
                + Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin((y2 - y1) / 2), 2.0);
        tmp = Math.sqrt(tmp);
        double distance = 2 * r * Math.asin(tmp);
        System.out.println(distance + " kilometers");
    }
}