import java.util.ArrayList;
import java.util.List;

public class sort_maxheap 
{
    private static void swap(List<Integer> heap, int i, int parent)
    {
        int k = heap.get(parent);
        int j = heap.get(i);
        heap.set(i,k);
        heap.set(parent,j); 
    }
    private static void pushDown(List<Integer> heap,int i)
    {
        int left = (i*2)+1;
        int right = left+1;
        if((left>heap.size()-1) )
        {
            return;
        }
        else if(left == heap.size()-1)
        {
            if(heap.get(i)<heap.get(left))
            {
                swap(heap, i, left);
            }
            return;
        }
        else if((heap.get(i)>heap.get(left) && heap.get(i)>heap.get(right)))
        {
            return;
        }
        else if(heap.get(left)>heap.get(right))
        {
            swap(heap, i, left);
            i = left;
            pushDown(heap, i);
        }
        else
        {
            swap(heap, i, right);
            i = right;
            pushDown(heap, i);
        }
    }
    private static void DeleteMaxHeap(List<Integer> arr, int i)
    {
        swap(arr, i, arr.size()-1);
        arr.remove(arr.size()-1);
        pushDown(arr, i);

    }
    public static void main(String[] args) 
    {
        List<Integer> heap = new ArrayList<>();
        heap.add(90);
        heap.add(80);
        heap.add(70);
        heap.add(20);
        heap.add(10);
        heap.add(50);
        heap.add(60);
        
        while(heap.isEmpty() == false)
        {
            System.out.println(heap.get(0));
            DeleteMaxHeap(heap, 0);
        }
        
    }    
    
}
