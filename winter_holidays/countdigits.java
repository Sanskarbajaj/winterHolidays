package winter_holidays;

public class countdigits {

	public static void main(String[] args) {
		System.out.println(countdigits(5433231,3));

	}
	public static int countdigits(int n,int d)
	{
		int num=n,rem=0,count=0;
		while(num!=0)
		{ rem=num%10;
		if(rem==d)
		{
			count++;
		}
		num=num/10;
	}
return count;
}
}
