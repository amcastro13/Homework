package stack.project;

public final class QueueFixedArray<T> implements QueueInterface<T> {
	
	private final static int minCapacity = 0;
	private final static int maxCapacity = 10;
	private int front; // front of the line;
	private int back; // back of the line;
	private T[] queue; 
	
	public QueueFixedArray() {
		this(minCapacity);
	}
	
	public QueueFixedArray(int initialCapacity) {
		// TODO Auto-generated constructor stub
		@SuppressWarnings("unchecked")
		T[] tempqueue = (T[]) new Object[initialCapacity];
		queue = tempqueue;
		front = 0;
	}

	@Override
	public void enqueue(T newEntry) {
		// TODO Auto-generated method stub
		if(queue.length <= 10) {
		queue[back] = newEntry;
		back++;
		}
		
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		queue[front] = null;
		//for loop will shift the items forward 1 spot in the fixed array
		for(int i = 0; i <= back; i++) {
			queue[i] = queue[i+1];
		}
		back--;
		return queue[front];
		
	}

	@Override
	public T getFront() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new EmptyQueueException();
		}
		else
			return queue[front];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		boolean empty = false;
		if(queue[front] == null)
			empty = true;
		return empty;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		back = -1;
		
	}
	

}
