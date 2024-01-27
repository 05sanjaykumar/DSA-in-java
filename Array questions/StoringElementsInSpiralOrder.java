public class StoringElementsInSpiralOrder
{
    public static void main(String[] args) 
    {
        int arr[][] = new int[3][3];
        int rl = arr.length;
        int cl = arr[0].length;
        int r=0,c=0;
        int rsum=0,csum=-1;
        int mult = rl*cl;
        int step = 0;
        for(int i=0;i<mult;i++)
        {
            if(i==0)
            {
                c=1;
                r=0;
            }
            if(rsum==step+1 && csum==step)
                {
                    c=1;
                    r=0;
                    step++;
                }
            if(csum==cl-(1+step))
            {
                r=1;
                c=0;
            }
            if(rsum == rl-(1+step) && csum == cl-(1+step))
            {
                c=-1;
                r=0;
                
            }
            if(csum == 0+step && rsum == rl-(1+step))
            {
                r=-1;
                c=0;
                
            }
            rsum+=r;
            csum+=c;
            arr[rsum][csum] = i+1;
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println();
        } 
    }
}
// STORING THE ELEMENTS IN THE SPIRAL ORDER IN A MATRIX
// Problem Solving in 2D Arrays - 2 | Prefix Sum | Lecture 22 
// College wallah channel