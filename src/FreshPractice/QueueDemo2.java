package FreshPractice;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueDemo2 {

    public static void main(String[] args) {

        // FIFO - First in first out
        // Maintain insertion order
        // allows duplicates
        // Heterogeneous data is allowed

        LinkedList q=new LinkedList();

        // Adding elements  add() or offer()
        q.add("A");
        q.add("B");
        q.add("C");
        q.offer("C");
        q.offer("D");
        q.offer("D");
        q.offer('A');
        q.offer(100);
        q.offer(100.5);
        q.offer(null);

        System.out.println(q); // [A, B, C, C, D, D] maintain insertion order and duplicates allowed

        // get head element    element() or peek()

//        System.out.println(q.element()); // A // if the queue is empty it will return "NoSuchElementException"
//        System.out.println(q.peek()); // A // // if the queue is empty it will return "Null"

        // Return & remove element from queue   remove() and poll()
//        System.out.println(q.remove()); // A. It will return head element and remove it at the same time. if the queue is empty it will return "NoSuchElementException"
//        System.out.println(q); // [B, C, C, D, D]

//        System.out.println(q.poll()); // A. if the queue is empty it will return "Null"
//        System.out.println(q); // [B, C, C, D, D]

        // Reading queue
//        Iterator it=q.iterator();
//
//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }

        for (Object ele:q) {
            System.out.println(ele);
        }
    }
}
