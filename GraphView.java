import javax.swing.JOptionPane;

public class GraphView {
  
    public static void displayResult(String fileName, boolean isSolvable) {
        String resultMessage = "File: " + fileName + "\nResult: " + (isSolvable ? "Solvable" : "Not Solvable");
        JOptionPane.showMessageDialog(null, resultMessage);
    }
}
