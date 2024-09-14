package lola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class boardtest {

	@Test
	void testGet() {
		IsolaBoard b = new IsolaBoard();
		// 0 - 6 outside of range is bad
		if (b.get(-1,3) != null) fail("took -1 as a row");
		if (b.get(7, 6) != null) fail("took 7 as a row");
		if (b.get(0, 3) == null) fail("did not take 0 as a row");
		if (b.get(3, 2) == null) fail("did not take 3 as a row");
		if (b.get(6, 3) == null) fail("did not take 6 as a row");
		if (b.get(3,-1) != null) fail("took -1 as a column");
		 if (b.get(6,7) != null)  fail("took 6 as a column");
		if (b.get(3, 0) == null) fail("did not take 0 as a column");
		if (b.get(2, 3) == null) fail("did not take 3 as a column");
		if (b.get(3, 6) == null) fail("did not take 6 as a column");
		
		}
		
		@Test
		void testfindPosition() {
			IsolaBoard b = new IsolaBoard();
			BoardPosition bp = b.findPosition(BoardSpace.Player1);
			if (bp.getRow() != 0 || bp.getColumn() != 3) fail("expected player 1 to be at 0,3, got " + bp); 
			 bp = b.findPosition(BoardSpace.Player2);
			if (bp.getRow() != 6 || bp.getColumn() != 3) fail("expected player 2 to be at 6,3, got " + bp); 
			
			

	}
			@Test
			void moveplayer() {
				IsolaBoard b = new IsolaBoard();
				b.movePlayer(BoardSpace.Player1, new BoardPosition(0,4));
			if(b.get(0, 4) != BoardSpace.Player1) fail("expected player to be at 0,4, got" + b.get(0, 4));
			b.movePlayer(BoardSpace.Player2, new BoardPosition(2,3));
			if(b.get(2, 3) == BoardSpace.Player2) fail("expected player to be at 2,3, got" + b.get(2, 3));
			
			

}
			@Test
			void checkwinner() {
			IsolaBoard  b = new IsolaBoard(5,5);
			View v = new View(b);
			
			if (b.checkWinner() != BoardSpace.Available) fail("shouldn't be a winner");
			b.movePlayer(BoardSpace.Player1, new BoardPosition(1,2));
			b.movePlayer(BoardSpace.Player1, new BoardPosition(1,3));
			b.movePlayer(BoardSpace.Player1, new BoardPosition(1,4));
			b.movePlayer(BoardSpace.Player1, new BoardPosition(0,4));
			b.movePlayer(BoardSpace.Player1, new BoardPosition(0,3));
			if (b.checkWinner() != BoardSpace.Player2) fail("player 2 should have won got" + b.checkWinner());
			 b = new IsolaBoard(5,5);
			 v = new View(b);
			
			
			b.movePlayer(BoardSpace.Player2, new BoardPosition(3,2));
			b.movePlayer(BoardSpace.Player2, new BoardPosition(3,3));
			b.movePlayer(BoardSpace.Player2, new BoardPosition(3,4));
			b.movePlayer(BoardSpace.Player2, new BoardPosition(4,4));
			b.movePlayer(BoardSpace.Player2, new BoardPosition(4,3));
			if (b.checkWinner() != BoardSpace.Player1) fail("player 1 should have won got" + b.checkWinner());
			
			
			
			
	
			
			}}
