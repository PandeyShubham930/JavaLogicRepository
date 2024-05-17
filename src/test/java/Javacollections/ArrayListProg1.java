package Javacollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProg1
{

    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add("Shubham");
        al.add('r');
        al.add(23);
        al.add(5454.02);

        System.out.println(al + "arrylist size is >>  " + al.size());
        al.remove(2);
        System.out.println(al + "arrylist size is >>  " + al.size());

        al.add(2,34);
        System.out.println(al + "arrylist size is >>  " + al.size());
        System.out.println(al.get(0));

        al.set(0,"Software Java Developer");
        System.out.println(al + "arrylist size is >>  " + al.size());
        al.add(0,"Pandey"); //index shift, as arraylist is growable in nature
        System.out.println(al + "arrylist size is >>  " + al.size());

        System.out.println(al.contains("Pandey"));
        System.out.println(al.isEmpty());

//        for(int i=0; i<al.size(); i++) //printing using for loop
//        {
//            System.out.print(" "+ al.get(i));
//        }

         //printing using for each loop
//        for(Object a :al)
//        {
//            System.out.print(a + " ");
//        }

        //printing using iterator
        Iterator it = al.iterator();

        while(it.hasNext())
        {
            System.out.print(it.next() + " ");
        }
    }
}
