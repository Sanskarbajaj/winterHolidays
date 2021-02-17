package mywork;

public class repeateda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 		String str="aba";
		 		int n=10;
		 		System.out.println(repeatedString(str, n));	
	}
	static long repeatedString(String s, long n) {
		 int res=0;
	      String ans="";
	      while(ans.length()<n)
	      {
	          ans=ans+s;
	      }
	        for(int i=0;i<n;i++)
	        {
	            if(ans.charAt(i)=='a')
	            {
	                res++;
	            }
	        }

	        return res; }
}
