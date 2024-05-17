package Javacollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetProg1
{
    public static void main(String[] args)
    {
        HashSet<Integer> hs = new HashSet();
        hs.add(12);
        hs.add(4);
        hs.add(8);
        hs.add(20);
        hs.add(32);

        System.out.println(hs);
        hs.remove(20);
        System.out.println(hs);
        System.out.println(hs.contains(12));//searching an object returns boolean value
        System.out.println(hs.isEmpty());//checking set is empty or not return boolean value

//        for(Object o :hs)
//        {
//            System.out.print(o + " ");
//        }

        Iterator<Integer> it = hs.iterator(); //using iterator
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        HashSet<Integer> has1 = new HashSet<>();
        has1.add(2);
        has1.add(4);
        has1.add(6);
        has1.add(8);

        HashSet<Integer> has2 = new HashSet<>();
        has2.add(10);
        has2.add(20);
        has2.add(30);
        has2.add(40);

        has1.addAll(has2);
        System.out.println(has1);

        LinkedHashSet<Character> ls = new LinkedHashSet<>(); //insertion order maintained in linkedHasSet
        ls.add('Z');
        ls.add('E');
        ls.add('I');
        ls.add('W');

        System.out.print(ls + " ");

    }
}
