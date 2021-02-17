package mywork;

public class nqueens {

	public static void main(String[] args) {
		boolean[][] board=new boolean[4][4];
		System.out.println(countq(board,0));

	}
	public static int countq(boolean[][] board,int row)
	{
		if(row==board.length)
		{
			return 1;
		}
		int count =0;
		for(int col=0;col<board[row].length;col++)
		{
			if(safe(board,row,col))
			{
				board[row][col]=true;
				count=count+countq(board,row+1);
				board[row][col]=false;
			}
		}
		return count;
	}
	public static boolean safe(boolean[][] board,int row,int col)
	{
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(board[row]!=board[col])
				{
					return false;
				}
				
			}
		}
		return true;
	}

}
