package homework2;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;
        for (int i = 0; i < arr.length; i++) {
            for (int n1 = 0, n2 = arr[i].length; n1 < arr[i].length; n1++, n2--) {
                if (i == n1 || i == (n2 - 1)) arr[i][n1] = 1;
                System.out.print(arr[i][n1] + " ");
            }
            System.out.print("\r\n");
        }

    }
}
