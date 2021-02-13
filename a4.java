import java.util.ArrayList;
import java.util.Random;
import java.util.List;
/**
 * Created by Eiman on 2/11/2021.
 */
public class a4 {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        a4 obj = new a4();
        System.out.println(obj.getRandomElement(list));

    }

    public int getRandomElement(List<Integer> list)
    {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}
