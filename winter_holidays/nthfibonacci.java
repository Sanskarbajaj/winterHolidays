package winter_holidays;

public class nthfibonacci {

	public static void main(String[] args) {
		System.out.println(nthfib(10));

	}
	public static int nthfib(int n)
	{
		int fn=0,sn=1,tn=0;
		
		for(int i=0;i<=n-2;i++)
		{ tn=fn+sn;
		   fn=sn;
		   sn=tn;
			
		}
		return tn;
	}

}
