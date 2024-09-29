package Tree;

import java.util.ArrayList;
import java.util.Stack;


public class PreOrderTraversal {
	
	//InOrder traversal 
	public static void preOrderTraversal(ArrayList<Integer> nodeList ,Node root) {
		
		if(root == null) {
			return;
		}
		
		nodeList.add(root.data);
		preOrderTraversal(nodeList, root.left);
		preOrderTraversal(nodeList, root.right);
	  
  
	}
	
	

	public static void main(String[] args) {
		//creation of node data of tree
		Node root = new Node(1);
		root.left = new Node(2);
		root.right =new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		ArrayList<Integer> nodeList = new ArrayList<>();;
		preOrderTraversal(nodeList,root);
//		System.out.println(nodeList);
		nodeList.stream().forEach(x->System.out.print(x + " "));
	}

}
