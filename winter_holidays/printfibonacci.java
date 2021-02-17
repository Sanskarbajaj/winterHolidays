package winter_holidays;

public class printfibonacci {

	public static void main(String[] args) {
		printfib(11);
		
	}
	public static void printfib(int n)
	{
		int fn=0,sn=1,tn=0;
	System.out.println(fn);
	System.out.println(sn);
		while(tn<=n)
		{
			tn=fn+sn;
			if(tn<=n)
			System.out.println(tn);
			fn=sn;
			sn=tn;
			
		}
	}

}
