package Javacollections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListProg1
{
    public static void main(String[] args)
    {
        LinkedList<String> li = new LinkedList<>();
        li.add("Shubham");
        li.add("Pandey");
        li.add("Automation");
        li.add("Engineer");

        System.out.println("Printing via list iterator in descending order");
        ListIterator<String> it2 = li.listIterator(li.size());
        while(it2.hasPrevious())
        {
            System.out.print(it2.previous() + " ");
        }
        System.out.println();
        li.addFirst("First element");//addfirst
        li.addLast("Last Element");//addLast
        System.out.println(li);

        System.out.println(li.getFirst());//getFirst
        System.out.println(li.getLast());//getLast

        li.removeFirst();//removeFirst
        li.removeLast();//removeLast
        System.out.println(li);

        Collections.sort(li);
        System.out.println(li);

        Collections.sort(li, Collections.reverseOrder());
        System.out.println(li);

        ListIterator<String> it = li.listIterator(); //listIterator
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("Sorted from descending iterator");
        Iterator<String> it1 = li.descendingIterator();//descendingIterator
        while(it1.hasNext())
        {
            System.out.println(it1.next());
        }
    }
}
