package Algorithms.searching;
public class MountainElement 
{
    // To find the mountains element the size of the array must be greater than 2
    public static void main(String[] args) 
    {
        int arr[]= {1,4,7,9,8,6,3,0};    
        int mid =0;
        int start =0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end)
        {
            mid = (start+end)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
            {
                ans = mid;
                break;
            }
            else if(arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1])
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        System.out.println("The biggest element index at  "+ans+" and the number is "+arr[mid]);
    }    
}
