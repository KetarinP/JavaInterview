package ReverseArray;

import java.util.Arrays;

public class ReverseArray2 {

    public static void main(String[] args) {

        int[] inputArray = {2, 5, 7, 9};
        revArray(inputArray);
        System.out.println(Arrays.toString(inputArray));
        System.out.println("========");

        int[] inputArrayTwo = {1, 2, 3, 4};
        int[] revArray = getRevArray(inputArrayTwo);
        System.out.println(Arrays.toString(inputArrayTwo));
        System.out.println(Arrays.toString((revArray)));

    }

    public static void revArray(int[] arr) {

        int end = arr.length - 1;

        for (int start = 0; start < arr.length / 2; start++) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            end--;
        }
    }

    public static int[] getRevArray(int[] arr) {

        int[] arrResult = new int[arr.length];

        int start = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arrResult[start++] = arr[i];
        }
        return arrResult;
    }
}
