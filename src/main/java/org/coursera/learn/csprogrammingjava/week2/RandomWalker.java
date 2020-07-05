package org.coursera.learn.csprogrammingjava.week2;

public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0, y = 0, distMa = 0;
        int steps = 0;

        while (true) {
            System.out.println("(" + x + ", " + y + ")");
            if (r == distMa) break;

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

        System.out.println("steps = " + steps);
    }
}