public class MoveZerosToEnd 
{
    public static void main(String[] args) 
    {
        int arr[] = {0,5,0,3,4,2};
        int x =0;
        int l = arr.length-1;
        for(int i=0;i<=l;i++)
        {
            if(arr[i]==0)
            {
                continue;
            }
            else
            {
                arr[x] = arr[i];
                x++;
            }
        }
        for(int i=x;i<=l;i++)
        {
            arr[i] = 0;
        }
        for(int r:arr)
        {
            System.out.print(r+" ");
        }
        System.out.println();
    }    
}
//Lecture 40 but did in my own idea