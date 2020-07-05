package org.coursera.learn.csprogrammingjava.week3;

public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]); // mines
        boolean[][] mineArr = new boolean[m][n];
        int[][] numArr = new int[m + 2][n + 2];

        // Mine laying
        for (int cntMine = 0; cntMine < k;) {
            int row = (int) (Math.random() * m);
            int col = (int) (Math.random() * n);
            if (!mineArr[row][col]) {
                mineArr[row][col] = true;
                numArr[row + 1][col + 1] = -1;// laid
                cntMine++;
            }
        }

        // count mine
        String ans = "";
        for (int i = 1; i < numArr.length - 1; i++) {
            for (int j = 1; j < numArr[i].length - 1; j++) {
                if (numArr[i][j] != -1) {
                    int neighbors = 0;
                    for (int ii = i - 1; ii < i + 2; ii++) {
                        for (int jj = j - 1; jj < j + 2; jj++) {
                            if (0 < ii && ii <= m && 0 < jj && jj <= n && (ii != i || jj != j)) {
                                if (mineArr[ii - 1][jj - 1])
                                    neighbors++;
                            }
                        }
                    }
                    numArr[i][j] = neighbors;
                    ans = ans.concat(numArr[i][j] + "  ");
                } else {
                    ans = ans.concat("*  ");
                }
            }
            ans = ans.concat("\n");
        }

        System.out.print(ans);
    }
}