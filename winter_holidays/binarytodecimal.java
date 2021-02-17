package winter_holidays;

public class binarytodecimal {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(dtb(0));

	}
  public static int dtb(int num) throws Exception
  {
	  if(num==0)
	  {
		  throw new Exception("enter valid num");
	  }
	  int n=num;
	  int rem=0;
	  String bn="";
	  while(n!=0)
	  {
		  rem=n%2;
		  bn=rem+bn;
		  n=n/2;
	  }
	  int ans=Integer.parseInt(bn);
	  return ans;
  }
}
