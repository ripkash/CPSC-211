package stackexcerise;

import java.util.ArrayList;

public class StackImplementation<T> implements Stack<T> {
	ArrayList<T> Stack = new ArrayList<T>();
//use arraylists
	
	public void push(T item) {
		// TODO Auto-generated method stub
		Stack.add(item);
	}

	
	public T pop() {
		// TODO Auto-generated method stub
		if (Stack.size() != 0 ) { 
			int stacksize = Stack.size() -1;
		
		T vege = Stack.get(stacksize);
		Stack.remove(stacksize);
		return vege;

		}
		
		return null;
	}

	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (Stack.size() == 0) {
			return true;
		}
	
		return false;
	}

}
