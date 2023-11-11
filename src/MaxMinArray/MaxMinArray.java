package MaxMinArray;

public class MaxMinArray {

    public static void main(String[] args) {

        System.out.println(max(new int[]{4, 5, 99, 8, 1, 2}));
        System.out.println(max(new int[]{23, 5, 1, 2}));
        System.out.println(max(new int[]{7, 8, 1, 3}));
        System.out.println("===========");
        System.out.println(min(new int[]{1, 0, 55, 99, 100}));
        System.out.println(min(new int[]{1, 55, 99}));
        System.out.println(min(new int[]{55, 88, 54, 23}));

    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int element : arr) {
            if (max < element) {
                max = element;
            }
        }
        return max;
    }

    public static int min(int[] arr) {

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
