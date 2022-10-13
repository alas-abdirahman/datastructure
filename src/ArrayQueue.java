import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayQueue <T>{
    private int head, tail, count = 0;
    private static int defaultCap = 3;
    private T[] myArray;

    ArrayQueue()
    {
        this(defaultCap);
    }
    ArrayQueue(int size)
    {
        head = tail = count = 0;
        myArray = (T[]) (new Object[size]);
    }

    public void enQueue(T element)
    {
        if (count() == size())
            expand();
        myArray[tail] = element;
       // if (tail == size()){tail=0;}
        //tail = (tail + 1) % myArray.length;
        tail++;
        count++;
    }
    public T deQueue()
    {
        if (isEmpty()) throw new EmptyStackException();
        T removed = myArray[head];
        myArray[head] = null;
        //head = (head + 1) % myArray.length;
        head++;
        count--;
        return removed;
    }
    public int size(){return myArray.length;}

    public int count(){return count;}

    public String toString()
    {
        return Arrays.toString(myArray);
    }

    public T first(){
        if(isEmpty())throw new EmptyStackException();
        return myArray[head];
    }

    public boolean isEmpty()
    {
        return count == 0;
    }

    private void expand()
    {
        myArray = Arrays.copyOf(myArray, myArray.length+1);
    }

    //Display all the elements in Queue as reverse from bottom to top
    public String queueReverse()
    {
        String reversed = " ";
        for (int i=myArray.length-1; i>=0; i--)
        {
            if (myArray[i] == null)
                continue;
            reversed += myArray[i]+" ";
        }
        return reversed;
    }
}
