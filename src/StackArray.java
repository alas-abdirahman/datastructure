import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class StackArray <placeHolder>
{
    private placeHolder[] array;
    private static final int defaultCap = 3;
    private int pointer = 0;

    StackArray()
    {
        array = (placeHolder[]) (new Object[defaultCap]);
    }
    StackArray(int size)
    {
        array = (placeHolder[]) (new Object[size]);
    }

    //push()
    public void push(placeHolder elem)
    {
        if (pointer == array.length)
            expand();
        array[pointer] = elem;
        pointer ++;
    }
    //pop()
    public placeHolder pop()
    {
        placeHolder removed = array[pointer-1];
        array[pointer-1] = null;
        pointer--;
        return removed;
    }
    //peek()
    public placeHolder peek()
    {
        return array[pointer-1];
    }

    //isEmpty()
    public boolean isEmpty()
    {
        if(pointer <= 0)
            return true;
        else
            return false;
    }
    //exPand()
    private void expand()
    {
        array = Arrays.copyOf(array, array.length*3);
    }
    //toString()
    public String toString()
    {
        String content = " ";
        for (int i = 0; i<array.length; i++)
            content += i+" ";
        return content;
    }

    //search()
    public String search(int elem)
    {
        String result = "";
        int index = 0;
        for (int i=0; i<array.length; i++)
        {
            if (array[i] == null)
                break;
            else if (Integer.parseInt(array[i].toString()) == elem)
            {
                result = "true"+"\nIndex: "+index;
                break;
            }
            else
                result = "false";
            index++;
        }
        return result;
    }
    //max_element()
    public int max_element()
    {
        int max = 0;
        for (placeHolder i : array)
        {
            if (i == null)
                break;
            else if (Integer.parseInt(i.toString()) > max)
                max = Integer.parseInt(i.toString());
        }
        return max;
    }
    //sum()
    public int sum()
    {
        int total = 0;
        for (placeHolder num: array)
        {
            if (num == null)
                break;
            total += Integer.parseInt(num.toString());
        }
        return total;
    }

    //clear()
    public void clear()
    {
        //loop ,  null,  pointer
        for (int i=0; i<array.length; i++)
        {
            array[i]  = null;
            pointer--;
        }
    }

}