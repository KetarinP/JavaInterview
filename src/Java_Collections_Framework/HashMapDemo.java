package Java_Collections_Framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {

        // Underlying data structure is hash table
        // Insertion order is not maintain
        // Duplicate key is not allow
        // Duplicate values are allow
        // Null key is allow only once since key is unique
        // Null values are allow as duplicates as well

//        HashMap m=new HashMap();
        HashMap<Integer, String> m=new HashMap<>();

        m.put(100, "John");
        m.put(101, "David");
        m.put(102, "Scott");
        m.put(103, "Mary");
        m.put(104, "Tyler");
        m.put(105, "Tyler");
        m.put(106, "Scott");
//        m.put(103, "Sean"); // {100=John, 101=David, 102=Scott, 103=Sean, 104=Tyler} // old value got replaced with  a new value

        System.out.println(m); // {100=John, 101=David, 102=Scott, 103=Mary, 104=Tyler, 105=Tyler, 106=Scott}

        // get()
        System.out.println(m.get(105)); // Tyler

        // remove()
        m.remove(106);
        System.out.println(m); // {100=John, 101=David, 102=Scott, 103=Mary, 104=Tyler, 105=Tyler}

        // containsKey()
        System.out.println(m.containsKey(100)); // true
        System.out.println(m.containsKey(107)); // false

        // containsValue()
        System.out.println(m.containsValue("Mary")); // true
        System.out.println(m.containsValue("Y")); // false

        // isEmpty()
        System.out.println(m.isEmpty()); // false

        // keySet()
        System.out.println(m.keySet()); // returns all the keys as Set. // [100, 101, 102, 103, 104, 105]

        System.out.println("==============");

        // values()
        for (Object i:m.keySet()) {
            System.out.println(i);
        }

        System.out.println("==============");
//        System.out.println(m.values()); // returns all the values as Collection. // [John, David, Scott, Mary, Tyler, Tyler]
//        System.out.println("==============");

        // Reading HashMap as values
        for (Object i:m.values()) {
            System.out.println(i);
        }
        System.out.println("==============");

/*        100  -  John
        101  -  David
        102  -  Scott
        103  -  Mary
        104  -  Tyler
        105  -  Tyler*/
        for(Object i:m.keySet()) {
            System.out.println(i+"  -  "+m.get(i));
        }

        System.out.println("==============");

        // Entry methods
/*        100  -  John
        101  -  David
        102  -  Scott
        103  -  Mary
        104  -  Tyler
        105  -  Tyler*/
        //****************
        for(Map.Entry entry:m.entrySet()) { // 100  x
            System.out.println(entry.getKey()+ "  -  "+entry.getValue());
        }

        System.out.println("==============");

        // iterator()
/*        100  -  John
        101  -  David
        102  -  Scott
        103  -  Mary
        104  -  Tyler
        105  -  Tyler*/
        //****************
        Set s=m.entrySet();

        Iterator itr=s.iterator();

        while(itr.hasNext()) {
            Map.Entry entry= (Map.Entry) itr.next();
            System.out.println(entry.getKey()+"  -  "+entry.getValue());
        }
    }
}
