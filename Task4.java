package homework2;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 6, 24, 1, 9, 5, 6, 4, 12, 2};
        System.out.println("Максимальное значение в заданном массиве: " + method4(arr) + " и минимальное значение в заданном массиве:" + method5(arr));
    }

    public static int method4(int[] arr) {
        int min = arr[0], max = arr[0], indMax = 0, indMin = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indMax = i;
            }
        }
        return max;
    }
    public static int method5(int[] arr) {
        int min = arr[0], max = arr[0], indMax = 0, indMin = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                indMin = i;
            }
        }
        return min;
    }
}














