package newone;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.Scanner;

public class nsana  {
  private static final int MAX_CHAR = 26;
  public nsana() {
	// TODO Auto-generated constructor stub
}
public static void main(String[] args) 
    { 
int arr[][]= {{0,1},{1,2}};
mat(arr);

	}


public static void mat(int[][]a)
{
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[i][j]+"  ");
		}
	System.out.println();}
}







public static int lastStoneWeight(int[] stones) {
  ArrayList<Integer>al=new ArrayList<Integer>();
	for(int i=0;i<stones.length;i++)
	   al.add(stones[i]);
	Collections.sort(al);
	while(al.size()!=1||al.size()!=0)
	{   
		if(al.size()==1)
			break;
		if(al.size()==0)
			break;
		int y=al.remove(al.size()-1);
		int x=al.remove(al.size()-1);
		if(x==y)
		{	
		}else if(x!=y)
		{
			al.add(y-x);
			Collections.sort(al);
		}
		
	}
	if(al.isEmpty())
		return 0;
    
	
return al.get(0);}






public static void ansss()
{
	ArrayList<ArrayList<Integer>>gph=new ArrayList<ArrayList<Integer>>();
	gph.add(new ArrayList<>());
	gph.add(new ArrayList<>());
	gph.add(new ArrayList<>());
	gph.add(new ArrayList<>());
	gph.add(new ArrayList<>());
	gph.get(0).add(1);
	gph.get(0).add(2);
	gph.get(1).add(3);
	gph.get(2).add(5);
	gph.get(3).add(4);
	System.out.println(gph.get(0).get(1));
}













public static boolean backspaceCompare(String S, String T) {
    String s=gs(S);
    String t=gs(T);
    System.out.println(s);
    System.out.println(t);
    if(s.equals(t))
    return true;
return false;}
public static  String gs(String str)
{
    String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
    StringBuilder sb=new StringBuilder(str);
    String ans="";
    int n=sb.length();
    
    for(int i=0;i<n;i++)
    {
        if(specialChars.contains(String.valueOf(sb.charAt(i))))
        {
            if(i!=0)
            {
               sb.deleteCharAt((i-1));
                sb.deleteCharAt((i));
                
            }
        }
    }
ans=sb.toString();
return ans;}
public static int[][] an(int m,int n,int arr[][])
{
	      for(int i=0;i<m;i++)
	     {
	         for(int j=0;j<n;j++)
	         {
	             if(arr[i][j]==1)
	             {
	                 for(int p=0;p<n;p++)
	                 {
	                   arr[i][p]=1;  
	                 }
	                 for(int q=0;q<m;q++)
	                 {
	                   arr[q][j]=1;  
	                 }
	             return arr;}
	         }
	     }
	    
	 return arr;}	
public static int countElements(int[] arr) {
    HashMap<Integer,Integer>hm=new HashMap<>();
    for(int i=0;i<arr.length;i++)
    {
        if(!hm.containsKey(arr[i]))
        {
            hm.put(arr[i],1);
        }
        else
        {
            hm.put(arr[i],hm.get(arr[i])+1);
        }
    }
    int max=Integer.MIN_VALUE;
    Map.Entry<Integer,Integer>e=(Entry<Integer, Integer>) hm.entrySet();
   
    int count=0;
    ArrayList<Integer>al=new ArrayList<>();
    for(int i=0;i<arr.length;i++)
    	al.add(arr[i]);
    for(int i=0;i<arr.length;i++)
    {
        int ans=arr[i]+1;
        if(al.contains(ans))
            count++;
    }
    
return count;}























public static void block(int x,int n) 
{ 
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=(int) Math.pow(2, i);
	}
	int sum=0,count=0;
	ArrayList<Integer> al=new ArrayList<>();
for(int i=0;i<arr.length;i++)
{
	al.add(arr[i]);
	if(sum==x)
	{
		count++;
		break;
	}
		
}
if(count>0)
{
	System.out.println("Yes");
for(int r:al)
	System.out.print(r+" ");
}else
	System.out.println("No");
	
	
	
} 













public static int ba(int[] arr)
{
	if(arr.length==2)
	{
		return 0;
	}
	
	ArrayList<Integer> al=new ArrayList<Integer>();
	for(int i=0;i<arr.length;i++)
		al.add(arr[i]);
	Collections.sort(al);
	al.remove(al.size()-1);
	
return al.get(al.size()-1)-al.get(0);
}




















public static String math(String str)
{
	char[] ch=str.toCharArray();
	int j=0;
	Character[] ansch=new Character[(ch.length/2)+1];
	for(int i=0;i<ch.length;i++)
	{
	if(Character.isDigit(ch[i]))
	{
		ansch[j]=ch[i];
	j++;
	}
	}
	Arrays.sort(ansch);
	String ans="";
	for(int i=0;i<ansch.length;i++)
	{
		ans=ans+ansch[i]+"+";
	}
	StringBuilder sb=new StringBuilder(ans);
	sb.deleteCharAt(ans.length()-1);
return sb.toString();}














public static int alternate(String s) {
StringBuilder sb=new StringBuilder(s);
int ans=0;
for(int i=0;i<s.length();i++)
{
     if(isvalid(s.charAt(i),sb))
     {
    	 
    	 int anss=getans(s.charAt(i), sb);
    	 if(anss>ans)
    	 {
    		 ans=anss;
    	 }
     }


return ans;}


return ans;}
public static boolean isvalid(char ch,StringBuilder sb)
{
	StringBuilder temp=new StringBuilder(sb);
	for(int i=0;i<temp.length();i++)
	{
		if(temp.charAt(i)==ch)
		{
			temp.deleteCharAt(i);
		}
	}
	String ans=temp+"";
	boolean fsns=isalt(ans);
	
return fsns;}
public static int getans(char ch,StringBuilder ss)
{ StringBuilder temp=ss;
	for(int i=0;i<temp.length();i++)
	{
		if(temp.charAt(i)==ch)
		{
			temp.deleteCharAt(i);
		}
	}
	String anss=temp+"";
	
return anss.length();}
public static boolean isalt(String str)
{
	for(int i=0;i<str.length()-1;i++)
	{
		if(str.charAt(i)==str.charAt(i+1))
			return false;
	}
return true;}














public static List<List<String>> groupAnagrams(String[] strs) {
	  List<List<String>>ans=new ArrayList<List<String>>();
	  HashMap<String,List<String>>hm=new HashMap<>();
	  for(String cur:strs)
	  { char[] chars=cur.toCharArray();
	     Arrays.parallelSort(chars);
	     String sorted=new String(chars);
		  if(!hm.containsKey(sorted))
		  {
			  hm.put(sorted,new ArrayList<>());
		  }
		  hm.get(sorted).add(cur);
	  }
	  System.out.println(hm);
	 ans.addAll(hm.values());
	 return ans;}
public static void sort(String str)
{
	
}
	 public static int ghash(String str)
	 {	 
		 int ans=0;
		 int ch=0;
		 for(int i=0;i<str.length();i++)
		 {
			 Character hc=str.charAt(i);
		    ch=Math.abs(hc.hashCode());
			 ans=ans+ch;
		 }
	return ans; }
	
	
	
	








    
  static char[] sortByPattern(char[] str, char[] pat) 
  { 
    
      int count[] = new int[MAX_CHAR]; 

      
      for (int i = 0; i < str.length; i++) { 
          count[str[i] - 'a']++; 
      } 
      int index = 0; 
      for (int i = 0; i < pat.length; i++) { 
          for (int j = 0; j < count[pat[i] - 'a']; j++) { 
              str[index++] = pat[i]; 
          } 
      } 
  return str;} 
  
//  public static ArrayList<String>sortByOrder(String[] words, String alphabets )
//  { ArrayList<String>al=new ArrayList<>();
//  HashMap<Integer,Integer>hm=new HashMap<Integer, Integer>();
//  for(Integer x:hm.keySet())
//  {
//	  x.
//  }
//  hm.con
//	  for(int i=0;i<words.length;i++)
//	  {
//	  
//	  char[] tempalpha=alphabets.toCharArray();
//	  char[] string=words[i].toCharArray();
//	  char[] ans=sortByPattern(string, tempalpha);
//	  al.add(ans.toString());
//	  }
//	  String arr[]=new String[words.length];
//	  for(int i=0;i<arr.length;i++)
//	  {
//		  arr[i]=al.get(i);
//	  }
//	  
//	  
//	return al ;  
//  }
  public static boolean isHappy(int n) {
	  HashSet<Integer>hs=new HashSet<>();
      int sum=0,temp=n; 
      while(sum!=1)
      {
      int nodd=nod(temp);
      int []arr=new int[nodd];
      for(int i=0;i<arr.length;i++)
      {
    	arr[i]=temp%10;temp=temp/10;
      }
      for(int i=0;i<arr.length;i++)
      {
          arr[i]=arr[i]*arr[i];
          sum=sum+arr[i];           
      }
          if(sum==1)
          {
              return true;
          }
          else
          {
        	  temp=sum;
        	  if(!hs.contains(temp))
        	  hs.add(temp);
        	  else
        		  return false;
        	  sum=0;
          }
      }
  return false;}   
  public static  int[] maxProfit(int[] p) {
	 Stack<Integer> stk=new Stack<>();
	 stk.push(0);
	 int span[]=new int[p.length];
	 for(int j=0;j<p.length;j++)
		 span[j]=1;
	 
	 span[0]=1;
	 for(int i=1;i<p.length;i++)
	 {
		 if(p[stk.peek()]>p[i])
		 {
			 span[i]=i-stk.peek();
		 }
		 while(!stk.isEmpty()&&p[stk.peek()]<p[i])
		 {
			 stk.pop(); 
		 }
		 if(stk.isEmpty())
			 span[i]=i+1;
		 else
			 span[i]=i-stk.peek();
		 stk.push(i);}
  return span;}
  public static int mis(int []a)
  { int ans=1;
  int j=0;
  for(int i=0;i<a.length;i++)
  {
	  ans=ans+ans^a[i];
  }
	  
  return ans;}
  public static int maxans(int []arr)
  {
	  int maxans=0;
	  int ans[]=maxProfit(arr);
	  for(int i=0;i<arr.length;i++)
	  {
		 
		  
		  
		  
	  }
	  
	  
  }
  
  
  
  
  
  
  
  
  
  public static String srs(String str)
  { 
	  boolean again=true;
	  StringBuilder ans=new StringBuilder(str);
	  while(again)
	  {
		  again =false;
	  for(int i=0;i<str.length()-1;i++)
	  {
		  int st=i,end=i+1;
		  if(ans.charAt(st)==ans.charAt(end))
		  {
			  ans.delete(st,end+1);
			again =true;
		  }
	  }
	  }
	  if(ans.length()==0)
		  return "Empty String";
  return ans.toString();
  }
  
  
  
  
  
  
  public static int nod(int n)
  {
      int temp=n,count=0;
      while(temp!=0)
      {
          count++;
          temp=temp/10;
          
      }
  return count;
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
 public static int PerfectMatch(int arr[], int n) { 
      // your code goes here 	
	 HashMap<Integer, Integer> mp = new HashMap<Integer,Integer>(); 
		
		for (int i = 0; i <17 ; i++) 
		{ 
			mp.put(i, 0); 
		} 
		
		int ans = -1; 

		for (int i = 0; i < n; i++) 
		{ 
			// Finding the digit sum of arr[i] 
			int dSum = dig(arr[i]); 
			
			if ((int)mp.get(dSum) != 0) 
			{ 
				ans = Math.max(ans, (int)mp.get(dSum) + arr[i]); 
			} 
			mp.put(dSum,Math.max((int)mp.get(dSum), arr[i])) ; 
		} 
		return ans;  }
 public static int dig(int n)
 {
	 int temp=n,rem=0;
	 int sum=0;
	 while(temp!=0)
	 {rem=temp%10;
		 sum=sum+rem;
		 temp=temp/10;
	 }
 return sum;}
}