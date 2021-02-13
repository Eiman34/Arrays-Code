/**
 * Created by Eiman on 2/11/2021.
 */
public class a2 {
    public static void main(String[] args)
    {
        int a[] = {1,24,75,86,32,9};
        int b[] = new int[a.length];
        b = a;
        b[0]++;
        System.out.println("Elements of a[] ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println("\nElements of b[] ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }
}
