package FreshPractice;

import java.util.HashSet;

public class HashSetDemo3 {

    public static void main(String[] args) {

        //Union Intersection, difference

        HashSet <Integer> set1=new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        System.out.println("HashSet 1: " +set1); // HashSet 1: [1, 2, 3, 4, 5]

        HashSet <Integer> set2=new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("HashSet 2: " +set2); // HashSet 2: [3, 4, 5]

        //union
        set1.addAll(set2); // set 2 will merge to set1. It will remove duplicates
        System.out.println("Union: " +set1); // Union: [1, 2, 3, 4, 5]

//        //intersection
//        set1.retainAll(set2); // this will give you common elements from set1 and set2
//        System.out.println("Intersection: " +set1); // Intersection: [3, 4, 5]

//        //difference
//        set1.removeAll(set2); // this is how you get differences between 2 sets
//        System.out.println("Difference: " +set1); // Difference: [1, 2]

        //subset
        // if set2 and set1 have the same element, it will return true
        // if set2 and set1 does not have the same element, it will return false
        System.out.println(set1.containsAll(set2)); // true

    }
}
