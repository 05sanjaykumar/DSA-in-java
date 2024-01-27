import java.util.Scanner;

public class PascalTriangle
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the limit for the pascals triangle :");
        Scanner sc = new Scanner(System.in);    
        int a = sc.nextInt();
        System.out.println("The pascal Triangle is");
        int c=0;
        int arr[][] = new int[a][];
        for(int i=0;i<a;i++)
        {
            arr[i] = new int[i+1];
            for(int j=0;j<=i;j++)
            {
                
                
                if(c==1 || c==(i-1))
                {
                    System.out.print(i+"  ");
                    arr[i][j] = i;
                }
                else if(c==0 || (c==i))
                {
                    System.out.print(1+"  ");
                    arr[i][j] = 1;
                }
                else
                {
                    arr[i][j] =arr[i-1][j-1]+arr[i-1][j];
                    System.out.print(arr[i][j]+"  ");
                }
                c++;
            }
            System.out.println();
            c=0;
        }
        sc.close();
    }
}