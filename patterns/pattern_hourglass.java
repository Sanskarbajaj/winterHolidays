package patterns;

public class pattern_hourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=5,row=0,nst=n+1,nsp=0,count=n;
     while(row<(2*n)+1)
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
    		 
    		 
    		 System.out.print(count);
    		 count--;
    		 cst++;
    	 }
    	 cst=0;
    	 count=count+2;
    	 while(cst<nst)
    	 {
    		 
    		 
    		 System.out.print(count);
    		 count++;
    		 cst++;
    	 }
    	
    	 if(row<n)
    	 {
    		nsp++;
    		 nst=nst-2;
    		 count=count-2;
    		 
    	 }
    	 else
    	 {
    		 nsp--;
    		 nst=nst+2;
    	 }
    	 row++;
    	 System.out.println();
     }
	}

}
