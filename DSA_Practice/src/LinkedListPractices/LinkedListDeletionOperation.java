package LinkedListPractices;

import java.util.LinkedList;

public class LinkedListDeletionOperation {

	public static void main(String[] args) {
//		LinkedList list = new LinkedList();
//		
//		list.add(1);
//		list.add(11);
//		list.add(1);
//		list.add(12);
//		list.add(12);
//		list.add(13);
		
		int a[]= {1,11,11,12,12,13};
		Node head = convertArrayIntoLL(a);
//		Node head = new Node(1);
//		
//		head.setNext(3);
		
		System.out.println(head);
		
		deleteLL(head);
		

	}

	public static Node convertArrayIntoLL(int[] a) {
		33
		return null;
	}

	public static Node deleteLL(Node head) {
		if(head ==  null) return head;
		Node current = head;
		head = head.next;
		
		return head;
		
	}

}
