package FreshPractice;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        // HashSet                                      vs  LinkedHashSet
        // Duplicate is not allow                           Duplicate is not allow
        // Does not maintain insertion order                maintain insertion order
        // HashTable                                        Hash Table & LinkedList

        //Declare Linked List
//        LinkedList <Integer> l = new LinkedList<>();
//        LinkedList <String> l = new LinkedList<>();

        LinkedList l = new LinkedList();
        //Add elements into linked list
        l.add(100);
        l.add("welcome");
        l.add(15.5);
        l.add('A');
        l.add(true);
        l.add(null);

        System.out.println(l);

        //size of element
        System.out.println("Size: " +l.size());

        //remove element by index
        l.remove(3);
        //remove element by value
        l.remove(15.5);
        System.out.println("After removing, New list: " +l);

        //insert/add element in the middle of linked list
        l.add(2, "Python");
        l.add(3, "Java");
        System.out.println("After inserting element: " +l);

        //retrieving value/object
        System.out.println("Retrieving: " +l.get(3));

        //change the value
        l.set(5, "X");
        System.out.println("After changing the value: " +l);

        //contains method
        System.out.println(l.contains("Java")); //return true or false

        //isEmpty method
        System.out.println(l.isEmpty()); // return true or false
        System.out.println("============================");

        //Reading elements from Linked List using for loop
        for (int i = 0; i<l.size(); i++) {
            System.out.println(l.get(i));
        }
        System.out.println("================");

        //Reading elements from Linked List using for..each loop
        for(Object e:l) {
            System.out.println(e);
        }
        System.out.println("================");

        //Reading Linked List using iterator() method
        Iterator it = l.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
