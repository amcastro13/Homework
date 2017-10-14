package stack.project;

import java.util.EmptyStackException;
import java.util.Vector;

public final class StackVectors<T> implements StackInterface<T>{

	private final static int minCapacity = 25;
	private final static int maxCapacity = 10000;
	private Vector<T> stack;
	
	public StackVectors() {
		
		this(minCapacity);
	}
	
	public StackVectors(int minCapacity) {
		// TODO Auto-generated constructor stub
		stack = new Vector<>(minCapacity);
		
	}

	@Override
	public void push(T newEntry) {
		// TODO Auto-generated method stub
		stack.add(newEntry);
	}
	@Override
	public T pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) 
			throw new EmptyStackException();
		else
			return stack.remove(stack.size() - 1);
		
	}
	@Override
	public T peek() {
		// TODO Auto-generated method stub
		if(isEmpty())
			throw new EmptyStackException();
		else
			return stack.lastElement();
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return stack.isEmpty();
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		stack.clear();
		
	}
	
	
}
