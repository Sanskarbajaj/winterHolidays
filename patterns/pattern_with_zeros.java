package patterns;

public class pattern_with_zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6,row=0,nst=1,count=1;
		while(row<n)
		{
			int cst=0;
			while(cst<nst)
			{
				if(cst==0||cst==nst-1)
				System.out.print(row+1);
				else
					System.out.print("0");
				cst++;
				count++;
			}
			row=row+1;
			nst++;
			System.out.println();
			
		}

	}

}
