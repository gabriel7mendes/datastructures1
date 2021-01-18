package br.com.datastructures.stack;

public class Stack<T> {
	
	private long steps;
	private int size;
	private Node<T> top;
	
	public boolean isEmpty() {
		steps++;
		
		if(top == null)
			return true;
		else
			return false;
	}
	
	public T top() {
		steps++;
		return top.getKey();
	}
	
	public int size() {
		steps++;
		return size;
	}
	
	public Node<T> push(T element) {
		Node<T> node = new Node<>(element);
		steps++;
		node.setNext(top);	
		steps++;
		top = node;
		steps++;
		size++;
		steps+=2;
		return node;
	}
	
	public T pop() {
		T element;
		steps++;
		
		if(isEmpty()) {
			steps++;
			return null;
		} 
		else {
			element = top();
			steps++;
		    top = top.getNext();
		    steps++;
			size--;
			steps+=2;
			return element;
		}
	}

	public void display() {
		if(isEmpty()) {
			System.out.println("Empty Stack");
			steps++;
		} else {
			System.out.println("Top: " + top.getKey());
			steps++;
			System.out.println("Size: " + size);
			steps++;
			
			Node<T> node = top;
			steps++;
			while(node != null) {
				System.out.print(node.getKey() + " ");
				steps++;
				node = node.getNext();
				steps++;
			}
			
			System.out.println();
			steps++;
		}
	}
	
	public long steps() {
		long totalSteps = steps;
		Node<T> node = top;
		
		while(node != null) {
			totalSteps += node.steps();
			node = node.getNext();
	    }
			
		return totalSteps;
	}


}
