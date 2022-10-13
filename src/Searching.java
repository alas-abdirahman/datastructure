
public class Searching <T>
{
    public boolean linearSearch(T[]data, int min, int max, T target)
    {
        boolean found = false;
        for (int i=min; i<=max; i++)
        {
            if (data[i].equals(target)) {
                found = true;
                break;
            }
        }
        return found;
    }

    public boolean binarySearch(T[]data, int min, int max, T target)
    {
        boolean found = false;
        int low = min;
        int high = max;
        while (min <= max && !found)
        {
            int median = (low + high) / 2;
            if (data[median] == target)
                found = true;
            else if ((int)(data[median]) > (int)target)
                high = median - 1;
            else
                low = median + 1;
        }
        return found;
    }
}
