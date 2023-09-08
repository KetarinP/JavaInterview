package FreshPractice;

import java.util.HashSet;

public class HashSetDemo2 {

    public static void main(String[] args) {

        HashSet <Integer> evenNum=new HashSet<>();
        evenNum.add(2);
        evenNum.add(4);
        evenNum.add(6);

        System.out.println("HashSet: "+evenNum);

        HashSet <Integer> numbers=new HashSet<>();

        numbers.addAll(evenNum);
        numbers.add(10);
        System.out.println("New HashSet: " +numbers);

        // removeAll()
        numbers.removeAll(evenNum);
        System.out.println("After removing elements: " +numbers);

    }
}
