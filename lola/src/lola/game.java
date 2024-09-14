package lola;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class game {

	public void rungame() {
		IsolaBoard model = new IsolaBoard();
		View view = new View(model);
		
		BoardSpace currentPlayer = BoardSpace.Player1;

		Scanner scan = new Scanner(System.in);
		PrintWriter replay;
		try {
			 replay = new PrintWriter(new File("game.dat"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			return;
		}
		while(model.checkWinner() == BoardSpace.Available) {
			view.display();
			
			String input = scan.next();
		
			BoardPosition newPosition = getNewPosition(input, currentPlayer, model );
			
			model.movePlayer(currentPlayer, newPosition);
			
			
			if (newPosition.getRow() == model.findPosition(currentPlayer).getRow()&& newPosition.getColumn()== model.findPosition(currentPlayer).getColumn()) {
				replay.println(input);
				if (currentPlayer == BoardSpace.Player1) { 
					currentPlayer = BoardSpace.Player2;
				}
				else {
					currentPlayer = BoardSpace.Player1;
				}
				
			} 
		
		}
		 BoardSpace a = model.checkWinner();
		if (a == BoardSpace.Player1)  System.out.println("Player 2 Wins!");
		else System.out.println("Player 1 Wins!");
		
		replay.close();
	
	}

	private static BoardPosition getNewPosition(String input, BoardSpace currentPlayer, IsolaBoard model) {
		
		int cr = model.findPosition(currentPlayer).getRow();
		int cc = model.findPosition(currentPlayer).getColumn();
		
		
		if(input.equals("ne")) {
			return new BoardPosition(cr-1, cc+1);
		}
		if(input.equals("sw")) {
			return new BoardPosition(cr+1, cc-1);
		}
		if(input.equals("se")) {
			return new BoardPosition(cr+1, cc+1);
		}
		if(input.equals("nw")) {
			return new BoardPosition(cr-1, cc-1);
			
		}if(input.equals("s")) {
			return new BoardPosition(cr+1, cc);
		}
		if(input.equals("w")) {
			return new BoardPosition(cr, cc-1);
		}
		if(input.equals("e")) {
			return new BoardPosition(cr, cc+1);
		}
		if(input.equals("n")) {
			return new BoardPosition(cr-1, cc);
		}
		
		
		
		
		
		return null;
	}

}
