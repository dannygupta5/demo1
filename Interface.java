interface Faculty {

   

    public String name(String name);

    public int age(int age);

}

class Teacher implements Faculty {

    @Override
    public String name(String name) {
        return name;
    }

    @Override
    public int age(int age) {

        return age;
    }
}
    class Student implements Faculty {

        @Override
        public String name(String name) {

            return name;
        }

        @Override
        public int age(int age) {

            return age;
        }
    }

public class Interface {
    
    public static void main(String args[]) {
        
    
            Faculty ob1 = new Teacher();

            ob1.name("Danny");
            ob1.age(29);

            Faculty ob2 = new Student();

            ob2.name("Rahul");
            ob2.age(23);
        }
    }

