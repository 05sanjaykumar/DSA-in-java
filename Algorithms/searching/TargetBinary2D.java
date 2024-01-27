package Algorithms.searching;
public class TargetBinary2D 
{
    public static void main(String[] args) 
    {
        int arr[][] = 
        {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };  
        int target =10;
        int tot = arr.length*arr[0].length;
        int start=0;
        int end = tot-1;  
        int len = arr[0].length;
        int mid =0;
        int ans =-1;
        int mrow=0,mcol=0;
        while(start<=end)
        {
            mid = (start+end)/2;
            mrow= mid/len;
            mcol= mid%len;
            if(arr[mrow][mcol]== target)
            {
                ans = mrow*len+mcol;
                break;
            }
            else if(arr[mrow][mcol]> target)
            {
                end = mrow*len+mcol-1;
            }
            else
            {
                start = mrow*len+mcol+1;
            }
        }
        if(ans==-1)
        {
            System.out.println("Answer not found");
        }
        else
        {
            System.out.println("The answer if found at the index:- "+ans/len+","+ans%len);
        }
    }    
}
//lecture 47