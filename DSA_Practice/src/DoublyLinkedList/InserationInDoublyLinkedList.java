package DoublyLinkedList;

public class InserationInDoublyLinkedList {
	
	
	public static Node inserationAtEnd(Node head , int value) {
		
		
		//craete a node with the given value
		Node newNode = new Node(value);
		
		//if the head is empty of linkedList then make newNode as head of the linkedList
		if(head == null) {
			head = newNode;
		}else {
			//start from head of the list
			
			Node current = head;
			
			//travser upto end
			while( current.next != null) {
				current = current.next;
			}
			
			current.next = newNode;
			
			newNode.pre = current;
		}		
		return head;
	}
	
	
   public static Node inserationASpecifiPosition(Node head , int value) {
		
		
		//craete a node with the given value
		Node newNode = new Node(value);
		
		//if the head is empty of linkedList then make newNode as head of the linkedList
		if(head == null) {
			head = newNode;
		}else {
			//start from head of the list
			
			Node current = head;
			
			//travser upto end
			while( current.next != null) {
				current = current.next;
			}
			
			current.next = newNode;
			
			newNode.pre = current;
		}		
		return head;
	}

	
	
	
	
	
	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		head.next = second;
		second.pre = head;
		second.next = third;
		third.pre = second;
		
		System.out.println("Inseration in end -----");
		
		head = inserationAtEnd(head, 4);
		
		Node current  = head;
		while( current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		
		
		head = inserationASpecifiPosition(3, 5);
	
		Node current1  = head;
		while( current1 != null) {
			System.out.print(current1.data + " ");
			current1 = current1.next;
		}
		
	}
}
