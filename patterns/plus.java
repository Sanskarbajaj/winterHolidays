package patterns;

public class plus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,row=0,nst=1,nsp=5;
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
				System.out.print("+");
				cst++;
			}
			if(row==n-1)
			{
				nst=10;
			}
			row++;
			System.out.println();
		}

	}

}
