package Algorithms.sorting;
public class Sorting012
{
    public static void main(String[] args) 
    {
        int arr[] = {2,1,1,2,2,0,0,1,1,2,2,0,1};
        int len = arr.length;
        int low=0,mid=0,hi=len-1;
        while(mid<hi)
        {
            if(arr[mid] == 1)
            {
                mid++;
            }
            if(arr[mid] == 0 && arr[low]==1)
            {
                arr[mid] = 1;
                arr[low] = 0;
                mid++;
                low++;
            }
            if(arr[mid]==2 && arr[hi] == 1)
            {
                arr[mid] = 1;
                arr[hi] = 2;
                hi--;
                mid++;
            }
            if(arr[hi] == 0 && arr[low] == 1)
            {
                arr[hi] = 1;
                arr[low] = 0;
                low++;
            }
            if(arr[mid] == 2 && arr[hi]==0)
            {
                arr[hi] =2;
                arr[mid] =0;
                hi--;
            }
            if(arr[hi]==2)
            {
                hi--;
            }
        }
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }
}