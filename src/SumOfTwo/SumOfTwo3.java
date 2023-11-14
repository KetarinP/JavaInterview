package SumOfTwo;

import java.util.Arrays;

public class SumOfTwo3 {

    public static void main(String[] args) {
        // {2, 5, 8, 10}, 15
        System.out.println(Arrays.toString(SumOfTwo(new int[] {2, 5, 8, 10}, 15)));
    }

    public static int[] SumOfTwo(int[] numArr, int target) {

        for (int i = 0; i < numArr.length; i++) {
            for (int j = i + 1; j <numArr.length; j++) {
                if (numArr[i] + numArr[j] == target) {
                    return new int[] {numArr[i], numArr[j]};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
