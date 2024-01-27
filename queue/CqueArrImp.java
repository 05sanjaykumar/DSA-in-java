package queue;
public class CqueArrImp 
{
    public static class Cqueue
    {
        int arr[];
        int size =0;
        int front = -1;
        int rear = -1;
        int capacity = 0;
        Cqueue(int data)
        {
            arr = new int[data];
            capacity = data;
        }
        void add(int val)
        {
            if(front == -1)
            {
                front = 0;
                rear = 0;
                arr[rear++]= val;
                size++;
            }
            else if(size == capacity)
            {
                System.out.println("Queue is full");
            }
            else if(size!=capacity && rear == capacity)
            {
                rear = 0;
                size++;
                arr[rear++] = val;
            }
            else
            {
                arr[rear++] = val;
                size++;
            }
        }
        int remove()
        {
            if(front == -1 || size == 0)
            {
                System.out.println("Queue is empty");
                return -1;
            }
            else if(front == capacity)
            {
                front = 0;
                int s = arr[front++];
                size--;
                return s;
            }
            else
            {
                int s = arr[front++];
                size--;
                return s;
            }
        }
        void display()
        {
            int s = front;
            if(size == 0)
            {
                System.out.println("Queue is Empty");
            }
            else
            {
                for(int i =0;i<size;i++)
                {
                    if(s==capacity)
                    {
                        s=0;
                        System.out.print(arr[s]+"\t");
                    }
                    else
                    {
                        System.out.print(arr[s]+"\t");
                    }
                    s++;
                }
                System.out.println();
            }
        }
        int Size()
        {
            return size;
        }
    }
    
    public static void main(String[] args) 
    {
        Cqueue que = new Cqueue(2);
        que.add(0);
        que.add(1);
        que.add(2);
        que.display();
        que.remove();
        que.remove();
        que.add(4);
        que.add(5);
        que.display();
        que.remove();
        que.remove(); 
        que.add(6);
        que.add(7);
        que.display();
        que.remove();
        que.display();
        que.remove();
        que.display();
    }
}
