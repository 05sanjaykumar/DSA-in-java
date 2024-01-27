import java.util.Arrays;

public class EmptySpace 
{
    public static void main(String[] args) 
    {
        int arr[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
		int n = arr.length;
		Arrays.sort(arr);
        int ars[] = arr.clone();
        int x=n-1;
        for(int i =n-1;i>=0;i--)
        {
            if(i == ars[x])
            {
                arr[i]= ars[x];
                x--;
            }
            else
            {
                arr[i] = -1;
            }
        }
        for(int g:arr)
        {
            System.out.print(g+" ");
        }
    }
}
//We are here filling the gap of -1 with whole numbers
//which are sorted in ascending order