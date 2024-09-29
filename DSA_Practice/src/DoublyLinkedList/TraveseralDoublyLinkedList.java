package DoublyLinkedList;

public class TraveseralDoublyLinkedList {
	

	public static void forwardTraversal(Node head) {
	
		System.out.println("head: "+head.data);
		
		Node current = head;
		
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
		
	}
	
	

	public  static void backwardTraversal(Node tail) {
      System.out.println("tail: "+tail.data);
		
		Node current = tail;
		
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.pre;
		}
		System.out.println();
	}
	
	
	//find length
	
	 public static int findLength(Node head) {
		 
		 Node current = head;
		 int count =0;
		 while(current != null) {
			 count++;
			 current = current.next;
		 }
		 System.out.println("count : " + count);
		 return count;
	 }
	
	
	

	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		head.next = second;
		second.pre = head;
		second.next = third;
		third.pre = second;
		
		System.out.println("Forward traversal -----");
		
		forwardTraversal(head);
		
		System.out.println("Backward traversal -----");
		backwardTraversal(third);
		
		System.out.println("find length -----");
		findLength(head);
	

	}


}
