import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapProg
{
    public static void main(String[] args) {

        List<Integer> li = Arrays.asList(1,2,4,5,7,8);
//        li.stream().map(n->n+10).forEach(System.out::println); //map concept

//        List<Integer> li1 = Arrays.asList(4,5);
//        List<Integer> li2 = Arrays.asList(10,11);
//        List<Integer> li3 = Arrays.asList(7,1);
//        List<List<Integer>> finalLI= Arrays.asList(li1,li2,li3);
//        List<Integer> val = finalLI.stream().flatMap(n -> n.stream().map(x->x+5)).collect(Collectors.toList());
//        System.out.println(val);

          List<String> teamA = Arrays.asList("Shubham","Pandey", "java ");
          List<String> teamB = Arrays.asList("manoj","sharma", "cricketer ");
          List<String> teamC = Arrays.asList("Lucky","kohli", "deveops ");

          List<List<String>> all = Arrays.asList(teamA,teamB,teamC);

        List<String> all1 = all.stream().flatMap(p -> p.stream()).collect(Collectors.toList());

        System.out.println(all1);

    }
}
