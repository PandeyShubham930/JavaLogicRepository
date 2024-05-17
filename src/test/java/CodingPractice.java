import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CodingPractice
{
    public static void main(String[] args) {

    List<Integer> li = Arrays.asList(2,4,6,7,89,12,1,3);
    li.stream().sorted().forEach(n-> System.out.print(n+ " ")); //sorted ascending order
    System.out.println();

    List<Integer> li1=  li.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());//sorted descending order
    System.out.println(li1);

    List<String> ls = Arrays.asList("lucky","the", "coder");
    ls.stream().sorted().forEach(n-> System.out.print(n+ " "));
    System.out.println();

    ls.stream().sorted(Comparator.reverseOrder()).forEach(a-> System.out.print(a+" "));

    Set<String> set = new HashSet<>();
    set.add("shubham");
    set.add("pandey");
    set.add("coder");
    set.add("developer");

   //AnyMatch
   boolean result=  set.stream().anyMatch(a-> {return a.startsWith("coder");});
   System.out.println();
   System.out.println("result is >>  " +  result);

   //AllMatch
    boolean result1 =set.stream().allMatch(a->a.startsWith("s"));
    System.out.println("result is >> " + result1);

    //NoneMatch
    boolean result3= set.stream().noneMatch(a->a.contains("defaulter"));
    System.out.println(result3);

    //findAny
   String value=  set.stream().findAny().get();
   System.out.println(value);

   //findFirst
    Optional<String> valu1 = set.stream().findFirst();
    System.out.println(valu1.get());

    //concatstreams
    List<String> ls1 = Arrays.asList("Lucky","the", "gamer");
    List<String> ls2 = Arrays.asList("HorseRider","punctual", "smart");
    Stream<String> st1 = ls1.stream();
    Stream<String> st2 =ls2.stream();
    Stream.concat(st1,st2).forEach(s-> System.out.print(s+ " "));




    }
}
