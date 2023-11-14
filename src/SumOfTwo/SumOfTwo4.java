package SumOfTwo;

import java.util.Arrays;

public class SumOfTwo4 {

    public static void main(String[] args) {
        // {25, 34, 76, 21}, 46
        System.out.println(Arrays.toString(sumOfTwo(new int[]{25, 34, 76, 21}, 46))); // [25, 21]
        System.out.println(Arrays.toString(sumOfTwo(new int[]{25, 34, 76, 21}, 47))); // [-1, -1]

    }

    public static int[] sumOfTwo(int[] numArr, int target) {

        for (int i = 0; i < numArr.length; i++) {
            for (int j = i + 1; j < numArr.length; j++) {
                if (numArr[i] + numArr[j] == target) {
                    return new int[]{numArr[i], numArr[j]};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
