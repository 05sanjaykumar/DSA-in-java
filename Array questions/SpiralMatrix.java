public class SpiralMatrix 
{
    public static void main(String[] args) 
    {
        int arr[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},
        {16,17,18,19,20},{21,22,23,24,25}};
        System.out.println("The Original Matrix");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println();
        } 
        int rl = arr.length;
        int cl = arr[0].length;
        int r=0,c=0;
        int rsum=0,csum=-1;
        int mult = rl*cl;
        int step = 0; // step is the variable to jum inside the next square boundary column or row
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
            System.out.print(arr[rsum][csum]+"  ");
        }
    }    
}
//PRINTS THE PATTERN IN A SPIRAL ORDER, THIS ONLY WORKS FOR N*N AND NOT FOR N*M
// Problem Solving in 2D Arrays - 2 | Prefix Sum | Lecture 22 
// College wallah channel