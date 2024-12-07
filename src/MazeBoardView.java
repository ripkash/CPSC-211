package lab2test;

public class MazeBoardView {
	private MazeBoard board;
	
	public MazeBoardView (MazeBoard b)
	{
		board = b;
	}
	
	public void display()
	{
		int height = 0;
		int width = 0;
		for (int row = 0; row < height; row++)
			for (int column = 0; column < width; column++)
			{
				BoardSpace which = board.get(row, column);
			
				if (which == BoardSpace.Player1)
					System.out.print("1");
				
				if (which == BoardSpace.Player2)
					System.out.print("2");
					
				if (which == BoardSpace.Available)
					System.out.print("-");
					
				if (which == BoardSpace.Missing)
					System.out.print("remove");
					
		}
	}
}

	