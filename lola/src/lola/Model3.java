import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

	public class Model3 {
	LascaPiece [][] board = null;
	public void createBoard() {
    File file = null;
    JFileChooser chooser = new JFileChooser();
    
   
    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
        file = chooser.getSelectedFile();
    } else {
        System.out.println("File selection cancelled.");
        return;
    }
    
    try (Scanner scanner = new Scanner(file)) {
        int HEIGHT = 7, WIDTH = 7;
        LascaPiece[][] newBoard = new LascaPiece[HEIGHT][WIDTH];
        
        for (int i = 0; i < HEIGHT; i++) {
            if (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                
                for (int j = 0; j < WIDTH && j < line.length(); j++) {
                	LascaPiece <Character> sprite = new LascaPiece <>();
                	char space = line.charAt(j);
                    sprite.add(space);
                    newBoard[i][j] = sprite;
                       
                   
                }
            } else {
                System.out.println("Insufficient lines in file. Exiting...");
                break;
                  
            }
            
            
        }
        board = newBoard;
    } catch (FileNotFoundException e) {
        System.out.println("File not found: " + file.getPath());
        e.printStackTrace();
    } catch (Exception e) {
        System.out.println("An unexpected error occurred.");
        e.printStackTrace();
    }
}

	public LascaPiece<Character> get(int v, int y) {
	// TODO Auto-generated method stub
	return board[v][y];
}
	
}
