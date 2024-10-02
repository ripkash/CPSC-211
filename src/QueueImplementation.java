import java.util.ArrayList;

public class QueueImplementation<T> implements Queue<T>{

	ArrayList<T> Queue = new ArrayList<T>();
	@Override
	public void add(T item) {
		// TODO Auto-generated method stub
		Queue.add(item);
	}

	@Override
	public T remove() {
		if (Queue.size() != 0 ) { 
			T test = Queue.get(0);
			Queue.remove(0);
			return test;
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		if (Queue.size() == 0) {
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

}
