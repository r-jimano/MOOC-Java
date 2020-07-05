package org.coursera.learn.csprogrammingjava.week4;

public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int cnt = 0;
        int[] arr = new int[m + 1];

        while (!StdIn.isEmpty()) {
            int x = StdIn.readInt();
            arr[x]++;
            cnt++;
        }

        // H=−(p1log2p1+p2log2p2+…+pmlog2pm)
        double h = 0.0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            }
            double pi = ((double) arr[i]) / cnt;
            h -= pi * (Math.log(pi)/ Math.log(2));
        }

        StdOut.printf("%.4f\n", h);
    }
}