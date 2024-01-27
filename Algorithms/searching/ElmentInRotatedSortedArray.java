package Algorithms.searching;
public class ElmentInRotatedSortedArray 
{
    public static void main(String[] args) 
    {
        int arr[] = {10,11,12,1,2,3,4,5,6,7,8,9};
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while(start<end)
        {
            mid = (start+end)/2;
            if(arr[mid] < arr[end])
            {
                end = mid-1;
            }
            else 
            {
                start = mid+1;
            }
        }
        System.out.println("The lowest possible element of the arrary is in index:- "+start);
    }
}
//lecture 46 rotate sorted array, finding the element