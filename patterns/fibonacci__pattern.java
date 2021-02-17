package patterns;

public class fibonacci__pattern {

	public static void main(String[] args) {
		int n=4,row=0,nst=1,fn=0,sn=1,tn=0;
		while(row<n)
		{
			int cst=0;
			while(cst<nst)
			{
				System.out.print(fn+"  ");
				
				tn=fn+sn;
				
				
				fn=sn;
				sn=tn;
				cst++;
			}
			
			row++;
			nst++;
			System.out.println();
		}

	}

}
