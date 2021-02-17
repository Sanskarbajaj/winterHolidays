package patterns;

public class mirror_star_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7,row=0,nst=1,nsp=(n/2)+1;
		while(row<n)
		{
			int csp=0;
			while(csp<nsp)
			{
				System.out.print(" ");
				csp++;
			}
			int cst=0;
			while(cst<nst)
			{
				System.out.print("*");
				cst++;
			}
			row++;
			if(row<(n/2)+1)
			{
			nst=nst+2;
			nsp--;
			}
			else
			{
				nsp++;
				nst=nst-2;
			}
			System.out.println();
		}

	}

}
