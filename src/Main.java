import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args)
    {
//        int[] ls = {4,6,3,1,1,88,77,7,1,3};
//        Sorting sort = new Sorting();
//
//        System.out.println("SelectionSort as Descending");
//        sort.selectionSortDesc(ls);
//
//        System.out.println("bubleSort as Descending");
//        sort.bubbleSortDesc(ls);
        String result = helloWorld(3);
        System.out.println(result);
    }
    public static String helloWorld(int count)
    {
        if(count == 0)
             return " ";
        else {
            return "Hello World!!!" + "\n" + helloWorld(count - 1);
        }
    }
}
