package homework2;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("array" + method3(arr));
    }

    public static String method3(int[] arr) {
        int[] arr1 = arr;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;
        }
        return Arrays.toString(arr1);
    }
}
