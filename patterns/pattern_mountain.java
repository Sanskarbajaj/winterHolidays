package patterns;

public class pattern_mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=0,n=4,nst1=1,nsp1=n+1,nst2=1,count=1;
		while(row<n)
		{
			int cst1=0;
			while(cst1<nst1)
			{
				System.out.print(count);
				count++;
				cst1++;
			}
			int csp1=0;
			while(csp1<nsp1)
			{
				System.out.print(" ");
				csp1++;
			}
			int cst2=0;
			if(row==n-1)
			{
				count--;
			}
			while(cst2<nst2)
			{count--;
			
				System.out.print(count);
				
				cst2++;
			}
			row++;
			if(row==n-1)
			{
				nst2=n-2;
			}
			nst1++;
			nst2++;
			nsp1=nsp1-2;
			System.out.println();
		}

	}

}
