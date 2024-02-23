import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianHeap 
{
    private static void add(PriorityQueue<Integer> left,PriorityQueue<Integer> right, int val )
    {
        if(left.isEmpty())
        {
            left.add(val);
        }
        else
        {
            // Add missing import statement for Comparator

            int left_max = left.peek();
            // int right_min = right.peek();
            if(val<left_max)
            {
                if(right.size() == left.size())
                {
                    left.add(val);
                }
                else
                {
                    right.add(left.remove());
                    left.add(val);
                }
            }
            else
            {
                if(right.size() == left.size())
                {
                    left.add(right.remove());
                    right.add(val);
                }
                else
                {
                    right.add(val);
                }
            }
        }
    }
    public static int median(PriorityQueue<Integer> left,PriorityQueue<Integer> right)
    {
        if(left.isEmpty())
        {
            return -1;
        }
        else if(left.size() - right.size() == 1)
        {
            return left.peek();
        }
        else
        {
            return (left.peek()+right.peek())/2;
        }
    }
    public static void main(String[] args) 
    {
        PriorityQueue<Integer> right = new PriorityQueue<>();   
        PriorityQueue<Integer> left = new PriorityQueue<>(Comparator.reverseOrder());
        add(left, right, 15);
        add(left, right, 10);
        System.out.println("The median is :"+median(left, right));
    }
}
//Lecture 78
//Error in code, wanted to fix the error in the code