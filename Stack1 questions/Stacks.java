class Stacks
{
    public static class Stack
    {
        int arr[];
        int count = 0;
        int size = 0;
        Stack(int size)
        {
            arr = new int[size];
            this.size = size;
        }
        void push(int val)
        {
            if(count>=size)
            {
                System.out.println("stack overflow");
            }
            else
            {
                arr[count] = val;
                count++;
            }
        }

        int size()
        {
            return count;
        }
        int pop()
        {
            if(count == 0)
            {
                System.out.println("UNDERFLOW");
                return -1;
            }
            else
            {
                int x = arr[count-1];
                arr[count-1] = 0;
                count--;
                return x;
            }
        }
        int peek()
        {
            if(count == 0)
            {
                System.out.println("UNDERFLOW");
                return -1;
            }
            return arr[count-1];
        }
        void display()
        {
            for(int i =0;i<count;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        Stack st = new Stack(5);    
        
        st.push(1);
        st.push(2);
        st.push(9);
        
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.display();

    }
}