package mywork;
 import java.util.ArrayList;
import java.util.Scanner;
  
public class arrays {
	static Scanner s=new Scanner(System.in);

	public static void main(String[] args) {
		   
//		    int m=s.nextInt();
//		    int n=s.nextInt();
//		    int[][] arr=new int[m][n];
//		    tkinp(arr);
//		    disp(arr);
		    //int i=0,data=7;
//		    swap(arr,i,j);
//		    disp(arr);
		//  System.out.println(max(arr));
//		    System.out.println(ls(arr,data));
//		    System.out.println(bs(arr,data));
		  //  bblsort(arr);
	//	    selectionsort(arr);
		  //  insertionsort(arr);
		 //   disp(arr);
//		    waveprint(arr);
//		    waveprinta(arr);
		    
		    
//		    
//		    ArrayList<Integer> list=new ArrayList<Integer>();
//		    System.out.println(list);
//		    list.add(12);
//		    list.add(15);
//		    System.out.println(list);
//		    list.set(1, 69);
//		    System.out.println(list);
//		    list.remove(1);
//		    System.out.println(list);
//		    list.add(12);
//		    list.add(15);list.add(12);
//		    list.add(15);list.add(12);
//		    list.add(15);
//		    System.out.println(list.size());
//		    

	}
	public static void tkinp(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
	}
	public static void disp(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static int swap(int[] arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		return temp;
	}
	public static int max(int[] arr)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	public static int ls(int[] arr,int data)
	{ int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==data)
			{
				count=i;
			}
		}
		if(count>0)
			return count;
		else
			return -1;
		
	}
	public static int bs(int[] arr,int data)
	{
		int start=0,end=arr.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(arr[mid]==data)
			{
				return mid;
			}
			else if(data>arr[mid])
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		return -1;
	}
	public static void bblsort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					swap(arr,i,j);
				}
					
			}
		}
	}
	public static void selectionsort(int[] arr)
	{ 
		for(int i=0;i<arr.length;i++)
		{   int min=i;
			for(int j=i+1;j<arr.length;j--)
			if(arr[j]<arr[min])
		    {  min=j;
		     }
		swap(arr,i,min);
		}
	}
	
	public static void insertionsort(int[] arr)
	{ int j;
		for(int i=1;i<=arr.length-1;i++)
		{    
			for( j=i;j>0&&arr[j]<arr[j-1];j--)
			{
				swap(arr,j,j-1);
		}
	}
	}
	public static void disp(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}	
	public static void tkinp(int[][] arr)
	{  for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			arr[i][j]=s.nextInt();
		}
	}
	}
	public static void waveprint(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
				if(i%2==1)
				{  for(int j=arr.length-1;j>=0;j--)
				     { 
				 	System.out.println(arr[i][j]);
				      }
				}
				else
				{
					for(int j=0;j<arr.length;j++)
				     { 
				 	System.out.println(arr[i][j]);
				      }
			}
		}
	}
	
	
	
	public static void waveprinta(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
				if(i%2==1)
				{  for(int j=arr.length-1;j>=0;j--)
				     { 
				 	System.out.println(arr[j][i]);
				      }
				}
				else
				{
					for(int j=0;j<arr.length;j++)
				     { 
				 	System.out.println(arr[j][i]);
				      }
			}
		}
	}
	
	
	
	
	
	
	

}
