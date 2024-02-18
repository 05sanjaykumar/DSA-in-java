import java.util.ArrayList;
import java.util.List;
public class ins_maxHeap 
{
    static void pushup(List<Integer> heap,int i)
    {
        int par_ind = (int)Math.floor((i-1)/2);
        if(i==0 || heap.get(par_ind)>heap.get(i))
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
    static void insertMax_Heap(int val,List<Integer> heap)
    {
        heap.add(val); 
        int index = heap.size();
        pushup(heap,index-1);

    }
    public static void main(String[] args) 
    {
        List<Integer> heap = new ArrayList<>();
        heap.add(60);
        heap.add(50);
        heap.add(40);
        heap.add(30);
        heap.add(20);
        heap.add(30);
        heap.add(10);

        insertMax_Heap(40, heap);
        System.out.println(heap);
    }    
}
