package Algorithms.searching;
public class TargetSearching 
{
        public static void main(String[] args) 
        {
            int arr[] = {6,7,8,9,10,1,2,3,4,5};
            int start = 0;
            int end = arr.length-1;
            int mid = 0;
            int target = 3;
            int ans = -1;
            while(start<=end)
            {
                mid = (start+end)/2;
                if(arr[mid]==target)
                {
                    ans = mid;
                    break;
                }
                else if(arr[mid]<arr[end])
                {
                    if(target > arr[mid] && target <=arr[end])
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
            System.out.println("The lowest possible element of the arrary is in index:- "+ans);
        }
}
