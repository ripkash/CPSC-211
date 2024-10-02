import java.util.ArrayList;
import java.util.Collections;

public class PriorityQueueImplementation <T extends Comparable<T>>implements PriorityQueue<T>{

	ArrayList<T> PriorityQueue = new ArrayList<T>();
	@Override
	public void add(T item) {
		// TODO Auto-generated method stub
		PriorityQueue.add(item);
	}

	@Override
	public T remove() {
		if (PriorityQueue.size() != 0 ) {
			Collections.sort(PriorityQueue);
			T prior = PriorityQueue.get(PriorityQueue.size() - 1);
			PriorityQueue.remove(PriorityQueue.size() - 1);
			return prior;
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		if (PriorityQueue.size() == 0) {
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}
	

}
