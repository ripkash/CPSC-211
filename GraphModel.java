import java.util.*;

public class GraphModel {
    private int numberOfNodes;
    private List<List<Integer>> adjacencyList;

   
    public GraphModel(int numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
        adjacencyList = new ArrayList<>();
        for (int i = 0; i < numberOfNodes; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

   
    public void addEdge(int from, int to) {
        adjacencyList.get(from).add(to);
    }

   
    public boolean isSolvable() {
        boolean[] visited = new boolean[numberOfNodes];
        dfs(0, visited);

       
        for (boolean nodeVisited : visited) {
            if (!nodeVisited) return false;
        }
        return true;
    }

   
    private void dfs(int node, boolean[] visited) {
        visited[node] = true;
        for (int neighbor : adjacencyList.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited);
            }
        }
    }
}
