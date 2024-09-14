package lola;

public class View 
{

	IsolaBoard board;

	public View(IsolaBoard b)
	{
	       board = b;
	}
	
	public void display ()
	
	{
		for (int row = 0; row < board.getHeight(); row++) {
		for (int col= 0; col < board.getWidth(); col++) {
			System.out.print(board.get(row, col));
			
			
						}
		System.out.println("");
	
	}
	}
}
