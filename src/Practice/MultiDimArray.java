package Practice;

public class MultiDimArray {

    public static void main(String[] args) {
        int[][] a = new int[3][2];

        a[0][0] = 100;
        a[0][1] = 200;

        a[1][0] = 300;
        a[1][1] = 400;

        a[2][0] = 500;
        a[2][1] = 600;

        System.out.println("Number of rows: " + a.length);
        System.out.println("Number of columns: " + a[0].length);
        System.out.println("===================");

        // nested loop
        for (int i = 0; i < a.length; i++) { // outer loop

            for (int j = 0; j < a[i].length; j++) {  // inner loop
                System.out.println(a[i][j]);
            }
        }

    }
}
