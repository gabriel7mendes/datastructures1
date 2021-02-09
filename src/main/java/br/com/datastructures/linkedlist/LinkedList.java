package br.com.datastructures.linkedlist;

public class LinkedList<T> {
	
	private long steps;
	private int size;
	private Node<T> head;
	
	public Node<T> head() {
		steps++;
		return head;
	}
	
	public void insertBegin(T data) {
		Node<T> node = new Node<>(data);
		steps++;
		node.setNext(head);
		steps++;
		head = node;
		steps++;
		size++;
		steps++;
	}
	
	public void insertPosition(int position, T data) {	
		if(head == null || position == 0) {
			insertBegin(data);
			steps+=2;
			return;
		}
		
		Node<T> node = head;
		steps++;
		
		for(int i = 0; node != null && i < (position-1); i++) {
			node = node.getNext();
			steps++;
		}
			
		if(node == null) {
			steps++;
			return;
		}
			
		Node<T> next = node.getNext();
		steps++;
		
		Node<T> newNode = new Node<>(data);	
		steps++;
		newNode.setNext(next);
		steps++;
		
		node.setNext(newNode);
		steps++;
		
		size++;
		steps++;
	}
	
	public void insertEnd(T data) {
		Node<T> node = new Node<>(data);
		steps++;
		
		if(head == null) {
			head = new Node<>(data);
			steps+=2;
			return;
		}
		
		node.setNext(null);
		steps++;
		
		Node<T> last = head;
		steps++;
		while(last.getNext() != null) {
			last = last.getNext();
			steps++;
		}
			 
		last.setNext(node);
		steps++;
		
		size++;
		steps++;
		
		steps++;
		return;
	}
	
	public T get(int position) {
		if(head == null) {
			steps++;
			return null;
		}
			
		Node<T> node = head;
		steps++;
		
		if(position == 0) {
			steps++;
			return node.getKey();
		}
		
		node = node.getNext();
		steps++;
		for(int i = 0; node.getNext() != null && i < (position-1); i++) {
			node = node.getNext();
			steps++;
		}
		
		steps++;
		return node.getKey();
	}
	
	public void delete(T del) {
		Node<T> node = head;	
		steps++;
		
		Node<T> prev = null;
		steps++;
		
		if(head == del) {
			head = head.getNext();
			steps++;
		} else {
			while(node != null) {
				if(node.getKey().equals(del)) {
					prev.setNext(node.getNext());
					steps++;
				}
				
				prev = node;
				steps++;
				
				node = node.getNext();
				steps++;
			}
		}
	}
 	
	public void deleteAt(int position) {
		if(head == null) {
			steps++;
			return;
		}
		
		Node<T> node = head;
		steps++;
		
		if(position == 0) {
			head = node.getNext();
			size--;
			steps+=3;
			return;
		}
		
		for(int i = 0; node != null && i < (position-1); i++) {
			node = node.getNext();
			steps++;
		}
			
		if(node == null || node.getNext() == null) {
			steps++;
			return;
		}
		
		Node<T> del = node.getNext(); 
		steps += del.steps();
		steps++;
		node.setNext(del.getNext());
		steps++;

		size--;
		steps++;
	}
	
	public void printList() {
		Node<T> node = head;	
		steps++;
	
		System.out.print("[" + node.getKey());
		steps++;
		node = node.getNext();
		steps++;
		
		while(node != null) {
			System.out.print("," + node.getKey());
			steps++;
			node = node.getNext();
			steps++;
		}
		
		System.out.println("]");
		steps++;
	}
	
	public int size() {
		steps++;
		return size;
	}
	
	public long steps() {
		long totalSteps = steps;
		Node<T> node = head;
		
		while(node != null) {
			totalSteps += node.steps();
			node = node.getNext();
	    }
			
		return totalSteps;
	}
}
