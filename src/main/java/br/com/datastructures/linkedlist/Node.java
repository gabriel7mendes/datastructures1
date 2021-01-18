package br.com.datastructures.linkedlist;

public class Node<T> {
	
	private long steps;
	private T key;
	private Node<T> next;

	public Node(T key) {
		this.key = key;
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

	@Override
	public String toString() {
		steps++;
		return "" + key;
	}
	
	public long steps() {
		return steps;
	}
}
