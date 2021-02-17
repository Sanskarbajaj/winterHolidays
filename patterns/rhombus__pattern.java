package patterns;

public class rhombus__pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3,row=0,nst=1,nsp=n;
		while(row<(2*n)-1)
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
				System.out.print();
				cst++;
			}
			if(row<n-1)
			{
				nst=nst+2;
				nsp--;
			}
			else
			{
				nst=nst-2;
				nsp++;
			}
			row++;
			System.out.println();
		}

	}

}
