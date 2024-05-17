import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMoreMethods
{
    public static void main(String[] args)
    {
        List<String> allValues = Arrays.asList("shubham", "Pandey", "lucky", "lucky", "Pandey");

        List<String> distantValues = allValues.stream().distinct().collect(Collectors.toList()); //distinct

        long total = allValues.stream().distinct().count(); //count

        allValues.stream().limit(2).forEach(System.out::println);// limit

        Optional<String> min = allValues.stream().min((value1, value2) -> {
            return value1.compareTo(value2); //min method
        });
       System.out.println(min.get());

        Optional<String> max = allValues.stream().max((val1, val2) -> {
            return val1.compareTo(val2);  //max method
        });
        System.out.println(max.get());

        //reduce method
        Optional<String> reducedValue = allValues.stream().reduce((value, combinedValue) -> {
            return combinedValue + value;
        });
        System.out.println(reducedValue);

           List<Integer> in = Arrays.asList(2,5,7,8,9,12,32,5);
        Integer minValue = in.stream().min(Integer::compare).get();
        System.out.println(minValue);

       Integer maxValue =  in.stream().max(Integer::compare).get();
        System.out.println(maxValue);

        //toArray method
        Object[] arr = allValues.stream().toArray();
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));

        //parallel streams just make the execution fast
        List<String> allValues1 = Arrays.asList("shubham", "Pandey", "lucky", "lucky", "Pandey");
        allValues1.parallelStream().filter(s->s.length()>5).forEach(System.out::println);

        allValues1.stream().parallel().map(st->st.toUpperCase()).forEach(System.out::println);





    }
}
