
public class LinkedQueue
{
    private Node head;
    private Node tail;
    private int size = 0;

    public void enQueue(int elem)
    {
        Node newNode = new Node();
        newNode.data = elem;
        newNode.next = null;

        if (head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public int deQueue()
    {
        Node firstNode = head;
        head = head.next;
        size--;
        return firstNode.data;
    }

    public int peek()
    {
        if (head == null)
            return 0;
        return head.data;
    }

    public String toString()
    {
        String content = "";

        Node firstNode = head;
        while (firstNode != null)
        {
            content += firstNode.data + " ";
            firstNode = firstNode.next;
        }
        return content;
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        if (head == null)
            return true;
        else
            return false;
    }

    //clear() // erase all nodes
    //search() pass node data, return true or false
}
