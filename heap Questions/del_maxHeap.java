import java.util.ArrayList;

public class del_maxHeap 
{
    public static int find_idx(ArrayList<Integer> ars,int val)
    {
        int s = ars.size();
        int k =-1;
        for(int i=0;i<s;i++)
        {
            if(ars.get(i) == val)
            {
                k = i;
                break;
            }
        }
        return k;
    }
    public static int find_min(ArrayList<Integer> ars)
    {
        int val=Integer.MAX_VALUE;
        int s = ars.size();
        for(int i=0;i<s;i++)
        {
            if(ars.get(i)<val)
            {
                val = ars.get(i);
            }
        }
        return val;
    }
    public static void pushDown(ArrayList<Integer> ars,int i)
    {
        int left_idx = 2*i+1;
        int right_idx = left_idx+1;
        int size = ars.size();
        if(left_idx>=size)
        {
            return;
        }
        int val = ars.get(i);
        int left = ars.get(left_idx);
        int right = ars.get(right_idx);
        if(val>left && val>right)
        {
            return;
        }
        System.out.println("left val:-"+left);
        System.out.println("right val:-"+right);
        if(left>right)
        {
            ars.set(i, left);
            ars.set(left_idx,val);
            pushDown(ars, left_idx);
        }
        else
        {
            ars.set(i, right);
            ars.set(right_idx,val);
            pushDown(ars, right_idx);
        }
    }
    public static void del_min_Heap(ArrayList<Integer> ars, int del)
    {
        int min = find_min(ars);
        int needed_idx = find_idx(ars, del);
        int min_idx = find_idx(ars, min);
        if(needed_idx == -1)
        {
            System.out.println("No value found");
            return;
        }
        ars.set(needed_idx, min);
        pushDown(ars,needed_idx);
        // ars.set(min_idx,-1);
        ars.remove(min_idx);
    }
    public static void main(String[] args) 
    {
        ArrayList<Integer> heap = new ArrayList<>();
        heap.add(90);
        heap.add(80);
        heap.add(70);
        heap.add(20);
        heap.add(10);
        heap.add(50);
        heap.add(60);
        int del = 90;
        
        del_min_Heap(heap, del);
        int size = heap.size();
        for(int i =0;i<size;i++)
        {
            System.out.print(heap.get(i)+" ");
        }
        System.out.println();
    }
}
