package stack.project;

import java.util.EmptyStackException;

public final class StackLinkedData<T> implements StackInterface<T> {
	
	private Node topNode;
	
	private class Node{
		private T data;
		private Node next;
		
		/**
		 * @return the data
		 */
		public T getData() {
			return data;
		}

		/**
		 * @return the next
		 */
		public Node getNext() {
			return next;
		}

		/**
		 * @param data the data to set
		 */
		public void setData(T data) {
			this.data = data;
		}

		/**
		 * @param next the next to set
		 */
		public void setNext(Node next) {
			this.next = next;
		}

		public Node(T newEntry, Node node){
			this.getData();
			this.getNext();
		}
		
		
		
		
	}
	
	
	public StackLinkedData() {
		topNode = null;
	}
	
	public StackLinkedData(T newEntry) {
		newEntry = topNode.getData();
		topNode = topNode.getNext();
		
	}

	@Override
	public void push(T newEntry) {
		// TODO Auto-generated method stub
		Node nextNode = new Node(newEntry, topNode);
		nextNode = topNode;
		
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		else {	
		topNode = topNode.getNext();
		T temp = topNode.getData();
		return temp;
		}
		
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		else
		return topNode.getData();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		boolean empty = false;
		if(topNode == null)
			empty = true;
		return empty;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		topNode = null;
		
	}

}
