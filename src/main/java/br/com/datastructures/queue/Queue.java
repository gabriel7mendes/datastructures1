package br.com.datastructures.queue;

public class Queue<T> {
	
	private long steps;
	private int size;
	private Node<T> front;
	private Node<T> rear;
	
	public boolean isEmpty() {
		steps++;
		
		if(size == 0) 
			return true;
		else 
			return false;
	}
	
	public T front() {
		steps++;
		return front.getKey();
	}
	
	public T rear() {
		steps++;
		return rear.getKey();
	}
	
	public int size() {
		steps++;
		return size;
	}
	
	public T enqueue(T element) {
		Node<T> node = new Node<>(element);
		steps++;
		node.setNext(rear);	
		steps++;
		
		if(rear != null) {
			rear.setPrev(node);
			steps++;
		}
			
		rear = node;
		steps++;
		
		if(front == null) {
			front = node;
			steps++;
		}
			
		size++;
		steps++;
		
		steps++;
		return node.getKey();
	}
	
	public T dequeue() {
		Node<T> element;
		steps++;
		
		if(isEmpty()) {
			steps++;
			return null;
		} 
		else {
			element = front;
			steps++;
			
			steps += element.steps();
			
			if(front == rear) {
				front = null;
				steps++;
				rear = null;
				steps++;
			} else {
				front = front.getPrev();
				steps++;
				front.setNext(null);
				steps++;
			}
	
			size--;
			steps++;
			
			steps++;
			return element.getKey();
		}
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Empty Queue");
			steps++;
		} else {
			System.out.println("Front: " + front.getKey());
			steps++;
			System.out.println("Rear: " + rear.getKey());
			steps++;
			System.out.println("Size: " + size);
			steps++;
			
			Node<T> node = rear;
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
		Node<T> node = rear;
		
		while(node != null) {
			totalSteps += node.steps();
			node = node.getNext();
	    }
			
		return totalSteps;
	}

}
