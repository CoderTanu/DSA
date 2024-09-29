package LinkedListPractices;

public class Node {
	
	private int data;
	Node next;//the reference to the next Node in the linked list
	
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(int data) {
		this.data = data;
		this.next = null;
	}
	
	
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
	
	public Node(int data) {
		this.data = data;
	}
	
	
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
	
	

}
