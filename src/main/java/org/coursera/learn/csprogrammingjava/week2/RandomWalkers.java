package org.coursera.learn.csprogrammingjava.week2;

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double sum = 0;

        for (int i = 0; i < trials; i++) {
            int x = 0, y = 0, distMa = 0, steps = 0;
            while (true) {
                if (r == distMa)
                    break;

                // direction
                double tmp = Math.random();
                if (tmp < 0.25) {
                    y++; // north
                } else if (tmp < 0.5) {
                    x++; // east
                } else if (tmp < 0.75) {
                    y--; // sourth
                } else {
                    x--; // west
                }

                // calc Manhattan distance
                distMa = Math.abs(0 - x) + Math.abs(0 - y);
                steps++;
            }
            sum += steps;
        }

        System.out.println("average number of steps = " + (sum / trials));
    }
}