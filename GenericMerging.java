import java.sql.ResultSet;

/**
 * Created by Eiman on 2/25/2021.
 */
public class GenericMerging <T> {
    T arr1[];
    T arr2[];
    int num=0;
    public GenericMerging()
    {
        arr1=(T[]) new Object[3];
        arr2=(T[]) new Object[5];
    }
    public void addArray1(T element)
    {
        if(num<=arr1.length-1)
        {
            arr1[num++]=element;
        }
    }
    public void printArray1()
    {
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println(arr1[i]);

        }
    }
    public void addArray2(T element)
    {
        if(num<=arr2.length-1)
        {
            arr2[num++]=element;
        }
    }
    public void printArray2()
    {
        for (int i = 0; i <arr2.length ; i++) {
            System.out.println(arr2[i]);

        }
    }
    public void merge()
    {

        T result = arr1+ arr2;
        System.out.println(result);
    }

    public static void main(String[] args) {
        GenericMerging<Integer> w1=new GenericMerging<>();
        w1.addArray1(23);
        w1.addArray1(27);
        w1.addArray1(290);
        w1.printArray1();
        w1.merge();
        GenericMerging<String> w2=new GenericMerging<>();
        w2.addArray2("Sam");
        w2.addArray2("Alex");
        w2.addArray2("David");
        w2.addArray2("Alice");
        w2.addArray2("Chris");
        w2.printArray2();
        w2.merge();

    }
}
