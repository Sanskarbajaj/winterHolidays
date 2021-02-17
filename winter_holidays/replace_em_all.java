package winter_holidays;

public class replace_em_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rplc(1000));

	}
	public static int rplc(int num)
	{
		int n=num,nn=0;
		String a="";
		int rem=0;
		while(n!=0)
		{
			rem=n%10;
			if(rem==0)
			{
				a="5"+a;
			}
			else
			{
				a=rem+a;
			}
			 nn=Integer.parseInt(a);
			n=n/10;
			
			
		}
		return nn;
	}

}
