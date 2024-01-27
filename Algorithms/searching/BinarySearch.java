package Algorithms.searching;
public class BinarySearch 
{
    static void search(int arr[],int mid,int target,int start,int end)
    {
        if(start == end && arr[mid]!=target)
        {
            System.out.println("No answer found at index :"+mid);
            return;
        }
        else if(arr[mid]==target)
        {
            System.out.println("answer found at index :"+mid);
            return;
        }
        else if(arr[mid]<target)
        {
            start = mid+1;
            mid = (start+end)/2;
            search(arr,mid,target,start,end);
        }
        else
        {
            end = mid-1;
            mid = (start+end)/2; 
            search(arr,mid,target,start,end);
        }
    }
    public static void main(String[] args) 
    {
        int arr[] = {2,4,5,7,15,20,24,45,50,70};
        int len = arr.length;
        int mid = len/2;
        int target = 24;
        search(arr, mid, target,0,len-1);
    }    
}
// Other efficient methods in lecture 45