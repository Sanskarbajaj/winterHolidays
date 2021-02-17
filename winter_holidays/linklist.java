package winter_holidays;

import java.util.Stack;

public class linklist {
	public class Node
	{
		int data;
		Node next;
		
		public Node(int data,Node next) {
			this.data=data;
			this.next=next;
		}
	}
	 Node head;
	Node tail;
	int size;
	public linklist() {
	this.head=null;
	this.tail=null;
	size=0;
	}
	public boolean isEmpty()
	{
		return this.size==0;
	}
	public int size()
	{
		return this.size;
	}
	public void addFirst(int data)
	{
		Node node=new Node(data,this.head);
		this.head=node;
		if(this.isEmpty())
		{
			this.tail=node;
		}
		this.size++;
	}
	public void addLast(int data)
	{
		Node node=new Node(data,null);
	    if(isEmpty())
	    {
	    	this.tail=node;
	    	this.head=node;
	    }
	    this.tail.next=node;
	    this.tail=node;
	    this.size++;
	}
	public Node getNodeAt(int index)throws Exception
	{
		if(index<0||index>this.size())
		{
			throw new Exception("Invalid Index");
		}
		int count=0;
		Node temp=this.head;
		while(count<index)
		{
			count++;
			temp=temp.next;
		}
		return temp;
	}
	public void addAt(int data,int index) throws Exception
	{
		if (index < 0 || index > this.size) {
			throw new Exception("Invalid Index");
		}

		if(isEmpty())
			addFirst(data);
		else if(index==this.size())
			addLast(data);
		
		Node nm1=getNodeAt(index-1);
		Node node=new Node(data,nm1.next);
		nm1.next=node;
		this.size++;
		}
	public int getFirst()
	{
		return this.head.data;
	}
	public int getLast()
	{
		return this.tail.data;
	}
	public int getAt(int index) throws Exception
	{
		if (index < 0 || index > this.size) {
		throw new Exception("Invalid Index");
	}
		return getNodeAt(index).data;
		
	}
	public int removeFirst()throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Empty");
		}
		int rv=this.head.data;
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.next;
		}
		this.size--;
		return rv;
	}
	public int removeLast()throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Empty");
		}int rv=this.tail.data;
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			Node nm1=getNodeAt(this.size-2);
			this.tail=nm1;
			tail.next=null;
			}
		this.size--;
		return rv;
	}
	public int removeAt(int index)throws Exception
	{
		if (index < 0 || index > this.size) {
			throw new Exception("Invalid Index");
		}
		if(index==this.size)
			removeLast();
		else if(index==0)
			removeFirst();
		
		int rv=getNodeAt(index).data;
		Node nm1=getNodeAt(index-1);
		nm1.next=nm1.next.next;
		this.size--;
		return rv;
	}
	public void display()
	{
		Node temp;
		temp=this.head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println();
	}
	public int mid() {
		return this.getMidNode().data;
	}

	private Node getMidNode() {
		Node fast = this.head;
		Node slow = this.head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public int kthNodeFromEnd(int k) throws Exception {
		if (k <= 0 || k > this.size) {
			throw new Exception("Invalid K");
		}
		Node fast = this.head;
		Node slow = this.head;
		for (int i = 0; i < k; i++) {
			fast = fast.next;
		}

		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}

		return slow.data;
	}
	public void reverse()
	{
		this.reverse(this.head);
	}
	private void reverse(Node node)
	{
		Node curr,nxt,prev;
		prev=null; nxt=null; curr=node;
		while(curr!=null)
		{
			nxt=curr.next;
			curr.next=prev;
			prev=curr;
			curr=nxt;
		}
		this.head=prev;
	}
	public void reverse2() throws Exception
	{
		this.reverse2(this.head);
	}
	private void reverse2(Node node) throws Exception
	{
		int beg,end;
		beg=0;
		end=this.size-1;
		while(beg<=end)
		{
			Node left = this.getNodeAt(beg);
			Node right = this.getNodeAt(end);
			int temp = left.data;
			left.data = right.data;
			right.data = temp;
			beg++;
			end--;
		}
	}
//	public void Kreverse(int k)
//	{
//		Node ans=this.Kreverse(k,this.head);
//	}
	Node Kreverse(Node head, int k) 
    { 
       Node current = head; 
       Node next = null; 
       Node prev = null; 
         
       int count = 0; 
  
       /* Reverse first k nodes of linked list */
       while (count < k && current != null)  
       { 
           next = current.next; 
           current.next = prev; 
           prev = current; 
           current = next; 
           count++; 
       } 
  
       /* next is now a pointer to (k+1)th node  
          Recursively call for the list starting from current. 
          And make rest of the list as next of first node */
       if (next != null)  
          head.next = Kreverse(next, k); 
  
       // prev is now head of input list 
       return prev; 
    }             
	void merge_sorted_linklist(Node p,Node q,Node s)
	{
		Node new_head=null;
		if(p.data<=q.data)
		{
			s=p;
			p=s.next;
		}
		else
		{
			s=q;
			q=s.next;
		}
		new_head=s;
		while(p!=null||q!=null)
		{ if(p.data<=q.data)
			{s.next=p;
				s=p;
				p=s.next;}
			else
			{  s.next=q;
				s=q;
				q=s.next;}}
		if(p==null)
		{s.next=q;	}
		else if(q==null)
		{s.next=p;}
		display();}
	
	private void AppendLast(int n) throws Exception
	{
		int count=0;
		 while(count<n)
		 {
			 Node nm1=getNodeAt(this.size-2);
			 nm1.next.next=head;
			 head=nm1.next;
			 this.tail=nm1;
			 nm1.next=null;
			 count++;
		 }
	}
	public void oddEven()
    {
        linklist odd=new linklist();
        linklist even=new linklist();
        linklist fl=new linklist();
        Node temp=this.head;

        while(temp!=null)
        {
            if(temp.data%2==0)
            {
                even.addLast(temp.data);
            }
            else
            {
                odd.addLast(temp.data);
                fl.addLast(temp.data);

            }
            temp=temp.next;

        }
        temp=even.head;
        while(temp!=null)
        {
            fl.addLast(temp.data);

            temp=temp.next;
        }
    this.head=fl.head;
    this.tail=fl.tail;
    this.tail.next=null;
    this.size=fl.size;
    }
	public boolean isPalindrome()
	{
		return this.isPalindrome(this.head);
	}
public boolean isPalindrome(Node node)
{
	Node temp=node;
	Node trav=node;
	boolean flag=false;
	Stack<Integer> stk=new Stack<Integer>();
	while(temp!=null)
	{stk.push(temp.data);
	temp=temp.next;}
	while(trav!=null)
	{
		if(stk.pop()==trav.data)
		{
			flag= true;
		}
		else
		{
			return false;
		}
		trav=trav.next;
		
	}
	return flag;	
}
public void llfold() throws Exception
{
	this.llfold(this.head);
}
public void llfold(Node node) throws Exception
{
	int beg=0,end=this.size-1;
	
	if(this.size%2!=0)
	{int count=1;
	while(beg<=end)
	{ 
		Node left = this.getNodeAt(beg);
		Node right = this.getNodeAt(end);
		System.out.print(left.data+" ");
		count++;
		if(count<this.size)
		System.out.print(right.data+" ");
		beg++;
		end--;
	
	}
	}
	else
	{while(beg<=end)
	{ 
		Node left = this.getNodeAt(beg);
		Node right = this.getNodeAt(end);
		System.out.print(left.data+" ");
		System.out.print(right.data+" ");
		beg++;
		end--;
	
	}
		
	}
}
 public  int binarysrchll(int item)
 {
	 return this.binarysrchll(this.head,item);
 }
 private int binarysrchll(Node node,int item)
 {
	 int start=0,end=this.size,mid=0;
	 while(start<=end)
	 {
		 mid=this.mid();
		 if(mid==item)
		 {
			 return mid;
		 }
		 else if(item>mid)
	 }
	 
 }

	public static void main(String[] args) throws Exception {
		linklist ll=new linklist();
		linklist lll=new linklist();
		linklist l=new linklist();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
	ll.addLast(4);
		ll.addLast(5);
   //    ll.addLast(6);
		ll.display();
		ll.llfold();
	//System.out.println(ll.isPalindrome());
  //  ll.merge_sorted_linklist(ll.head,lll.head,null);
		//ll.display();
		//ll.AppendLast(2);
		//head=ll.partition(head);
		//ll.display();
	}

}
