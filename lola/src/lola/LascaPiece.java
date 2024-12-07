import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class LascaPiece<T> implements Queue<T> {
	ArrayList<T> list = new ArrayList<T>();
	
	@Override
	public boolean add(T item) {
		return list.add(item);
	}
	
	
	@Override
	public   T remove() {
		if(!list.isEmpty()) {
			T top = list.remove(0);
			return top;
		}
		return null;
	}
	
	
	@Override
	public boolean isEmpty() {
		if (list.size() == 0) {
			return true;
		}
		return false;
	}
	
	public T getTOp() {
		if((list.size() == 0)) {
			return null;
		}
		return list.get(0);
	}


	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean offer(T e) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public T poll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public T element() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return null;
	}
}
