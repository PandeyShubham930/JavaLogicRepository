package Javacollections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapProg1
{
    public static void main(String[] args)
    {
        Map<Integer, String> m = new java.util.HashMap();
        m.put(1,"Shubham");
        m.put(2,"Senior");
        m.put(3,"Software");
        m.put(4,"Java");
        m.put(5,"Developer");
        m.put(6,"Shubham");
        m.put(6,"Infamous");// values can be duplicate but keys cannot instead a new key will replace old same key and update the value
        System.out.println(m);

        m.remove(6);
        System.out.println(m);
        System.out.println(m.get(3));//return value

        System.out.println(m.containsKey(4));//check if key is present or not
        System.out.println(m.containsValue("Senior"));//check if value is present or not

        System.out.println(m.isEmpty());//check if map is empty or not

        System.out.println(m.keySet());//return all keys
        System.out.println(m.values());//return all values
        System.out.println(m.entrySet());//return the pair(Key +value)

       /* for(Integer i :m.keySet())
        {
            System.out.println(i + "  and value are >>  " + m.get(i));
        }*/

        for( Map.Entry entry :m.entrySet())
        {
            //entry.setValue("Defaulter"); to set the value
            System.out.println(entry.getKey() + " and value is >> " + entry.getValue());

        }

        Set<Map.Entry<Integer, String>> entry = m.entrySet();
        Iterator<Map.Entry<Integer, String>> it = entry.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        /*Set entry = m.entrySet();
        Iterator it = entry.iterator();
        while(it.hasNext())
        {
            Map.Entry en = (Map.Entry) it.next();
            System.out.println(en.getKey() + " and value is >> "+ en.getValue());
        }*/





    }
}
