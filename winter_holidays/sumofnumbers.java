package winter_holidays;

public class sumofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumofnumbers obj=new sumofnumbers();
		System.out.println(obj.sod(12345));

	}
  public static long sod(long num)
  {
	 long n=num,sum=0,rem=0;
	  while(n!=0)
	  {
		  rem=n%10;
		  sum=sum+rem;
		  n=n/10;
	  }
	  return sum;
  }
}
