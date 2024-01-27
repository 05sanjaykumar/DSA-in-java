package Algorithms.searching;
public class TestingBinary 
{
    public static void main(String[] args) 
    {
        int arr[][] = 
        {
            {2,4,6,8},
            {5,6,7,20},
            {7,11,13,25},
            {12,14,17,30}
        };    
        int target= 10;
        int c = arr[0].length-1;
        int r = 0;
        int len = arr.length-1;
        int i=-1,j=-1;
        while(c>=0 && r<=len)
        {
            if(arr[r][c]==target)
            {
                i=r;
                j=c;
                break;
            }
            else if(arr[r][c] >target)
            {
                c--;
            }
            else
            {
                r++;
            } 
        }
        if(i==-1)
        {
            System.out.println("Answer not found");
        }
        else
        {
            System.out.printf("Answer found at index %d , %d \n",i,j);
        }
    }    
}
//lecture 47