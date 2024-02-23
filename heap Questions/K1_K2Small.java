import java.util.Comparator;
import java.util.PriorityQueue;

public class K1_K2Small 
{
    public static void main(String[] args) 
    {
        int arr[] = {20,8,22,4,12,10,14};
        int k1 = 3;
        int k2 = 6;
        int max = (k1>k2)?k1:k2;
        int min = (k1>k2)?k2:k1;
        PriorityQueue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder()); // max heap
        int len = arr.length;
        for(int i=0;i<len;i++)
        {
            if(i>=max)
            {
                int peak_elm = pq.peek();
                if(peak_elm>arr[i])
                {
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
            else
            {
                pq.add(arr[i]);
            }
        }
        pq.remove();
        int min_dist = max-min-1;
        int sum =0;
        for(int i=0;i<min_dist;i++)
        {
            sum+=pq.remove();
        }
        System.out.println(sum);
    }    
}
//Lecture 78