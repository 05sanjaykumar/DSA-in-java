import java.util.ArrayList;
import java.util.List;

public class Heapify_minH
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
            if(heap.get(i)>heap.get(left))
            {
                swap(heap, i, left);
            }
            return;
        }
        else if((heap.get(i)<heap.get(left) && heap.get(i)<heap.get(right)))
        {
            return;
        }
        else if(heap.get(left)<heap.get(right))
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
    private static void heapify(List<Integer> heap)
    {
        int fln = (heap.size()-2)/2;
        for(int i=fln;i>=0;i--)
        {
            pushDown(heap, i);
        }
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
        
        System.out.println(heap);
        heapify(heap);
        System.out.println(heap);

            
    }
}