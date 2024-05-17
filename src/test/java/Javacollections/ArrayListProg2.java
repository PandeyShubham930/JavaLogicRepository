package Javacollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListProg2
{
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("A");
        al1.add("C");
        al1.add("G");
        al1.add("R");
        al1.add("Y");
        al1.add("Z");

        ArrayList<String> al2 = new ArrayList<>();
        al2.addAll(al1); //add all method
        System.out.println(al2);
        System.out.println("Is the arrays list empyt?? " +al2.isEmpty());

        //retain all method
        al2.add("Shubham");
        al2.add("Pandey");
        System.out.println(al2);
        al2.retainAll(al1);
        System.out.println("Collection left is >> " +al2);

        al2.removeAll(al1); //remove all method
        System.out.println(al2);
        System.out.println("Is the arrays list empyt?? " +al2.isEmpty());

        Collections.sort(al1); //ascending order
        System.out.println("Sorted list>> " + al1);

        Collections.sort(al1, Collections.reverseOrder());// descending order
        System.out.println("Reverse sorted list " + al1);

        Collections.shuffle(al1);
        System.out.println("Shuffeled list >> "+ al1);

       Integer[] arr ={4,7,8,2,1,34};
       ArrayList<Integer> al3 = new ArrayList<>(Arrays.asList(arr)); //converting arrays to arraylist
        System.out.println(al3);




    }
}
