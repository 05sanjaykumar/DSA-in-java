package queue;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeNum 
{
    public static void main(String[] args) 
    {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int n =8;
        Queue<Integer> q = new LinkedList<Integer>(); 
        int k =3;
        int eq = n-k+1;
        int lg[] = new int[eq];
        int s_r = 0;
        int e_r = k-1;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                q.add(i);
            }
        }
        int s =0;
        System.out.println(q);
        while(s!=eq)
        {
            if(q.isEmpty())
            {
                lg[s++] = 0; 
                System.out.println("get insside");
            }
            else if (q.peek()<=e_r && q.peek()>=s_r) 
            {
                lg[s++] = arr[q.peek()];   
            }
            else if(q.peek()<s_r)
            {
                q.remove();
                s_r--;
                e_r--;
            }
            else if(q.peek()>e_r)
            {
                lg[s++] =0;
            }
            s_r++;
            e_r++;
        }
        for(long x:lg)
        {
            System.out.print(x+" ");
        }
        System.out.println();

    }    
}
