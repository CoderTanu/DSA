/**
 * 
 */
package LinkedListPractices;

/**
 * coderTanu
 */
public class MainContent {

	
	public static class Node {
		
		private int data;
		private Node next;//the reference to the next Node in the linked list'
		
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
		
		public Node(int data1) {
			this.data = data1;
			this.next = null;
		}
		
	}

	public static void main(String[] args) {	
		int arr[]= {12,34,12,76,4,22,4};
		Node head=convertArraytoLL(arr);	
		Node temp =head;
		while(temp !=null) {

			System.out.println(temp.data + " ");
			temp=temp.next;
		}
		
		
		int v= lengthLL(head);
		System.out.println("length of linkedlist " + v);
		
		
		int vData =checkIfPresent(head, 76);
		System.out.println(vData);
		
		
		head =deleteHead(head);
		System.out.println(head.data);
	
	}
	
	
	public static Node convertArraytoLL(int arr[]){
		Node head =new Node(arr[0]);
		Node mover =head;
		System.out.println(head);
		for(int i=0; i<arr.length; i++) {
			
			Node temp =new Node(arr[i]);
			mover.next =temp;
			mover=temp;
		}
		
		
		return head;
		
	}
	
	static int lengthLL(Node head) {
		
		int count=0;
		Node temp =head;
		while(temp !=null) {
			temp =temp.next;
			count++;
		}
		return count;
		
	}
	
	static int checkIfPresent(Node head, int element) {
		
		
		Node temp =head;
		while(temp !=null) {
			
			if(temp.data == element) {
				return 1;
			}
			temp =temp.next;
		
		}
		return -1;
	
	}
	
	
	public static Node deleteHead(Node head) {
		System.out.println(head.data);
		if(head ==null) return head;
		head=head.next;
		return head;
		
	}
	
	
	
	//ADD  INSIDE THE LIST 
	

}
