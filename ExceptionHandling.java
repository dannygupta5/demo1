
public class ExceptionHandling {
    public static void main(String args[]) {

        try {
            int div = 100 / 0;
            System.out.println(div);

            int arr[] = new int[2];
            System.out.println(arr[4]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}