package mywork;

public class recursionpractice {

	public static void main(String[] args) {
		int n=5;
		System.out.println(fn1(4,3));
		      

	}
	public static void prdi(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);
		prdi(n-1);
		System.out.println(n);
	}
	
	public static int fn(int n)
	{
		if(n==4)
			return 4;
		else
		{
			return 2*fn(n+1);
		}
		
	}
	public static int fn1(int x,int y)
	{ 
		if(x==0)
		{
			return y;
		}
		return fn1(x-1,x+y); 
	}
	
		


}
