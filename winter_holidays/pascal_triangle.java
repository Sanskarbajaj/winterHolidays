package winter_holidays;

public class pascal_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,row=0,nst=1,nsp=n;
		while(row<n)
		{
			int csp=0;
			while(csp<nsp)
			{
				System.out.print(" ");
				csp++;
			}
			int cst=0;
			int val=1;
			while(cst<nst)
			{
				System.out.print(val+" ");
				val=val*(row-cst)/(cst+1);
				
				cst++;
			}
			
			row++;
			nst=nst+1;
			nsp--;
			System.out.println();
		}

	}

}
