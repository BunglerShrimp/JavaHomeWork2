package homework2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        System.out.println("array" + method2(arr));
    }

    public static String method2(int[] arr) {
        int[] arr1 = arr;
        int n = 1;
        for (int i = 0; i < arr.length; i++, n = n + 3) {
            arr[i] = n;
        }
        return Arrays.toString(arr1);
    }
}
