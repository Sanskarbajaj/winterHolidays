package patterns;

public class patternsirtpp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,row=0,nst=n;int count=0,odd=3;
		while(row<n)
		{ int cst=0;
			while(cst<nst)
			{count++;
				System.out.print(count+"-");	
				cst++;}
			if(row<(n/2))
			{count =(int)((int)n*Math.pow(2,row+1));}
			else
			{ count=n*odd;
			   odd=odd-2;}
			row++;
			System.out.println();}

	}

}
/* 1  2  3  4  5
 * 11 12 13 14 15
 * 21 22 23 24 25
 * 16 17 18 19 20 
 * 6  7  8  9  10*/
