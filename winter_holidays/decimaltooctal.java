package winter_holidays;

public class decimaltooctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dto(25));

	}
	public static  int dto(int num)
	{
		int n=num,rem=0;
		String on="";
		while(n!=0)
		{
			rem=n%8;
			on=rem+on;
			n=n/8;
		}
		int ans=Integer.parseInt(on);
		return ans;
	}

}
