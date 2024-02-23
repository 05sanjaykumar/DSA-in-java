package Priority_Queues;

import java.util.PriorityQueue;

public class kth_largest 
{
    public static void main(String[] args) 
    {
        int arr[] = {3,7,2,9,5};
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap
        for(int x:arr)
        {
            if(pq.size()>k)
            {
                if(pq.peek()<x)
                {
                    pq.remove();
                    pq.add(x);
                }
            }
            else
            {
                pq.add(x);
            }
        }
        System.out.println(pq.peek());
    }
}
//video number 79
