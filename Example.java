import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example {
    
    String name;
    int id;
    double grade;
   public String toString()
   {
      return name +" " +  id + " "  + grade ;
   }

    public Example(String name, int id , double d) {
        this.name = name;
        this.id = id;
        this.grade = d;

    }

    public static void main(String[] args) {
        
        Example ob1 = new Example("a",123,9.8);
        Example ob2 = new Example("a",123,9.5);

        Example ob3 = new Example("a",178,9.8);
        Example ob4 = new Example("a",123,9.8);

        Set<Example> set = new LinkedHashSet<>();
        set.add(ob1);
        set.add(ob2);
        set.add(ob3);
        set.add(ob4);

        System.out.println(set);

       Iterator<Example> it = set.iterator();
       while(it.hasNext())
       {
           System.out.println(it.next());
       }

       //set Follows hashcode and equals() method mechanism
       //when we add objects in set then it may be allow duplicate value because equals() method does not work same as variables 
    }
}
