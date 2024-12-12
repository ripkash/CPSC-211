import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GraphTest {
    @Test
    public void testSolvableGraph() {
        GraphModel model = new GraphModel(4);
        model.addEdge(0, 1);
        model.addEdge(0, 3);
        model.addEdge(1, 2);
        model.addEdge(2, 0);
        model.addEdge(2, 3);
        model.addEdge(3, 1);

        assertTrue(model.isSolvable());
    }

    @Test
    public void testUnsolvableGraph() {
        GraphModel model = new GraphModel(4);
        model.addEdge(0, 1);
        model.addEdge(0, 2);
        model.addEdge(1, 2);

        assertFalse(model.isSolvable());
    }
}
