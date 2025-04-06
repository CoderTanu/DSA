package April_POTD;

class Pair {
	TreeNode node;
	int depth;
	
	public Pair(TreeNode node, int depth) {
		this.node = node;
		this.depth = depth;
	}
	
}

/**
 * 1123. Lowest Common Ancestor of Deepest Leaves
 */
public class Day4_LCADeeepestLeaves_BT_M {
	
	
	
	public static Pair lca(TreeNode root) {
		if(root == null) {
			return new Pair(null,0);
		}
		
		Pair left = lca(root.left);
		Pair right= lca(root.right);
		
		if(left.depth == right.depth) {
			return new Pair(root, 1+ left.depth);
		}else if(left.depth>right.depth) {
			return new Pair(left.node, 1+left.depth);
		}else {
			return new Pair(right.node, 1+right.depth);
		}
	}
	
	  public static TreeNode lcaDeepestLeaves(TreeNode root) {
	         Pair ans =  lca(root);
	         System.out.println(ans.node);
	         return ans.node;
	    }

	public static void main(String[] args) {
		TreeNode tnode1 = new TreeNode(3);
		tnode1.left = new TreeNode(5);
		tnode1.right = new TreeNode(1);
		tnode1.left.left= new TreeNode(6);
		tnode1.left.right= new TreeNode(2);
		tnode1.left.right.left= new TreeNode(7);
		tnode1.left.right.right= new TreeNode(4);
		tnode1.right.left = new TreeNode(0);
		tnode1.right.right= new TreeNode(8);
		
		lcaDeepestLeaves(tnode1);
		
	}

}