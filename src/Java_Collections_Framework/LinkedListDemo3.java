package Java_Collections_Framework;

import java.util.LinkedList;

public class LinkedListDemo3 {

    public static void main(String[] args) {

        LinkedList l=new LinkedList();

        l.add("dog");
        l.add("dog");
        l.add("cat");
        l.add("horse");
        l.add("bird");
        l.add("fish");

        System.out.println(l); // [dog, dog, cat, horse, bird, fish]

        // add element to first node
        l.addFirst("Tiger");
        System.out.println(l); // [Tiger, dog, dog, cat, horse, bird, fish]

        // add element to last node
        l.addLast("Lion");
        System.out.println(l); // [Tiger, dog, dog, cat, horse, bird, fish, Lion]

        // get first element
        System.out.println(l.getFirst()); // Tiger

        // get last element
        System.out.println(l.getLast()); // Lion

        // remove first element
        l.removeFirst();

        // remove last element
        l.removeLast();

        System.out.println("After removing first and last element: "+l); // [dog, dog, cat, horse, bird, fish]

    }
}
