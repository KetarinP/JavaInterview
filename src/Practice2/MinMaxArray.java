package Practice2;

public class MinMaxArray {
    public static void main(String[] args) {
        System.out.println(max(new int[]{2, 3, 7, 4, 0, 1}));
        System.out.println(max(new int[]{1, 5, 2}));
        System.out.println(max(new int[]{5, 3, 8, 6}));
        System.out.println(max(new int[]{2, 3, 7, 4, 0, 1, 9}));
        System.out.println("=================");
        System.out.println(min(new int[]{2, 3, 7, 4, 0, 1}));
        System.out.println(min(new int[]{1, 5, 2}));
        System.out.println(min(new int[]{5, 3, 8, 6}));
        System.out.println(min(new int[]{2, 3, 7, 4, 0, 1, 9}));

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
        for (int element : arr) {
            if (min > element) {
                min = element;
            }
        }
        return min;
    }
}
