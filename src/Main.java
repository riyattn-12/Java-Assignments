import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main
{
    public static void main(String[] args)
    {

        ArrayList<employee> al = new ArrayList<>();
        al.add(new employee(23,55000,"riya"));
        al.add(new employee(25,45000,"kunal"));
        al.add(new employee(26,75000,"shobit"));
        al.add(new employee(24,35000,"shreya"));
        //System.out.println(al);
        Collections.sort(al);
        System.out.println(al);



    }
}