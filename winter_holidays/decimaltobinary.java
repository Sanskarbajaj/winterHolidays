package winter_holidays;

public class decimaltobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(btd(1111));
		

	}
	public static int btd(int num)
	
	{
		int n=num,rem=0,pow=1,ans=0;
		while(n!=0)
		{
			rem=n%10;
			ans=ans+rem*pow;
			pow=pow*2;
			n=n/10;
			
		}
		return ans;
	}

}
