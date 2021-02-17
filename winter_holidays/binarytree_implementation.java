package winter_holidays;

import java.util.LinkedList;
import java.util.Scanner;

public class binarytree_implementation {
	public class Node
	{
		int data;
		Node left;
		Node right;
		public Node(int data,Node left,Node right) {
		  this.data=data;
		  this.left=left;
		  this.right=right;
		}
	}
	Node root;
	int size;
	public binarytree_implementation() {
		Scanner s=new Scanner(System.in);
		this.root=takeinput(s,null,false);
	}
	
	public Node takeinput(Scanner s,Node parent,boolean isleft)
	{
		if(parent==null)
		{
			System.out.println("Enter value of root node");
		}
		else
		{
			if(isleft)
				System.out.println("Enter value of left node of"+parent.data);
			else
				System.out.println("Enter value of right node of"+parent.data);
		}
		
		int nodedata=s.nextInt();
		Node node =new Node(nodedata,null, null);
		this.size++;
		
		System.out.println("any left child"+node.data);
		boolean choice=s.nextBoolean();
		if(choice)
		{
		node.left=takeinput(s,node, true);
		}
		System.out.println("any right child"+node.data);
		boolean choic=s.nextBoolean();
		if(choic)
		{
		node.right=takeinput(s,node, false);
		}
		
		return node;		
	}
	public void display()
	{
		this.display(this.root);
	}
	private void display(Node node)
	{
		
		if(node.left!=null)
		{
			System.out.print(node.left.data+"->");
		}
		else
		{
			System.out.print("End->");
		}
		System.out.print(node.data);
		if(node.right!=null)
		{
			System.out.print("<-"+node.right.data);
		}
		{
			System.out.print("<-End");
		}
		System.out.println();
		if (node.left != null) {
			this.display(node.left);
		}
		if (node.right != null) {
			this.display(node.right);
		}
		
	}
	public int findMax()
	{
		return this.findMax(this.root);
	}
	public int findMax(Node node) 
    { 
        if (node == null) 
            return Integer.MIN_VALUE; 
  
        int res = node.data; 
        int lres = findMax(node.left); 
        int rres = findMax(node.right); 
  
        if (lres > res) 
            res = lres; 
        if (rres > res) 
            res = rres; 
        return res; 
    } 
	public int size()
	{
		return this.size;
	}
	public void postorder()
	{ System.out.println();
	     postorder(root);
	}
	public void postorder(Node node)
	{
		if(node==null)
		{
			return;
		}
		postorder(node.left);
		
		postorder(node.right);
		System.out.print(node.data+"->");
		
	}
	
	public void inorder()
	{ System.out.println();
	     inorder(root);
	}
	public void inorder(Node node)
	{
		if(node==null)
		{
			return;
		}
		inorder(node.left);
		System.out.print(node.data+"->");
		inorder(node.right);
		
	}	
	public void preorder()
	{ System.out.println();
	     preorder(root);
	}
	public void preorder(Node node)
	{
		if(node==null)
		{
			return;
		}
		System.out.print(node.data+"->");
		preorder(node.left);
		preorder(node.right);
	}	
	public int min()
	{
		return this.min(this.root);
	}
	public int min(Node node)
	{
		if(node==null)
			return Integer.MAX_VALUE;
		
		int res=node.data;
		int lres=min(node.left);
		int rres=min(node.right);
		if(res>lres)
			res=lres;
		if(res>rres)
			res=rres;
		
		return res;
	}
	public int height()
	{
		return this.height(this.root);
	}
	private int height(Node node)
	{
		if(node==null)
		{
			return 0;
		}
		int l=height(node.left);
		int r=height(node.right);
		return Math.max(l,r)+1;
	}
	public int sumofnode()
	{
		
		return this.sumofnode(this.root);
	}
	private int sumofnode(Node node)
	{   if(node==null)
		return 0;
	
	 	int l=this.sumofnode(node.left);
		int r=this.sumofnode(node.right);
		
	return node.data+l+r;
	}
	public boolean isbalanced()
	{
		return this.isbalanced(this.root);
	}
	private boolean isbalanced(Node node)
	{
		if (node == null) 
            return true; 
		
		int l=height(node.left);
		int r=height(node.right);
		if(l==r&&isbalanced(node.left)&&isbalanced(node.right))
			return true;
		
		return false;
	}
	public void levelorder() throws Exception
	{
		this.levelorder(this.root);
	}
	private void levelorder(Node node) throws Exception 
	{
		LinkedList<Node> queue = new LinkedList<>();
		queue.add(this.root);
		queue.add(null);
		while (!queue.isEmpty()) {
			Node rv = queue.remove();
			
			if(rv==null)
			{ 
				if(!queue.isEmpty())
				queue.add(null);
				System.out.println();
			}
			else {
			if (rv.left != null) {
				queue.add(rv.left);
			}
			if (rv.right != null) {
				queue.add(rv.right);
			}
			System.out.print(rv.data + " ");
			
		}
		}
			
			}
	// 1 true 2 true 3 false false true 4 false false true 5 true 6 false false true 7 false false

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
 binarytree_implementation bt=new binarytree_implementation();
 bt.display();
// System.out.println(bt.size);
// System.out.println(bt.findMax());
// bt.preorder();
// System.out.println();
// bt.inorder();
// System.out.println();
// bt.postorder();
// System.out.println(bt.min());
// System.out.println(bt.sumofnode());
// System.out.println(bt.height());
// System.out.println(bt.isbalanced());
	bt.levelorder();
	
	}

}
