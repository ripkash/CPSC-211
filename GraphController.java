import java.io.*;
import java.util.*;
import javax.swing.JFileChooser;

public class GraphController {
    private GraphModel model;

    public void loadAndCheckGraphs() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File directory = fileChooser.getSelectedFile();
            File[] files = directory.listFiles((dir, name) -> name.endsWith(".txt"));

            if (files != null) {
                for (File file : files) {
                    processFile(file);
                }
            }
        }
    }

    private void processFile(File file) {
        try (Scanner scanner = new Scanner(file)) {
            int numberOfSpaces = scanner.nextInt();
            model = new GraphModel(numberOfSpaces);

            for (int i = 0; i < numberOfSpaces; i++) {
                while (scanner.hasNextInt()) {
                    int connection = scanner.nextInt();
                    model.addEdge(i, connection);
                }
            }

            boolean solvable = model.isSolvable();
            GraphView.displayResult(file.getName(), solvable);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
