package ReverseArray;

import java.util.Arrays;

public class ReverseArray1 {

    public static void main(String[] args) {

        int[] inputArray = {2, 6, 9, 7, 1};
        revArray(inputArray);
        System.out.println(Arrays.toString(inputArray));
        System.out.println("=====");

        int[] inputArrayTwo = {2, 3, 10, 33, 21};
        int[] revArray = getRevArray(inputArrayTwo);
        System.out.println(Arrays.toString(revArray));
    }

    public static void revArray(int[] arr) {

        int end = arr.length-1;

        for (int start = 0; start < arr.length /2; start++) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
        }
    }

    public static int[] getRevArray(int[] arr) {

        int[] revResArray = new int[arr.length];
        int start = 0;

        for (int i = arr.length-1; i >= 0; i--) {
            revResArray[start++] = arr[i];
        }
        return revResArray;
    }
}
