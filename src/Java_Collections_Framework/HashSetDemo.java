package Java_Collections_Framework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String[] args) {

        //HashSet hs=new HashSet(100); // initial capacity 100
        //HashSet hs=new HashSet(100, (float)0.90);
        //HashSet <Integer> hs=new HashSet<Integer>();

        HashSet hs=new HashSet(); // default capacity 16 Load Factor 0.75

        // Add objects/elements into HashSet
        hs.add(100);
        hs.add("welcome");
        hs.add(16.4);
        hs.add('A');
        hs.add(true);
        hs.add(null);

        System.out.println(hs); // [null, A, 100, 16.4, welcome, true] // does not maintain insertion order

        // remove()
        hs.remove(16.4);
        System.out.println("After removing element: " +hs); // [null, A, 100, welcome, true]

        // contains()
        System.out.println(hs.contains("welcome")); //true
        System.out.println(hs.contains("xyz")); //false

        System.out.println(hs.isEmpty()); // false

        System.out.println("=================");
        // Reading objects/elements from HashSet using for..each loop
        // output will be random
        for(Object e:hs) {
            System.out.println(e);
        }

        System.out.println("=================");
        Iterator it=hs.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
