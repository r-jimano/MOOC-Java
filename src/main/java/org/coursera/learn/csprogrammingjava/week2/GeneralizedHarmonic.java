package org.coursera.learn.csprogrammingjava.week2;

public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double r = (double) Integer.parseInt(args[1]);
        double ans = 0.0;

        for (int i = 0; i < n; i++) {
            double tmp = (double) i + 1;
            ans += 1.0 / Math.pow(tmp, r);
        }

        System.out.println(ans);
    }
}