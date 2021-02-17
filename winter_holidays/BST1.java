package winter_holidays;

public class BST1 {
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
	public BST1() {
	
		this.size=0;
		this.root=null;
		// TODO Auto-generated constructor stub
	}
	public void add(int data)
	{
		
		if(this.root==null)
		{
			this.root=new Node(data,null,null);
		}
		else
		{
			this.add(this.root,data);
		}
	}
	public void add(Node node,int data)
	{
		if(data<node.data)
		{
			if(node.left!=null)
			{
				this.add(node.left, data);
			}
			else
			{
				node.left=new Node(data,null,null);
			}
		}
		else if(data>node.data)
		{
			if(node.right!=null)
			{
				this.add(node.right,data);
			}
			else
			{
				node.right=new Node(data,null,null);
			}
		}
		else
		{
			
		}
	}
	public void display()
	{
		this.display(this.root);
	}
	public void display(Node node)
	{
		if(node.left!=null)
			System.out.print(node.left.data+"->");
		else
			System.out.print("end->");
		System.out.print(node.data);
		if(node.right!=null)
			System.out.print("<-"+node.right.data);
		else
			System.out.print("<-end");
		System.out.println();
		if(node.left!=null)
			this.display(node.left);
			if(node.right!=null)
				this.display(node.right);
	}
public int max()
{
	return this.max(this.root);
}
public int max(Node node)
{
	
	int max=node.data;
	if(node.right!=null)
	{
		max = this.max(node.right);
	}
	return max;
}
public int min()
{
	return this.min(this.root);
}
public int min(Node node)
{
	
	int min=node.data;
	if(node.left!=null)
	{
		min = this.max(node.left);
	}
	return min;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST1 bst=new BST1();
		bst.add(1);
		bst.add(2);
		bst.add(3);
		bst.add(4);
		bst.add(5);
		bst.add(6);
		bst.display();
		System.out.println(bst.max());
		System.out.println(bst.min());
		

	}

}
