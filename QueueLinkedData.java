package stack.project;

public class QueueLinkedData<T> implements QueueInterface<T> {

	private int bottomNode;
	private Node lastNode;
	private Node topNode;

	private class Node{
		private T data;
		private Node nextNode;
		
		public Node(T newData, Node node) {
			data = newData;
			nextNode = node;
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

	public QueueLinkedData() {
		topNode = null;
			
	}
	public QueueLinkedData(T newEntry) {
		newEntry = topNode.getData();
		lastNode = topNode.getNextNode();
		bottomNode = 0;
		
	}
	@Override
	public void enqueue(T newEntry) {
		// TODO Auto-generated method stub
		Node newNode = new Node(newEntry, topNode);
		lastNode = newNode;
		bottomNode++;
		if(isEmpty()) {
			lastNode = topNode;
		}
		
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new EmptyQueueException();
		}
		T temp = topNode.getData();
		topNode = topNode.getNextNode();
		bottomNode--;
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
		if(bottomNode == 0)
			empty = true;
		return empty;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		topNode = null;
		lastNode = null;
		
	}
	
	
	
}