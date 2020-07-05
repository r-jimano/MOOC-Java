package org.coursera.learn.csprogrammingjava.week3;

public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        // gen sequence
        int thue[] = new int[n];
        for (int i = 0; i < thue.length; i++) {
            if (i == 0)
                thue[i] = 0;
            else if (i % 2 == 0)
                thue[i] = thue[i / 2];
            else
                thue[i] = 1 - thue[i - 1];
        }

        // print weave
        for (int i = 0; i < thue.length; i++) {
            String tmp = "";
            for (int j = 0; j < thue.length; j++) {
                tmp += (thue[i] == thue[j]) ? "+  " : "-  ";
            }
            System.out.println(tmp);
        }
    }
}