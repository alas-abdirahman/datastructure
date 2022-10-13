import java.util.Arrays;

public class Sorting
{
    void selectionSort(int[] list)
    {
        for (int i=0; i<list.length-1; i++)
        {
            int small = i;
            for(int k=i+1; k<list.length; k++)
            {
                if (list[k] < list[small])
                {
                    small = k;
                }
            }
            int temp = list[i];
            list[i] = list[small];
            list[small] = temp;
        }
        System.out.println(Arrays.toString(list));
    }

    void bubbleSort(int[] list)
    {
        for(int i=0; i<list.length; i++)
        {
            for(int k=0; k<list.length-1; k++)
            {
                int temp;
                if (list[k] > list[k+1])
                {
                    temp = list[k];
                    list[k] = list[k+1];
                    list[k+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(list));
    }

    void insertionSort(int[] array)
    {
        int size = array.length;

        for (int step = 1; step < size; step++) {
            int key = array[step];
            int j = step - 1;

            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
        System.out.println(Arrays.toString(array));
    }

    void selectionSortDesc(int[] array)
    {
        for (int i=0; i < array.length; i++)
        {
            int max = i;
            for (int j=i+1; j < array.length; j++)
            {
                if (array[j] > array[max])
                {
                    max = j;
                }
            }
            int temp = array[i];
            array[i] = array[max];
            array[max] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    void bubbleSortDesc(int[] array)
    {
        for (int position = 0; position < array.length; position++)
        {
            for (int scan = 0; scan < array.length-1; scan++)
            {
                int temp;
                if (array[scan] < array[scan+1]) {
                    temp = array[scan];
                    array[scan] = array[scan+1];
                    array[scan+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    void halfSort(int[] array)
    {
        int range = array.length/2;
        for (int i=0; i < range; i++)
        {
            int small = i;
            for (int j=i+1; j<range; j++)
            {
                if (array[j] < array[small])
                    small = j;
            }
            int temp = array[i];
            array[i] = array[small];
            array[small] = temp;
        }
        System.out.println(Arrays.toString(array));
    }



}
