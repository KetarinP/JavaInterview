package Java_Collections_Framework;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {

    public static void main(String[] args) {

        /*
        * HashMap -
        *
        * Non-Synchronized - Multiple threads are allow to access a method
        * Not thread safe
        * Performance is faster
        * Null is allows once in Key
        * Allow duplicate nulls in Value
        * Insertion order not preserved
        *
        * HashTable -
        *
        * Synchronize - Only 1 thread allow to access a method at a time
        * Thread safe
        * Performance is poor/low
        * Does not accept null
        * Insertion order not preserved
        * */

//        Hashtable t=new Hashtable(); // Capacity is 11, load factor 0.75
//        Hashtable t=new Hashtable(init capacity); // create hastable object with some capacity
//        Hashtable t=new Hashtable(init capacity, fill ratio/load factor);

        Hashtable <Integer, String> t=new Hashtable<>();

        t.put(101, "John");
        t.put(102, "David");
        t.put(103, "Smith");
//        t.put(null, "X"); // NullPointerException - null is not allow in HashTable
//        t.put(104, null); // NullPointerException - null is not allow in HashTable

        System.out.println(t); // {103=Smith, 102=David, 101=John}

        // get()
        System.out.println(t.get(103)); // Smith

        // remove()
        t.remove(103);
        System.out.println(t); // {102=David, 101=John}

        // containsKey()
        System.out.println(t.containsKey(102)); // true
        System.out.println(t.containsKey(105)); // false

        // containsValue()
        System.out.println(t.containsValue("David")); // true
        System.out.println(t.containsValue("Y")); // false

        // isEmpty()
        System.out.println(t.isEmpty()); // false

        // keySet()
        System.out.println(t.keySet()); // [102, 101]

        // values()
        System.out.println(t.values()); // [David, John]

        System.out.println("===========");

        // Reading HashTable
        /*
        * 102   David
        * 101   John
        * */
        for (int k:t.keySet()) {
            System.out.println(k+ "   "+t.get(k));
        }

        System.out.println("===========");
        // Entry specific methods
        /*
         * 102   David
         * 101   John
         * */
        for (Map.Entry entry:t.entrySet()) {
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }
        System.out.println("===========");

        // iterator()
        /*
         * 102   David
         * 101   John
         * */
        Set s=t.entrySet();

        Iterator itr=s.iterator();

        while (itr.hasNext()) {
            Map.Entry entry=(Map.Entry) itr.next();
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }
    }
}
