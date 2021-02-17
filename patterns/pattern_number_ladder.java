package patterns;

public class pattern_number_ladder {

	public static void main(String[] args) {
	int n=4;
	int row=0,nst=1,count=1;
		while(row<n)
		{
			int cst=0;
			while(cst<nst)
			{
				System.out.print(count+"  ");
				cst++;
				count++;
			}
			row++;
			nst++;
			System.out.println();
		}

	}

}
