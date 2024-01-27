import java.util.*;
public class SquareSort
{
    public static void main(String[] args) 
    {
        int arr[]  ={-10,-3,-2,1,4,5};
        int len = arr.length;
        int left = len-1;
        int right = 0;
        int ans[] = new int[len];
        System.out.println("before sorting");
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<len;i++)
        {
            if(arr[right]*arr[right]>= arr[left]*arr[left])
            {
                ans[i] = arr[right]*arr[right];
                right++;
            }
            else
            {
                ans[i] = arr[left]*arr[left];
                left--;
            }
        }
        System.out.println("After sorting");
        System.out.println(Arrays.toString(ans));
        

    }
}
//We are square rooting the above array values and then
//sorting the array