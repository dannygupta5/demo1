import java.util.*;

public class Collection {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(13);
        list.add(39);
        list.add(87);

       // System.out.println(list);

        Stack<Integer> stack = new Stack<>();

        stack.push(13);
        stack.push(89);
        stack.push(67);
        stack.push(34);

        System.out.println(stack.peek());

        System.out.println(stack.search(13));

       Set<String> set = new TreeSet<>();

       set.add("rahul");
       set.add("Shekhar");
       set.add("Jai");
       set.add("Pinky");
       set.add("Mohit");
       System.out.println(set);

    }
}
