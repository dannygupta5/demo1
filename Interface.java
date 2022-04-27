public interface Interface {

    public void Display();
}

class example implements Interface {

    @Override
    public void Display() {
        System.out.println("This is a implemented class");

    }

    public static void main(String args[]) {
        example ob = new example();
        ob.Display();
    }

}
