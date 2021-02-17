package winter_holidays;

public class chewbacca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(chew(9875));

	}
	public static String chew(int num)
	{
		int n=num,rem=0,ans=0;
		String bn="";
		while(n!=0)
		{
			rem=n%10;
			if(rem>=5)
			{
				rem=9-rem;
			}
			bn=rem+bn;
			n=n/10;
		}
		
		return bn;
				}

}
