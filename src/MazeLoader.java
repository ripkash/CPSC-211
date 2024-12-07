package lab2test;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//main
import java.util.ArrayList;

public class MazeLoader {
    private ArrayList<BoardPosition> cPair = new ArrayList<>();

    public static void main(String[] args) {
        new MazeLoader().go(); 
    }

    public void go() {
       
        MazeBoard m = getMazeFromFile();

       
        MazeBoardView v = new MazeBoardView(m);
        v.display();

       
        for (int i = 0; i < cPair.size(); i++) {
            String answer = m.solveMaze(cPair.get(i).getRow(), cPair.get(i).getColumn(),
                                    cPair.get(i).getRow(), cPair.get(i).getColumn());

            
            if (answer == null || answer.isEmpty()) {
                answer = "impossible";
            }

            System.out.println(answer); 

            m.clear(); 
        }
    }

   
    private MazeBoard getMazeFromFile() {
        
        return new MazeBoard(); 
    }




    public Maze loadMaze() {
       
        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showOpenDialog(null);
        File file = null;
        Maze maze = null;

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = chooser.getSelectedFile(); 
            Scanner scan = null;

            try {
                scan = new Scanner(file);

               
                int width = scan.nextInt();
                int height = scan.nextInt();
                scan.nextLine(); 
               
                maze = new Maze(width, height);

               
                for (int row = 0; row < height; row++) {
                    String line = scan.nextLine();
                    for (int col = 0; col < width; col++) {
                        char c = line.charAt(col);
                        maze.set(c, row, col); 
                    }
                }

              
                while (scan.hasNextLine()) {
                    String[] line = scan.nextLine().split(" ");
                    int startRow = Integer.parseInt(line[0]);
                    int startCol = Integer.parseInt(line[1]);
                    int endRow = Integer.parseInt(line[2]);
                    int endCol = Integer.parseInt(line[3]);

                    
                    maze.add(new BoardPosition(startRow, startCol));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace(); 
            }
        }
        return maze; 
    }
}
