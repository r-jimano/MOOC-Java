package org.coursera.learn.csprogrammingjava.week3;

public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int[] arr = new int[n + 2];
        int i = 1;
        double fraction = 0.0;
        int count = 0;

        System.out.println(i + "\t" + arr[i] + "\t" + fraction);
        while (fraction < 0.5) {
            count = 0;
            for (int j = 0; j < trials; j++) {
                boolean[] found = new boolean[n];
                for (int k = 0; k < i + 1; k++) {
                    int random = (int) (Math.random() * n);
                    if (!found[random]) {
                        found[random] = true;
                    } else {
                        count++;
                        break;
                    }
                }
            }

            int tmp = 0;
            for (int j = 0; j < i + 1; j++) {
                tmp += arr[i - j];
            }
            arr[i] = count - tmp;

            fraction = (double) count / trials;
            System.out.println((i + 1) + "\t" + arr[i] + "\t" + fraction);
            i++;
        }

    }
}