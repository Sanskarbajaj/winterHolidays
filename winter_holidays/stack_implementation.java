package winter_holidays;

public class stack_implementation {
	static int data[];
	static int top;
	private static final int defcap=10;
	public stack_implementation() {
		this(defcap);
	}
	public stack_implementation(int capacity)
	{
		data=new int[capacity];
		top=-1;
	}
	private static int size()
	{
		return top+1;
	}
	private static boolean isempty()
	{
		return size()==0;
	}
	private static void push(int element) throws Exception
	{
		if(size()==data.length)
		{int[] arr=new int[2*data.length];
		for(int i=0;i<data.length;i++)
		{
			arr[i]=data[i];
		}
		data=arr;
		}
		top++;
		data[top]=element;
	}
	private static int pop()throws Exception
	{
		if(isempty())
		{
			throw new Exception("stack underflow");	
		}
		int retval=data[top];
		data[top]=0;
		top--;
		return retval;
	}
	private static int top()
	{
		return top;
	}
	private static void display()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.print(data[i]+"->");
		}
		System.out.println("End");
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	    stack_implementation stack =new stack_implementation(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.display();
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isempty());
		System.out.println(stack.size());
 }
}
