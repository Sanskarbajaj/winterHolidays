package winter_holidays;

public class kadane_largestsumsubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= { 8, -8 ,9 ,-9 ,10 ,-11 ,12};int msf;
		int meh=msf=0;
		
		
  
		for(int i=0;i<a.length;i++)
		{
			meh=meh+a[i];
			if(meh<0)
			{
				meh=0;
			}
		if(msf<meh)
		{
			msf=meh;
		}
			
		}
		System.out.println(msf);
		int max_wrap=0;
		for (int i = 0; i <a.length; i++) 
        { 
            max_wrap += a[i]; // Calculate array-sum 
            
        } 
		System.out.println(max_wrap);
        // max sum with corner elements will be: 
        // array-sum - (-max subarray sum of inverted array) 
        max_wrap = max_wrap +msf; 
		

	}

}
