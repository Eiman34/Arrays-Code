/**
 * Created by Eiman on 2/25/2021.
 */
public class GenericReverse <T> {
    T arr[];
    int num=0;
    public GenericReverse()
    {
        arr=(T[]) new Object[5];
    }
    public void add(T element)
    {
        if(num<=arr.length-1)
        {
            arr[num++]=element;
        }
    }
   public void printArray()
   {
       for (int i = 0; i <arr.length ; i++) {
           System.out.println(arr[i]);

       }
   }
    public void reverse()
    {
        int n=arr.length-1;
        for (int i = 0; i <arr.length/2 ; i++) {
            T t=arr[i];
            arr[i]=arr[n];
            arr[n]=t;
            n--;
        }

    }

    public static void main(String[] args) {
        GenericReverse<Integer> e1=new GenericReverse<>();
        e1.add(343);
        e1.add(64);
        e1.add(676);
        e1.add(888);
        e1.add(69);
        e1.reverse();
        e1.printArray();
        GenericReverse<String> a2=new GenericReverse<>();
        a2.add("Teacher Fatima");
        a2.add("Eiman");
        a2.add("Taqia");
        a2.add("Haddel");
        a2.add("Alice");
        a2.reverse();
        a2.printArray();

    }
}
