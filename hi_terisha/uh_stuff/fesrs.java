package hi_terisha.uh_stuff;
import java.util.*;

public class fesrs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];

        for (int counter = 0; counter < 5; counter++) {
            System.out.print("Enter an Integer: ");
            int integer = sc.nextInt();
            array[counter] = integer;
        }

        System.out.println("The Integers are:" + Arrays.toString(array));
    }
}
