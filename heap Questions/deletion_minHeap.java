import java.util.ArrayList;
import java.util.List;

public class deletion_minHeap 
{
    static void pushup(List<Integer> heap,int i)
    {
        int par_ind = (int)Math.floor((i-1)/2);
        if(i==0 || heap.get(par_ind)<heap.get(i))
        {
            return;
        }
        else
        {
            int v = heap.get(par_ind);
            heap.set(par_ind, heap.get(i));
            heap.set(i,v);
            pushup(heap, par_ind);
        }
    }
    static void insertMin_Heap(int val,List<Integer> heap)
    {
        heap.add(val); 
        int index = heap.size();
        pushup(heap,index-1);

    }
    public static void main(String[] args) 
    {
        List<Integer> heap = new ArrayList<>();
        heap.add(5);
        heap.add(20);
        heap.add(10);
        heap.add(40);
        heap.add(50);
        heap.add(30);
        heap.add(60);
        List<Integer> hp = new ArrayList<>();
        int del = 5;
        for(int i=0;i<heap.size();i++)
        {
            if(heap.get(i) == del)
            {
                continue;
            }
            hp.add(heap.get(i));
        }
        heap.clear();
        for(int i=0;i<hp.size();i++)
        {
            insertMin_Heap(hp.get(i), heap);
        }
        for(var x:heap)
        {
            System.out.print(x +" ");
        }
        System.out.println();
    }    
}
