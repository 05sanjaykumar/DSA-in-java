package Algorithms.searching;
public class FirstOccurenceBinary 
{
    static int count=-1;
    static void search(int arr[],int mid,int target,int start,int end)
    {
        if(start == end && arr[mid]!=target)
        {
            return;
        }
        else if(arr[mid]==target && start!=end && mid<=start)
        {
            count = mid;
            return;
        }
        else if(arr[mid]==target && start!=end && mid>start)
        {
            count = mid;
            end = mid-1;
            mid = (start+end)/2; 
        }
        else if(arr[mid]==target && start == end)
        {
            count = mid;
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
        int arr[] = {2,2,5,5,6,6,7,8,9};
        int len = arr.length;
        int mid = len/2;
        int target = 5;
        search(arr, mid, target,0,len-1);
        System.out.println("The first occurence at index :"+count);
    }    
}
