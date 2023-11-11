package SumOfTwo;

import java.util.Arrays;

public class SumOfTwo1 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sumOfTwo(new int[] {1, 3, 2, 6}, 7)));
        System.out.println(Arrays.toString(sumOfTwo(new int[] {1, 3, 2}, 5)));
        System.out.println(Arrays.toString(sumOfTwo(new int[] {1, 3, 2, 6, 9, 10}, 19)));

    }

    public static int[] sumOfTwo(int[] numArr, int target) {

        for (int i = 0; i < numArr.length; i++) {
            for (int j = i + 1; j < numArr.length; j++) {
                if (numArr[i] + numArr[j] == target) {
                    return new int[] {numArr[i], numArr[j]};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
