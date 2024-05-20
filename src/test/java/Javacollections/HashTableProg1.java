package Javacollections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableProg1
{
    public static void main(String[] args)
    {
        //Hashtable ht = new Hashtable();
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1,"Shubham");
        ht.put(2,"Pandey");
        ht.put(3,"Software");
        ht.put(4, "Developer");
        System.out.println(ht);
        ht.replace(1, "Shubham", "Luckythecoder");
        System.out.println(ht);

        ht.remove(2);
        System.out.println(ht);

        System.out.println(ht.isEmpty());//false
        System.out.println(ht.values());//give all values
        System.out.println(ht.containsKey(1));//true
        System.out.println(ht.containsValue("Pandey"));//false

        System.out.println(ht.keySet());//give all keys
        System.out.println(ht.entrySet());// give all pairs

        for(Integer k :ht.keySet())//by for each loop
        {
            System.out.println(k +" and vale are >> " + ht.get(k));
        }

        for(Map.Entry<Integer, String> entry :ht.entrySet())//by entryset and Map.Entry
        {
            System.out.println(entry.getKey()+ " and values are >> "+ entry.getValue());
        }

        Set<Map.Entry<Integer, String>> entry = ht.entrySet();//by using iterator
        Iterator it = entry.iterator();
        while(it.hasNext())
        {
            Map.Entry val = (Map.Entry) it.next();
            System.out.println(val.getKey() + " and values > " + val.getValue());

        }

    }
}
