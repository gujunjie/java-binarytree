package project07;

public class MyTree {
	
	
    private TreeNode root;
    
    public MyTree(TreeNode root)
    {
    	this.root=root;
    }
    
    
    public void frontShow()
    {
    	root.frontShow();
    }
    
    public void middleShow()
    {
    	root.middleShow();
    }
    public void beforeShow()
    {
    	root.beforeShow();
    }
    
    public TreeNode frontSearch(int i)
    {
    	return root.frontSearch(i);
    }
    
    public void delete(int i)
    {
    	if(root.getData()==i)
    	{
    		root=null;
    	}else{
    		root.delete(i);
    	}
    }
    
    
}
