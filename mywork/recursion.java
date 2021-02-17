package mywork;

import java.util.ArrayList;

public class recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pd(5);
	//	pi(5);
	//	pdi(5);
//System.out.println(fact(5));
//System.out.println(power(2,5));
		int[] arr= {8,8,4,8,7};
		int i=0,data=8,count=0;
		//System.out.println(issorted(arr,i));
		//System.out.println(ls(arr,i,data));
		//System.out.println(lstindx(arr, i, data));
//		int [] ans=allindex(arr, i, data, count);
//		System.out.println(ans[2]);
	//	System.out.println(getssasc("abc"));
		//printssasc("abc", "");
	//	System.out.println(getpermu("abc"));
		printpermu("abc","");
	}
        public static void pd(int n)
        {
        	if(n==0)
        		return;
        	
        	System.out.println(n);
        	pd(n-1);
        }
        public static void pi(int n)
        {
        	if(n==0)
        		return;
        	
        	
        	pi(n-1);
        	System.out.println(n);
        }
        public static void pdi(int n)
        {
        	if(n==0)
        		return;
        	
        	System.out.println(n);
        	pdi(n-1);
        	System.out.println(n);
        }
        public static int fact(int n)
        {
        	if(n==0||n==1)
        		return 1;
        	
        	int nxt=fact(n-1);
        	int fn=n*nxt;
        	return fn;
        }
        public static int power(int x,int n)
        {   if(n==0)
        	return 1;
        
        	int p=power(x,n-1);	
        	int ress=x*p;
        			return ress;
        }
        
        public static boolean issorted(int[] arr,int i)
        {      if(i==arr.length-1)
        	return true;
        	
        	if(arr[i]>arr[i+1])
        		return false;
        	else
        	{
        		if(issorted(arr,i+1))
        		return true;
        		else
        			return false;
        	}
        		
        }
        public static int ls(int[] arr,int i,int data)
        {   if(i==arr.length)
        {
        	return -1;
        }
        	if(arr[i]==data)
        		return i;
        	else
        	{
        		int p=ls(arr,i+1,data);
        		return p;
        	}
        }
        
        public static int lstindx(int[] arr,int i,int data)
        {
        	if(i==arr.length)
        	{
        		return -1;
        	}
        	
        	int index=lstindx(arr, i+1, data);
        	if(index==-1)
        	{
        		if(arr[i]==data)
        		{
        			return i;
        		}
        		else
        		{
        			return -1;
        		}
        	}
        	else
        	{
        		return index;
        	}
        		
        }
        
        public static int[] allindex(int[] arr,int i,int data ,int count)
        {
        	if(i==arr.length)
        	{
        		int []br=new int[count];
        		return br;
        	}
        	int[] index=null;
        	if(arr[i]==data)
        	{
        		index=allindex(arr, i+1,data,count+1);
        	}
        	else
        	{
        	index=allindex(arr, i+1,data,count);
        	}
        	if(arr[i]==data)
        	{
        		index[count]=i;	
        	}
        		return index;
        }
        
        public static ArrayList<String> getss(String str)
        {
        	if(str.length()==0)
        	{
        		ArrayList<String> br=new ArrayList();
        		br.add("");
        		return br;
        	}
           char cc=str.charAt(0);
           String ros=str.substring(1);
           ArrayList<String> myr=new ArrayList<String>();
           ArrayList<String> rr=getss(ros);
           for(int i=0;i<rr.size();i++)
           {
        	   myr.add(rr.get(i));
        	   myr.add(cc+rr.get(i));
        	   
           }
           return myr;
        }
        
        
        public static ArrayList<String> getssasc(String str)
        {
        	if(str.length()==0)
        	{
        		ArrayList<String> br=new ArrayList();
        		br.add("");
        		return br;
        	}
           char cc=str.charAt(0);
           String ros=str.substring(1);
           ArrayList<String> myr=new ArrayList<String>();
           ArrayList<String> rr=getss(ros);
           for(int i=0;i<rr.size();i++)
           {
        	   myr.add(rr.get(i));
        	   myr.add(cc+rr.get(i));
        	   myr.add((int) cc+rr.get(i));
        	   
           }
           return myr;
        }
        public static void printss(String str,String res)
        {
        	if(str.length()==0)
        	{
        		System.out.print(res+",");
        		return;
        	}
        	char cc=str.charAt(0);
        	String ros=str.substring(1);
        	printss(ros, res);
        	printss(ros, res+cc);
        }
        
        public static void printssasc(String str,String res)
        {
        	if(str.length()==0)
        	{
        		System.out.print(res+",");
        		return;
        	}
        	char cc=str.charAt(0);
        	String ros=str.substring(1);
        	printss(ros, res);
        	printss(ros, res+cc);
        	printss( ros, res+ (int)cc);
        }
        public static ArrayList<String> getpermu(String str)
        {
        	if(str.length()==0)
        	{
        		ArrayList<String> br=new ArrayList<String>();
        		br.add("");
        		return br;
        	}
        	char cc=str.charAt(0);
        	String ros=str.substring(1);
        	ArrayList<String> myres=new ArrayList<String>();
        	ArrayList<String> rr=getpermu(ros);
        	for(int i=0;i<rr.size();i++)
        	{
        		String ss=rr.get(i);
        		for(int j=0;j<=ss.length();j++)
        		{
        			String ms=ss.substring(0,j)+cc+ss.substring(j);
        			myres.add(ms);
        		}
        	}
        	return myres;
        	
        }
        public static void printpermu(String str,String res)
        {
        	if(str.length()==0)
        	{
        		System.out.println(res);
        		return;
        	}
        		for(int i=0;i<str.length();i++)
        		{
          char cc=str.charAt(i);
          String ros = str.substring(0, i) + str.substring(i + 1);
          printpermu(ros, res+cc);
        }
        }
	
	
	
	
}
