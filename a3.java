import java.util.Arrays;
/**
 * Created by Eiman on 2/11/2021.
 */
public class a3 {
    public static int[] removeTheElement(int[] arr, int index)
    {
        if (arr == null || index < 0 || index >= arr.length) {

            return arr;
        }
        int[] Array2 = new int[arr.length - 1];

        for (int i = 0, k = 0; i < arr.length; i++) {

            if (i == index) {
                continue;
            }
            Array2[k++] = arr[i];
        }
        return Array2;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        int index = 2;

        System.out.println("the Index is removed: "
                + index);
        arr = removeTheElement(arr, index);
        System.out.println(Arrays.toString(arr));
    }
}
