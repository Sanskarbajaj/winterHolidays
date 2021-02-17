package winter_holidays;

public class printreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printrev(12345));

	}
	public static long printrev(long n)
	{
		long num=n;
		long rev=0,rem=0;
		while(num%10!=0)
		{ rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		}
		return rev;
		
	}

}
