import java.util.Arrays;

public class SumOfTwo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfTwo(new int[] {1, 2, 3, 5}, 4))); // [1, 3]
        System.out.println(Arrays.toString(sumOfTwo(new int[] {7, 7, 4, 3, 8}, 7))); // [4, 3]
        System.out.println(Arrays.toString(sumOfTwo(new int[] {1, 4, 3, 2}, 5))); // [1, 4]
    }

    /**
     * //
     * sumOfTwo([1, 2, 3, 5], 4) -> [1, 3]
     * sumOfTwo([7, 7, 4, 3, 8], 7) -> [4, 3]
     * sumOfTwo([1, 4, 3, 2], 5) -> [1, 4]
     */
    public static int[] sumOfTwo(int[] numArr, int target) {

        // use nested loops to iterate over the arrays
        for (int i = 0; i < numArr.length; i++) {
            for (int j = i + 1; j < numArr.length; j++) {
                // checks if any pair of elements adds up to the target value.
                if (numArr[i] + numArr[j] == target) {
                    // If it finds such a pair, it returns a new array containing those two elements
                    return new int[] {numArr[i], numArr[j]};
                }
            }
        }
        // If it does not find any pair, it returns a new array with -1 and -1 as elements.
        return new int[] {-1, -1};
    }
}