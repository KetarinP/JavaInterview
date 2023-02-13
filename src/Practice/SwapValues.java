package Practice;

public class SwapValues {
    public static void main(String[] args) {

        // TODO Swap the values of sky and sun without directly reassigning
        String sky = "yellow";
        String sun = "blue";

        String temp = sky; // yellow
        sky = sun; // blue
        sun = temp;

        System.out.println(sky);
        System.out.println(sun);




        // TODO Swap the values of x and y
        int x = 5;
        int y = 10;

        y = y + x; // = 15
        x = y - x; // = 10
        y = y - x; // = 5

        System.out.println(x);
        System.out.println(y);

    }
}
