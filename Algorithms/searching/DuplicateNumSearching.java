package Algorithms.searching;
public class DuplicateNumSearching 
{
    public static void main(String[] args) 
    {
            int arr[] = {1,1,1,1,1,1,2,3,1,1};
            int target = 3;
            int len = arr.length;
            int start =0,end=len-1,mid =0;
            int ans =-1;
            while(start<=end)
            {
                mid = (start+end)/2;
                if(arr[mid]==target)
                {
                    ans =mid;
                    break;
                }
                else if(arr[mid]==arr[start] && arr[mid] == arr[end])
                {
                    start++;
                    end--;
                }
                else if(arr[mid]<arr[end])
                {
                    if(target>arr[mid] && target<=arr[end])
                    {
                        start = mid+1;
                    }
                    else
                    {
                        end = mid-1;
                    }
                }
                else
                {
                    if(target >= arr[start] && target< arr[mid])
                    {
                        end = mid-1;
                    }
                    else
                    {
                        start = mid+1;
                    }
                }
            }
            if(ans == -1)
            {
                System.out.println(false);
            }
            else
            {
                System.out.println(true);
            }
            
    }    
}
