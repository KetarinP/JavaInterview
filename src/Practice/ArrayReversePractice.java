package Practice;

import java.util.Arrays;

public class ArrayReversePractice {
    public static void main(String[] args) {

        int[] inputArray = {8, 3, 5, 9, 1 ,3, 6};
        System.out.println(Arrays.toString(inputArray));
        revArray(inputArray);
        System.out.println(Arrays.toString(inputArray));
    }

    public static void revArray(int[] arr) {
        int endPoint = arr.length -1;

        for (int startPoint = 0; startPoint < arr.length / 2; startPoint++) {
            int temp = arr[startPoint];
            arr[startPoint] = arr[endPoint];
            arr[endPoint] = temp;
            endPoint--;
        }
    }
}
