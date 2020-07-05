package org.coursera.learn.csprogrammingjava.week3;

public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] arr = new int[args.length - 1];
        int[] sum = new int[args.length - 1];
        for (int i = 0; i < args.length - 1; i++) {
            arr[i] = Integer.parseInt(args[i + 1]);
            sum[i] = (i != 0) ? sum[i - 1] + arr[i] : arr[i];
        }

        for (int i = 0; i < m; i++) {
            int random = (int) (Math.random() * (sum[sum.length - 1] - 1));
            int j;
            for (j = 0; j < sum.length; j++) {
                if (random < sum[j]) {
                    System.out.print((j + 1) + " ");
                    break;
                }
            }
        }

    }
}