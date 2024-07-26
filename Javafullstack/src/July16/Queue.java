package July16;

import java.util.PriorityQueue;

public class Queue {
	
	public static void main(String[] args) {
		
	

	PriorityQueue<String> queue = new PriorityQueue<String>();
	
	queue.add("sakshi");
	queue.add("Khushi");
	queue.add("Simran");
	queue.add("Harshita");
	
	
	//System.out.println("head:" +queue.element());
	//System.out.println("head:" +queue.peek());
		
	//queue.remove();
	System.out.println("head:" +queue.peek());
	System.out.println("head:" +queue.peek());
	
	}	

}
