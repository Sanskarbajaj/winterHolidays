package winter_holidays;

public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lcm(4, 8));

	}
 public static int lcm(int a,int b) {
	int ans=0;
	 for(int i=1;i<=a*b;i++)
	 {
		 if(a%i==0&&b%i==0)
		 {
			 ans=i;
		 }
	 }
	 return ans;
 }
}
