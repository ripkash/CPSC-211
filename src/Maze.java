package lab2test;

public class Maze {

    private int height;
    private int width;
    private String[][] m;
    private String path;

    public Maze(int width, int height) {
        this.width = width;
        this.height = height;
        m = new String[height][width]; 
    }

    public void setMazeSpot(String s, int row, int col) {
        m[row][col] = s;
    }

    public String solveMaze(int startRow, int startCol, int endRow, int endCol) {
        path = "";  
        return makeMove(startRow, startCol, endRow, endCol, "");
    }

    public String makeMove(int row, int col, int endRow, int endCol, String path) {
      
        if (row < 0 || col < 0 || row >= height || col >= width || m[row][col].equals("V")) {
            return null;
        }

       
        if (row == endRow && col == endCol) {
            return path;
        }

       
        m[row][col] = "V";

        String result;

        
        result = makeMove(row - 1, col, endRow, endCol, path + "N ");
        if (result != null) return result;

        result = makeMove(row + 1, col, endRow, endCol, path + "S ");
        if (result != null) return result;

        result = makeMove(row, col - 1, endRow, endCol, path + "W ");
        if (result != null) return result;

        result = makeMove(row, col + 1, endRow, endCol, path + "E ");
        if (result != null) return result;

        return null;
    }

	public int getWidth() {
		// TODO Auto-generated method stub
		return width;
	}

	public int getHeight() {
		// TODO Auto-generated method stub
		return height;
	}

	public char getMazeSpot(int i, int j) {
		// TODO Auto-generated method stub
		return (Character) null;
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public static char[] get(int i, int x) {
		// TODO Auto-generated method stub
		return null;
	}

	public void set(char c, int row, int col) {
		// TODO Auto-generated method stub
		
	}

	public void add(BoardPosition boardPosition) {
		// TODO Auto-generated method stub
		
	}

	

	
	}

