package winter_holidays;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class binarytree1 {
	public class Node
	{
		int data;
		Node left,right;
		public Node(int data,Node left,Node right) {
			this.data=data;
			this.left=left;
			this.right=right;
		}
	}
int size;
Node root;
public binarytree1() {
Scanner s=new Scanner(System.in);
this.root=takeinput(s,null, false);

}
public Node takeinput(Scanner s,Node parent,boolean isleft)
{
	if(parent==null)
	{
		System.out.println("enter value of parent");
	}
	else
	{
		if(isleft)
			System.out.println("enter value of left");
		else
			System.out.println("enter value of right");
	}
	
	int nodedata=s.nextInt();
	Node node=new Node(nodedata,null,null);
	this.size++;
	System.out.println("any left child"+node.data);
	boolean choice=s.nextBoolean();
	if(choice)
	{
		node.left=takeinput(s, node.left,true);
	}
	System.out.println("any right child of"+node.data);
	choice=s.nextBoolean();
	if(choice)
	{
		node.right=takeinput(s,node.right,false);
	}
return node;}
public void display()
{
	this.display(this.root);
}
public void display(Node node)
{
	if(node==null)
		return;
	if(node.left!=null)
{
	System.out.print(node.left.data+"->");
}else
{
	System.out.print("end->");
}
System.out.print(node.data);
if(node.right!=null)
{
	System.out.print("<-"+node.right.data);
}
else
{
	System.out.print("<-End");
}
System.out.println();
if(node.left!=null)
	this.display(node.left);
if(node.right!=null)
	this.display(node.right);
}
public int size()
{
	return this.size;

}
public void preorder()
{
	this.preorder(this.root);
}
public void preorder(Node node)
{
	if(node==null)
		return;
	System.out.print(node.data+"->");
	this.preorder(node.left);
	this.preorder(node.right);
}
public void inorder()
{
	this.inorder(this.root);
}
public void inorder(Node node)
{
	if(node==null)
		return;
	
	
	this.inorder(node.left);
	System.out.print(node.data+"->");
	this.inorder(node.right);
}
public void postorder()
{
	this.postorder(this.root);
}
public void postorder(Node node)
{
	if(node==null)
		return;
	
	this.postorder(node.left);

	this.postorder(node.right);
	System.out.print(node.data+"->");
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
	int l=min(node.left);
	int r=min(node.right);
	if(res>l)
		res=l;
	if(res>r)
		res=r;
	

return res;
}
public int max()
{
	return this.max(this.root);
}
public int max(Node node)
{
	if(node==null)
		return Integer.MIN_VALUE;
	int res=node.data;
	int l=max(node.left);
	int r=max(node.right);
	if(res<l)
		res=l;
	if(res<r)
		res=r;
	

return res;
}
public int height()
{
	return this.height(this.root);
}
public int height(Node node)
{
	if(node==null)
	{
		return -1;
	}
	int l=height(node.left);
	int r=height(node.right);
	return Math.max(l, r)+1;
	
}
public void levelorder()
{
	this.levelorder(this.root);
}
public void levelorder(Node node)
{
	LinkedList<Node> q=new LinkedList<>();
	q.add(this.root);
	while(!q.isEmpty())
	{
		Node rv=q.remove();
		System.out.print(rv.data+"->");
		if(rv.left!=null)
		{
			q.add(rv.left);
		}
			if(rv.right!=null)
			{
				q.add(rv.right);
			}
	}
}
public void mirror() {

	this.mirror(this.root);
}

private void mirror(Node node) {
	if (node == null) {
		return;
	}
	Node temp = node.left;
	node.left = node.right;
	node.right = temp;
	this.mirror(node.left);
	this.mirror(node.right);
}
public boolean find(int data) {
	return this.find(this.root, data);
}

private boolean find(Node node, int data) {
	if (node == null) {
		return false;
	}
	if (node.data == data) {
		return true;
	} else if (this.find(node.left, data)) {
		return true;
	} else if (this.find(node.right, data)) {
		return true;
	} else {
		return false;
	}
}

public int lca(int a,int b)
{  
Node ans= lca(this.root,a,b);
return ans.data;
}
public Node lca(Node node,int a,int b)
{
	if(node == null)
		return null;

	if(node.data == a || node.data == b )
		return node;
	
Node left=lca(node.left,a,b);
Node right=lca(node.right,a,b);

if(left!=null&&right!=null)
{
  return node;
}
if(left==null)
{
  return right;
}
else
return left;
 }
int sum=0;
Stack<Integer> stk=new Stack<>();
Stack<Integer>st=new Stack<>();

public void prl(int k)
{
     prl(this.root,k);
     while(!st.isEmpty())
     {
    	 System.out.print(st.pop()+" ");
     }
}

public void prl(Node node,int k) {
       if(node==null)
       {
           return;
       }
       sum=sum+node.data;
       stk.push(node.data);
       if(sum==k)
       {
           while(!stk.isEmpty())
           {
               st.add(stk.pop());
           }
       }
      prl(node.left,k);
      prl(node.right,k);

      sum=sum-node.data;
      if(!stk.isEmpty())
    	  stk.pop();
    }
public void removeLeaves()
{
	  this.removeLeaves(this.root);
}
		public Node removeLeaves(Node child) {
			if (child == null) { 
            return null; 
        } 
			 if(child.left==null&&child.right==null)
			 {
				 return null;
			 }
			child.left= removeLeaves(child.left);
			child.right= removeLeaves(child.right);
			
			return child;
		}
public void leftview()
{
	this.leftview(this.root);
}
public void leftview(Node node)
{
	
	 if (root == null) 
	      return; 
	  
	    Queue<Node> q = new LinkedList<>(); 
	    int store=0;
	    // Pushing root node into the queue. 
	    q.add(node); 
	  
	    // Pushing delimiter into the queue. 
	    q.add(null); 
	  
	    // Executing loop till queue becomes 
	    // empty 
	    while (!q.isEmpty()) { 
	  
	      Node curr = q.poll(); 
	  
	      // condition to check the 
	      // occurence of next level 
	      if (curr == null) { 
	        if (!q.isEmpty()) { 
	          q.add(null);  
	        } 
	      System.out.println(store);
	      } else { 
	        // Pushing left child current node 
	    	  store=curr.data;
	        if (curr.left != null) 
	          q.add(curr.left); 
	  
	        // Pushing right child current node 
	        if (curr.right != null) 
	          q.add(curr.right); 
	      } 
	    } 
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
binarytree1 bt=new binarytree1();
//bt.display();
//System.out.println(bt.size());
//bt.preorder();
//System.out.println();
//bt.postorder();
//System.out.println();
//bt.inorder();
//	System.out.println(bt.min());
//	System.out.println(bt.max());
//	System.out.println(bt.height());
//	System.out.println();
//   bt.levelorder();
//System.out.println(bt.lca(2, 3));
	bt.leftview();
	//bt.display();
	}

}
//  1 true 2 true 4 false false true 5 false false true 3 false false
