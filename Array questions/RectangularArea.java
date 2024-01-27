public class RectangularArea 
{
    public static void main(String[] args) 
    {
       int arr[][] = 
       {
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}
       };
        int r1=0,r2=2,c1=1,c2=3;
        int sum=0;
        for(int i =r1;i<=r2;i++)
        {
            for(int j=c1;j<=c2;j++)
            {
                sum+=arr[i][j];
            }
        }
        System.out.println("The sum of the rectange is :"+sum);
    }    
}
//Problem Solving in 2D Arrays - 3 | Prefix Sum | Lecture 23 | Java and DSA Foundation Course
//This create a create a rectange and return its sum