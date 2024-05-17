import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BB
{

    String name;
    int salary;
    String city;

    public BB(String name, int salary, String city)
    {
        this.name=name;
        this.salary=salary;
        this.city=city;

    }
    public static void main(String[] args)
    {

//        List<String> li = Arrays.asList("Shubham", "Pandey", "Senior Software engineer","Java","developer");

//        li.stream().map(name->name.length()).forEach(System.out::println);
//        li.stream().map(name->(name.length()*3)).forEach(System.out::println);

        List<BB> l = Arrays.asList(
                new BB("Shubham", 7000, "chichago"),
                new BB("Lucky",5000, "Bangalore"),
                new BB("shagun",500, "pune"),
                new BB("harshita",2, "Jabalpur"));

        l.stream().filter(e->e.salary>=4000).map(e->e.salary+ " "+e.name).forEach(System.out::println);
//        Set<String> rec = l.stream().filter(e -> e.salary >= 4000).map(e -> e.salary + " " + e.name).collect(Collectors.toSet());
//        System.out.println(rec);



    }
}
