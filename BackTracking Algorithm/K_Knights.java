public class K_Knights
{
    static int max_val = -1;
    public static boolean isSafe(char grid[][],int row,int col)
    {
        int n = grid.length;
        int i,j;

        //2 Up 1 right
        i = row - 2;
        j = col + 1;
        if((i>=0 && j<n)  && grid[i][j] == 'K')
        {
            return false;
        }

        //2 Up 1 left
        i = row - 2;
        j = col -1;
        if((i>=0 && j>=0)  && grid[i][j] == 'K')
        {
            return false;
        }

        //2 down 1 left
        i = row + 2;
        j = col -1;
        if((i<n && j>=0)  && grid[i][j] == 'K')
        {
                return false;
        }

        //2 down 1 right
        i = row + 2;
        j = col +1;
        if((i<n && j<n)  && grid[i][j] == 'K')
        {
            return false;
        }

        //2 left 1 down
        i = row+1;
        j = col-2;
        if((i<n && j>=0)  && grid[i][j] == 'K')
        {
            return false;
        }

        //2 left 1 up
        i = row-1;
        j = col-2;
        if((i>=0 && j>=0)  && grid[i][j] == 'K')
        {
            return false;
        }

        //2 right 1 up
        i = row-1;
        j = col+2;
        if((i>=0 && j<n)  && grid[i][j] == 'K')
        {
                return false;
        }

        //2 right 1 down
        i = row+1;
        j = col+2;
        if((i<n && j<n)  && grid[i][j] == 'K')
        {
            return false;
        }
        return true;
    }
    public static void place(char board[][],int row,int col,int num)
    {
        int n = board.length;
        if(row == n)
        {
            max_val = Math.max(num,max_val);
            // System.out.println(num);
            for(int i =0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        else if(isSafe(board, row, col))
        {
            board[row][col] = 'K';
            if(col!=n-1)
            {
                place(board, row, col+1, num+1);
            }
            else
            {
                place(board, row+1, 0, num+1);
            }
            board[row][col] = '.';
        }
                if(col!=n-1)
                {
                    place(board, row, col+1, num);
                }
                else
                {
                    place(board, row+1, 0, num);
                }
        
    }
    public static void main(String[] args) 
    {
        int n = 2;
        char board[][] = new char[n][n];
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j] = '.';
            }
        }
    
        place(board, 0, 0, 0);
        System.out.println(max_val);
    }
}