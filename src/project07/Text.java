package project07;

public class Text {

	public static void main(String[] args) {
		
		
		TreeNode root=new TreeNode(1);
	
		TreeNode leftNode=new TreeNode(2);
		
		TreeNode rightNode=new TreeNode(3);
		
		root.setLeftNode(leftNode);
		root.setRightNode(rightNode);
		
		MyTree tree=new MyTree(root);
		
		leftNode.setLeftNode(new TreeNode(4));
		leftNode.setRightNode(new TreeNode(5));
		
		rightNode.setLeftNode(new TreeNode(6));
		rightNode.setRightNode(new TreeNode(7));
		
		tree.frontShow();
		
        System.out.println();
        
		tree.middleShow();
		
		System.out.println();
		
		tree.beforeShow();
		
		System.out.println(tree.frontSearch(5));
		
		tree.delete(3);
		tree.frontShow();
	}

}
