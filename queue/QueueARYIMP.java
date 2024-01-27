package queue;
public class QueueARYIMP
{
    public static class queueA
    {
        int f =-1;
        int r =-1;
        int arr[];
        int size = 0;
        queueA(int data)
        {
            arr = new int[data];
            size = data;
        }
        public void add(int val)
        {
            if(f == -1)
            {
                f =0;
                r =0;
                arr[f] = val;
            }
            else if(r==size-1)
            {
                System.out.println("Queue is full");
                return;
            }
            else
            {
                r++;
                arr[r] = val;
            }
        }
        public int pop()
        {
            if(f == -1 || f > r)
            {
                System.out.println("Queue is empty");
                return -999;
            }
            else
            {
                int s = arr[f];
                f++;
                return s;
            }
        }
        public int peek()
        {
            if(f == -1 || f > r)
            {
                System.out.println("Queue is empty");
                return -999;
            }
            else
            {
                return arr[f];
            }
        }
        public void display()
        {
            if(f == -1 || f > r)
            {
                System.out.println("Queue is empty");

            }
            else
            {
                for(int i =f;i<=r;i++)
                {
                    System.out.print(arr[i]+"\t");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) 
    {
        queueA a = new queueA(3);
        a.add(5);
        a.add(6);
        a.add(7);
        a.display();
        a.add(10);
        a.pop();
        a.display();
        a.pop();
        a.display();
    }
}