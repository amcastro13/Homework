package stack.project;


public class QueueCircularLinked<T> implements QueueInterface<T> {
	

	private Node topNode;
	private Node lastNode;
	private int back;
	private int free;
	private static final int maxCapacity = 10;

	private class Node{
		
		private T data;
		private Node nextNode;
		
		public Node(T newData, Node newNode)
		{
			data = newData;
			nextNode = newNode;
		}
		/**
		 * @return the data
		 */
		public T getData() {
			return data;
		}
		/**
		 * @return the nextNode
		 */
		public Node getNextNode() {
			return nextNode;
		}
		/**
		 * @param data the data to set
		 */
		public void setData(T data) {
			this.data = data;
		}
		/**
		 * @param nextNode the nextNode to set
		 */
		public void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}
	}
	
	public QueueCircularLinked() {
		topNode = lastNode;
	}
	
	public QueueCircularLinked(T newEntry) {
		newEntry = lastNode.getData();
		topNode = lastNode;
		free = 0;
		back = 0;
	}

	@Override
	public void enqueue(T newEntry) {
		// TODO Auto-generated method stub
		
		Node newNode = new Node(newEntry, topNode);
		lastNode = newNode;
		if(isEmpty()) {
			lastNode = topNode;
		}
		else
			back++;
		
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		T temp;
		if(isEmpty())
		{
			throw new EmptyQueueException();
		}
		else {
		topNode.setData(null);
		temp = topNode.getData();
		back--;
		}
		return temp;
	}

	@Override
	public T getFront() {
		// TODO Auto-generated method stub
		T temp = topNode.getData();
		return temp;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		boolean empty = false;
		if(back == 0)
			empty = true;
		return empty;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		topNode = null;
		lastNode = null;
		back = -1;
		free = -1;
		
	}
}
