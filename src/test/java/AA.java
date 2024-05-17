import java.util.Arrays;
import java.util.List;

public class AA
{


    int rollnum;
    String name;
    double salary;


    public  AA(int rollnum, String name, double salary)
    {
        this.rollnum=rollnum;
        this.name=name;
        this.salary=salary;
    }

    public void getValue()
    {
        System.out.println(rollnum +" " + name + " " + salary);
    }


    public  static void main(String[] args) {

    List<String> li = Arrays.asList( "Lucky", "Senior", "Smart", "Handsome", "hai");
    li.stream().filter(s -> s.length() > 1 && s.length() <=20).forEach(r-> System.out.println(r));


        AA a= new AA(007, "Lucky", 70000.00);

        a.getValue();



    }

}
