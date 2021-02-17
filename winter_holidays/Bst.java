package winter_holidays;

public class Bst {

	public class Node
	{
		int data;
		Node left,right;
		public Node(int data,Node left,Node right) {
			// TODO Auto-generated constructor stub
			this.data=data;
			this.left=left;
			this.right=right;
		}
		
	}
	int size;
	Node root;
	public Bst() {
		// TODO Auto-generated constructor stub
	this.root=null;
	this.size=0;
	}
	public void add(int data)
	{
		if(this.root==null)
		{
			this.root=new Node(data,null,null);
			this.size++;
		}
		else
		this.add(this.root,data);
	}
	private void add(Node node,int data)
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
				node.right=new Node(data, null,null);
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
	private void display(Node node)
	{
		if(node.left!=null)
		{
			System.out.print(node.left.data+"->");
		}
		else
			System.out.print("End->");
		System.out.print(node.data);
		if(node.right!=null)
			System.out.print("<-"+node.right.data);
		else
			System.out.print("<-End");
		System.out.println();
		if(node.left!=null)
			this.display(node.left);
		if(node.right!=null)
			this.display(node.right);
	}
	public int min()
	{
		return this.min(this.root);
	}
	private int min(Node node)
	{
		int min=node.data;
		if(node.left!=null)
		{
			min=this.min(node.left);
		}
		
		return min;
	}
	public int max()
	{
		return this.max(this.root);
	}
	private int max(Node node)
	{
		int max=node.data;
		if(node.right!=null)
		{
			max=this.min(node.right);
		}
		
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bst bst=new Bst();
bst.add(10);
bst.add(8);
bst.add(11);
bst.add(7);
bst.add(9);
bst.display();
System.out.println(bst.min());
		System.out.println(bst.max());
	}

}
