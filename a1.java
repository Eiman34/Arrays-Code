import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Eiman on 2/10/2021.
 */
public class a1 {
    public static void main(String[] args) {
        ArrayList <String> l = new ArrayList<String>();
        l.add("Eiman");
        l.add("Alex");
        l.add("Teacher Fatima ");
        l.add("Ilsabth");
        System.out.println("Before Reversing");
        System.out.println(l.toString());

        Collections.reverse(l);
        System.out.println("After Reversing");
        System.out.println(l);
    }

}
