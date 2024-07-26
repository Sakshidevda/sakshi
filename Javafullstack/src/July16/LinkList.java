package July16;
import java.util.*;


public class LinkList {

Node head ;
	
	static class Node {
		int data;
		Node next;
		
		Node (int da) {
			this.data = da;
			next = null;
			
		}
		
	}
	
	public static LinkList insert(LinkList list, int data) {
		
		Node new_Node = new Node(data);
		
		if(list.head == null) {
			list.head = new_Node;
		}else {
			
			Node last =  list.head;
			
			while(last.next != null) {
				last = last.next;
				}
			last.next = new_Node;
			
			}
		
		return list;
	}


    public static void printlist(LinkList list) {
	
	Node currentnode = list.head;
	
	System.out.println("linked list ");
  
	while(currentnode != null) {
		System.out.println(currentnode.data);
		
		currentnode = currentnode.next;
	}
}

     public static void main(String[] args) {
	
	   LinkList list = new LinkList ();
	
	  list.insert(list ,  12);
	  list.insert(list ,  13);
	  list.insert(list ,  19);
	  list.insert(list ,  18);
	  list.insert(list ,  20);
	
	printlist(list);
	
	//linkList <Integer> 11 = new linkList<> ();
	//a1.add("sakshi");
	
}
}

