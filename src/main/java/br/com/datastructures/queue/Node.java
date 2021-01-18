package br.com.datastructures.queue;

public class Node<T> {

	private long steps;
	private T key;
	private Node<T> next;
	private Node<T> prev;

	public Node(T item) {
		this.key = item;
		steps++;
	}

	public T getKey() {
		steps++;
		return key;
	}

	public Node<T> getNext() {
		steps++;
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
		steps++;
	}

	public Node<T> getPrev() {
		steps++;
		return prev;
	}

	public void setPrev(Node<T> prev) {
		this.prev = prev;
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
