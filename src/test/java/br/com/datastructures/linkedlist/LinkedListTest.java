package br.com.datastructures.linkedlist;

import org.junit.Test;

public class LinkedListTest {
	
	@Test
	public void test1() {
		LinkedList<String> lista = new LinkedList<>();
		
		lista.insertPosition(0, "Gabriel");
		lista.insertPosition(1, "Sara");
		lista.insertPosition(2, "Paulo");
		lista.insertPosition(3, "Marcelo");
		lista.insertPosition(3, "Leonardo");
		
		lista.printList();
		
		lista.deleteAt(1); 
		lista.printList();
		//lista.insertPosition(1, 7);
		
		lista.deleteAt(0); 
		lista.printList();
		
		lista.deleteAt(2); 
		lista.printList();
		
		lista.insertEnd("Teste");
		lista.printList();
			
		lista.delete("Leonardo");
		lista.printList();
	}

}
