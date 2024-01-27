import java.util.*;
public class swappingElements
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5,6,7};
        int len = arr.length;
        int count = 0;
        int t = 0;
        for(int i=0;i<len;i++)
        {
            if(arr[i]%2==0)
            {
                t = arr[count];
                arr[count] = arr[i];
                arr[i] = t;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
// In this program we are bring the even value to one side and
// odd value to another size of the array