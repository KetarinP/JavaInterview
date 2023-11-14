package SumOfTwo;

import java.util.Arrays;

public class SumOfTwo2 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sumOfTwo(new int[] {1, 3, 6, 9, 13}, 15)));
        System.out.println(Arrays.toString(sumOfTwo(new int[] {1, 3, 6, 9, 13, 32}, 33)));
    }

    public static int[] sumOfTwo(int[] arrNum, int target) {

        for (int i = 0; i < arrNum.length; i++) {
            for (int j = i + 1; j < arrNum.length; j++) {
                if (arrNum[i] + arrNum[j] == target) {
                    return new int[] {arrNum[i], arrNum[j]};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
