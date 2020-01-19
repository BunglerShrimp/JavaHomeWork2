package homework2;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("array" + method1(arr));
    }

    public static String method1(int[] arr){
        int[] arr1 = arr;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;

            } else {
                arr[i] = 1;
            }
        }
        return Arrays.toString(arr1);
    }
}
