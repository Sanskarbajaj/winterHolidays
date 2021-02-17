package mywork;

public class sirjavamettl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fn="Rajiv";
		String ln="Roy";
		String pin= "560037";
		Integer n=6;
		String sa="",la="",lans,myans="",ltr="",rtl="";
		if(fn.length()>ln.length())
		{sa=ln;
		 la=fn;}
		else if(fn.length()==ln.length())
		{
			if(fn.compareTo(ln)>0)
			{sa=fn;la=ln;}
		}
		else
		{sa=fn;
		la=ln;}
		for(int i=0;i<n;i++)
		{
			if(i==n-1)
			{
			ltr=pin.charAt(i)+"";
			}
			else if(i==pin.length()-6)
			{
				rtl=pin.charAt(i)+"";
			}
		}
		lans=sa.charAt(sa.length())+""+la+ltr+rtl;
		
		for(int i=0;i<lans.length();i++)
		{
			if(Character.isUpperCase(lans.charAt(i)))
			{
				myans=myans+lans.toUpperCase().charAt(i);
			}
			else if(Character.isLowerCase(lans.charAt(i)))
			{
				
			}
		}
		System.out.println(myans);
	}

}
