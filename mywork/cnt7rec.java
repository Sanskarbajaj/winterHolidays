package mywork;

public class cnt7rec {
	static int sum=0,t;
	static String res="";
	

	public static void main(String[] args) {
		
		System.out.println(count(5));

	}
public static int count(int n)
	{ 
	if(n==0||n==1)
	{
		return n;
	}
	count(n-1);
	int y=n+1;
return y;	
	}
}
