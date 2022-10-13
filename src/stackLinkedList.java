import java.util.EmptyStackException;

public class stackLinkedList {
    private Node head;
    private int size = 0;


    public void push(int elem)
    {
        Node newNode = new Node();
        newNode.data = elem;
        newNode.next = null;

        if (head == null)
            head = newNode;
        else{

            Node firstNode = head;
            head = newNode;
            newNode.next = firstNode;
        }
        size++;
    }

    public String pop()
    {
        if (head == null)
            return "List is Empty";
        else {
            Node currentNode = head;
            head = head.next;
            return String.valueOf(currentNode.data);
        }
    }


    public String peek()
    {
        return String.valueOf(head.data);
    }

    public void display()
    {
        if (head == null)
            System.out.println("Nothing to display!!!");
        else {
            Node current = head;

            while (current != null) {
                System.out.println(current.data);
                System.out.println(current.next);
                current = current.next;
            }
        }
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        if (size == 0)
            return true;
        else
            return false;
    }

    public int search(int index)
    {
        int result=0;

        if (size == 0)
            return 0;
        else{

            Node current = head;
            int count = 0;

            while (current != null)
            {
                if (count == index)
                {
                    result = (int) current.data;
                    break;
                }
                else
                    current = current.next;
                count++;
            }
        }
        return result;
    }

    //clear()
    public void clear()
    {
       head = null;
       size = 0;
    }
}
