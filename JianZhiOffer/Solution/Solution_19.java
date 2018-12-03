package Solution;

import java.util.ArrayList;

public class Solution_19 {

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int tR = 0;
        int tC = 0;
        int dR = matrix.length - 1;
        int dC = matrix[0].length - 1;
        while (tR <= dR && tC <= dC) {
            printEdge(matrix, list, tR++, tC++, dR--, dC--);
        }
        return list;
    }

    //左上角的点（tR,tC)   右下角的点(dR,dC)
    // 左上角的点（3,3)     右下角的点(3,4)
    private void printEdge(int[][] matrix, ArrayList<Integer> list, int tR, int tC, int dR, int dC) {
        if (tR == dR) {               //横坐标相同
            for (int i = tC; i <= dC; i++) {
                list.add(matrix[tR][i]);
            }
        } else if (tC == dC) {         //纵坐标相同
            for (int i = tR; i <= dR; i++) {
                list.add(matrix[i][tC]);
            }
        } else {
            int curC = tC;
            int curR = tR;
            while (curC != dC) {
                list.add(matrix[tR][curC]);
                curC++;
            }
            while (curR != dR) {
                list.add(matrix[curR][dC]);
                curR++;
            }
            while (curC != tC) {
                list.add(matrix[dR][curC]);
                curC--;
            }
            while (curR != tR) {
                list.add(matrix[curR][tC]);
                curR--;
            }
        }
    }
}