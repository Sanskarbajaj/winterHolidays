package winter_holidays;

public class Queue_implementation {
	public int []data;
	 public int size;
	public  int front;
	public static final int defcap=100;
	public Queue_implementation() {
		// TODO Auto-generated constructor stub
	this(defcap);
	}
	Queue_implementation(int capacity)
	{
	 data=new int[capacity];
	 this.size=0;
	 this.front=0;
	}
	public  int size()
	{
		return this.size;
	}
	public  boolean isEmpty()
	{
		return this.size()==0;
	}
	public int front()
	{
		return this.data[this.front];
	}
	public void enqueue(int element) throws Exception
	{
		if(this.size()==data.length)
		{
			throw new Exception("Queue overflow");
			
		}
		int ai=(this.front+this.size)%this.data.length;
		data[ai]=element;
		size++;
		}
	public int dequeue() throws Exception
	{
		if(this.size()==0)
		{
			throw new Exception("Queue underrflow");
		}
		int rv=data[front];
		data[front]=0;
		this.front=(front+1)%data.length;
		this.size--;
		return rv;
	}
	public void display()
	{
		for(int i=0;i<data.length;i++)
		{
			int ai=(front+i)%data.length;
			System.out.print(data[ai]+"->");
		}
		System.out.println("End");
	}
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue_implementation q=new Queue_implementation();

		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.display();
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		System.out.println(q.front());
		//System.out.println(front);
		

	}

}
