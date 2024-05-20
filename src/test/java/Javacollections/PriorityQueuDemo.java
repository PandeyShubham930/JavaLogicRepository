package Javacollections;

import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

public class PriorityQueuDemo
{
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Shubham");//adding elements
        pq.add("Pandey");
        pq.add("Software");
        pq.offer("Defaulter");//adding elements
        //pq.offer("Defaulter"); insertion order is maintained in alphabetical order and duplicates are allowed
       // pq.add(100) heterogeneous data is not allowed in queue only homogeneous
        System.out.println(pq);

        System.out.println(pq.peek());// getting header, if empty returns null
        System.out.println(pq.element());//getting header, if empty returns exception

        //Return and remove element from queue remove() and poll()
        System.out.println(pq.remove());//return and remove the element, if queue is empty then return exception
        System.out.println(pq);

        System.out.println(pq.poll());//return and remove the element, if queue is empty then return null
        System.out.println(pq);

        pq.add("engineer");
        pq.offer("Developer");

        Iterator<String> it = pq.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next() + " ");
        }


    }
}
