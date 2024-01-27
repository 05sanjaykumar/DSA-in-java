public class SudukuSolver
{
    static boolean b= false;
    public static boolean isValid(char c, char board[][],int row, int col)
    {
        int i=0;
        int j =0;
        int n = board.length;
        int count =0;
        for(int k=0;k<n;k++)
        {
            if(board[row][k] == c)
            {
                count++;
            }
            if(count>=1)
            {
                return false;
            }
        }
        count =0;
        for(int k=0;k<n;k++)
        {
            if(board[k][col] == c)
            {
                count++;
            }
            if(count>=1)
            {
                return false;
            }
        }
        i = row/3;
        j = col/3;
        int start_col = 3*j;
        int end_col = start_col+3;
        int start_row = 3*i;
        int end_row = start_row+3;
        count = 0;
        for(int k = start_row;k<end_row;k++)
        {
            for(int l = start_col;l<end_col;l++)
            {
                if(board[k][l] == c)
                {
                    count++;
                }
                if(count>=1)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void solve(char board[][], int row, int col)
    {
        if(row == 9)
        {
            b = true;
            return;
        }
        else if(board[row][col]!= '.')
        {
            if(col>=8)
            {
                solve(board,row+1,0);
            }
            else
            {
                solve(board,row,col+1);
            }
        }
        else
        {
            for(int i=1;i<=9;i++)
            {
                char c = (char)(i+'0');
                if(isValid(c,board,row,col))
                {
                    board[row][col] = c;
                    if(col>=8)
                    {
                        solve(board,row+1,0);
                    }
                    else
                    {
                        solve(board,row,col+1);
                    }
                    if(b == true)
                    {
                        return;
                    }
                    board[row][col] = '.';
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        char board[][] = 
        {
            {'.','9','.','5','6','.','.','.','.'},
            {'.','4','6','.','1','8','9','5','7'},
            {'1','2','5','7','.','.','.','6','4'},
            {'2','8','.','.','.','.','.','7','.'},
            {'9','.','.','1','5','6','.','3','8'},
            {'6','.','.','8','2','.','4','9','1'},
            {'4','.','.','9','8','.','.','1','6'},
            {'.','.','.','.','.','.','3','.','.'},
            {'8','.','.','6','3','2','.','.','9'}
        };
        solve(board,0,0);
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}