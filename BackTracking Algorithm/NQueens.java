public class NQueens 
{
    static int numberOfWays= 0;
    private static boolean isSafe(char[][] board, int row, int col) 
    {
        int n = board.length;
        for(int j=0;j<n;j++)
        {
            if(board[row][j]=='Q')
            {
                return false;
            }
        }
        for(int j=0;j<n;j++)
        {
            if(board[j][col]=='Q')
            {
                return false;
            }
        }
        //check north east
        int i= row;
        int j =col;
        while(i>=0 && j<n)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i--;
            j++;
        }
        //check south east
         i= row;
         j =col;
        while(i<n && j<n)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i++;
            j++;
        }
        //check south west
         i= row;
         j =col;
        while(i<n && j>=0)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i++;
            j--;
        }
        //check north west
         i= row;
         j =col;
        while(i>=0 && j>=0)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i--;
            j--;
        }
        return true;
    }
    private static void nqueen(char board[][],int row)
    {
        int n = board.length;
        if(row == n)
        {
            numberOfWays++;
            System.out.println();
            for(int i =0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            
            return;
        }
        for(int j=0;j<n;j++)
        {
            if(isSafe(board,row,j)==true)
            {
                board[row][j]= 'Q';
                nqueen(board, row+1);
                board[row][j] = 'X';
            }
        }
    }
    public static void main(String[] args) 
    {
        int n = 1;
        char board[][] = new char[n][n];
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j] = 'X';
            }
        }
        nqueen(board, 0);
        System.out.println("The total numbers of ways are :"+numberOfWays);
    }    
}
