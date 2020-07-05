package org.coursera.learn.csprogrammingjava.week1;

public class RightTriangle {
    public static void main(String[] args) {
        long a = Long.parseLong(args[0]);
        long b = Long.parseLong(args[1]);
        long c = Long.parseLong(args[2]);

        boolean arePositive = (a > 0 && b > 0 && c > 0);
        boolean falseisRightTriangle = (a * a + b * b == c * c || c * c + a * a == b * b || b * b + c * c == a * a);

        System.out.println(arePositive && falseisRightTriangle);
    }
}