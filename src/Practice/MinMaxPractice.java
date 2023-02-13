package Practice;

public class MinMaxPractice {
    public static void main(String[] args) {

        System.out.println(max(new int[] {3, 43, 65, 23, 3, 8, 19})); //65
        System.out.println(max(new int[] {12, 43, 23, 67, 3, 56, 19})); //67
        System.out.println(max(new int[] {13, 34, 89, 35, 3, 7, 19})); //89
        System.out.println(max(new int[] {9, 99, 78, 67, 4, 87, 23})); //99
        System.out.println("-----------");
        System.out.println(min(new int[] {3, 43, 65, 23, 3, 8, 19})); //3
        System.out.println(min(new int[] {12, 43, 23, 67, 1, 56, 19})); //1
        System.out.println(min(new int[] {13, 34, 89, 35, 8, 7, 19})); //7
        System.out.println(min(new int[] {9, 99, 78, 67, 4, 87, 23})); //4
    }

    public static int max(int[] arr) {
        int max = arr[0];

        for (int element : arr ) {
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
