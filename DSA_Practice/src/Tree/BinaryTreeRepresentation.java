package Tree;

public class BinaryTreeRepresentation {

	public static void main(String[] args) {
		Node n1 = new Node(1);
		n1.left = new Node(2);
		n1.right =new Node(3);
		
		System.out.println(n1.data);
		System.out.println(n1.left.data);	
		System.out.println(n1.right.data);

	}
	
	

}
