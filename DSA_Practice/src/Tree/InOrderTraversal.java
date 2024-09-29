package Tree;

import java.util.ArrayList;
import java.util.Stack;

public class InOrderTraversal {
	
//	//InOrder traversal approch1
//	public static ArrayList<Integer> inOrderTraversal(Node root) {
//		
//		ArrayList<Integer> nodeList = new ArrayList<>();
//		Stack<Node> s=  new Stack<>();
//	
//  while(true) {
//	  if(root !=null) {
//		 s.push(root); 
//		 root=root.left;
//		  
//	  }else {
//		  if(s.isEmpty())
//		  break;
//		  root=s.peek();
//		  nodeList.add(root.data);
//		  s.pop();
//		  root=root.right;  
//	  }
//	  
//  }
//	    
//	    return nodeList;
//	}
//	
	
	
	//InOrder traversal approch2 recusive 
	public static void inOrderTraversal(ArrayList<Integer> nodeList, Node root) {
	
		if(root == null) {
			return;
		}
		inOrderTraversal(nodeList, root.left);
		nodeList.add(root.data);
		inOrderTraversal(nodeList, root.right);
		
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
		inOrderTraversal(nodeList,root);
//		System.out.println(nodeList);
		nodeList.stream().forEach(x->System.out.print(x + " "));
	}

}
