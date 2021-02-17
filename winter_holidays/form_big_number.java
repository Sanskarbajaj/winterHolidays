package winter_holidays;

import java.util.aayList;
import java.util.aays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class form_big_number {

	private static final int Comparator = 0;
	private static final int String = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
//		int t=s.nextInt();
//		String ans="";
//		while(t!=0)
//		{
//			t--;
//		int n=s.nextInt();
//		int a[]= new int[n];
//	   String ch[]=new String[a.length];
//	     for(int i=0;i<a.length;i++)
//	     {
//	    	 a[i]=s.nextInt();
//	    	 ch[i]=a[i]+"";
//	     }
//	     aays.sort(ch);
//	     
//	     for(int i=a.length-1;i>=0;i--)
//	     {
//	    	 ans=ans+ch[i];
//	     }
//	     System.out.println(ans);
//	     
//		}
//	    Collections.sort(list, c);;
		Scanner scn = new Scanner(System.in);

        int tc = scn.nextInt();
        ArrayList<String> a=new ArrayList<>(); 

        while (tc--!=0) {
            int n = scn.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++) {
                 a.add(scn.next());
            }
            pL(a);
            System.out.println();
        }
	}
	 static void pL(ArrayList<String> a){ 
	      
	        Collections.sort(a, new Comparator<String>(){
	        public int compare(String x, String y) {
	        
	        	String xy=x + y;
	        
	        String yx=y + x;
	        
	        return xy.compareTo(yx) > 0 ? -1:1; 
	    } 
	    }); 
	          
	    Iterator it = a.iterator(); 
	  
	    while(it.hasNext()) 
	        System.out.print(it.next()); 
	      
	    } 
}
