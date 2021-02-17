package patterns;

public class hollow_diamond_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,row=0,nst1=(n/2)+1,nsp=0,nst2=n/2;
		while(row<n)
		{
			int cst1=0;
			while(cst1<nst1)
			{
				System.out.print("*");
				cst1++;
			}
			int csp=0;
			while(csp<nsp)
			{
				System.out.print(" ");
				csp++;
			}
			int cst2=0;
			while(cst2<nst2)
			{
				System.out.print("*");
				cst2++;
			}
			if(row<=(n/2)+1)
			{
				nst1--;
				nsp++;
				nst2--;
				
			}
			else
			{
				nst1++;
				nsp--;
				nst2++;
			}
			row++;
			System.out.println();
		}
		
	}
}