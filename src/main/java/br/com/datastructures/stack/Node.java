package br.com.datastructures.stack;

public class Node<T> {
	
	private long steps;
	private T key;
	private Node<T> next;

	public Node(T d) {
		key = d;
		steps++;
		next = null;
		steps++;
	}
	
	public T getKey() {
		steps++;
		return key;
	}
	
	public void setKey(T key) {
		this.key = key;
		steps++;
	}
	
	public Node<T> getNext() {
		steps++;
		return next;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
		steps++;
	}

	@Override
	public String toString() {
		steps++;
		return "" + key;
	}
	
	public long steps() {
		return steps;
	}

}
