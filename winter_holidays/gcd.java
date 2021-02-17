package winter_holidays;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(4, 6));

	}
	public static int gcd(int a,int b)
	{
		int small=a<b?a:b;
		int ans=0;
		for(int i=small;i>=1;i--)
		{
			if(a%i==0&&b%i==0)
			{
				ans=i;
				break;
			}
		}
		return ans;
	}

}
