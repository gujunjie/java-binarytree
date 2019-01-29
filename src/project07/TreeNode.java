package project07;

public class TreeNode {
	
    private int data;//节点数据
    
    private TreeNode leftNode;//左子树
    
    private TreeNode rightNode;//右子树
    
    public TreeNode(int data)
    {
    	this.data=data;
    }
    
    public int getData() {
		return data;
	}
    
    public TreeNode(int data,TreeNode leftNode,TreeNode rightNode)
    {
    	this.data=data;
    	this.leftNode=leftNode;
    	this.rightNode=rightNode;
    }
    
    public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}
    
    public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}
    
    public void frontShow()
    {
    	//前序遍历
    	System.out.print(data+" ");
    	if(leftNode!=null)
    	{
    		leftNode.frontShow();
    	}
    	if(rightNode!=null)
    	{
    		rightNode.frontShow();
    	}
    }
    
    public void middleShow()
    {   
    	//中序遍历
    	if(leftNode!=null)
    	{
    	    leftNode.middleShow();
    	}
    	System.out.print(data+" ");
    	if(rightNode!=null)
    	{
    		rightNode.middleShow();
    	}
        
    }

	public void beforeShow() {
		//后序遍历
		if(leftNode!=null)
    	{
    	    leftNode.beforeShow();
    	}
		if(rightNode!=null)
    	{
    		rightNode.beforeShow();
    	}
		System.out.print(data+" ");
	}

	public TreeNode frontSearch(int i) {
		//前序遍历查找
		TreeNode target=null;
    	if(data==i)
    	{
    		return this;
    	}
    	if(leftNode!=null)
    	{
    		target=leftNode.frontSearch(i);
    	}
    	if(target!=null)
    	{
    		return target;
    	}
    	if(rightNode!=null)
    	{
    		target=rightNode.frontSearch(i);
    	}
    	return target;
		
	}

	public void delete(int i) {
		TreeNode parent=this;
		
		if(parent.leftNode!=null&&parent.leftNode.getData()==i)
		{
			parent.leftNode=null;
			return;
		}
		if(parent.rightNode!=null&&parent.rightNode.getData()==i)
		{
			parent.rightNode=null;
			return;
		}
		parent=parent.leftNode;
		if(parent!=null)
		{
			parent.delete(i);
		}
		parent=parent.rightNode;
		if(parent!=null)
		{
			parent.delete(i);
		}
		
	}
}
