package Java_Collections_Framework;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        // LinkedHashSet is able to use all the methods from HashSet

        // HashSet                                      vs  LinkedHashSet
        // Duplicate is not allow                           Duplicate is not allow
        // Does not maintain insertion order                maintain insertion order
        // HashTable                                        Hash Table & LinkedList

//        LinkedHashSet <Integer> lset=new LinkedHashSet<>();
//        HashSet lset=new HashSet();
        LinkedHashSet lset=new LinkedHashSet();

        lset.add(100);
        lset.add(200);
        lset.add(300);
        lset.add(400);
        lset.add(500);


//        System.out.println("HashSet: " +lset); // [400, 100, 500, 200, 300] / does not maintain insertion order
        System.out.println("LinkedHashSet: " +lset); // [100, 200, 300, 400, 500] / maintain insertion order

    }
}
