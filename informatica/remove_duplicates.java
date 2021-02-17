package informatica;

import java.util.ArrayList;
import java.util.HashSet;

public class remove_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,9,1,2,1,1,3,5,6,7,2,1,2,2};
		//System.out.println(remove_duplicates(arr));

	}
	public static HashSet<Integer> remove_duplicates(int arr[])
	{	HashSet<Integer>hs=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
		hs.add(arr[i]);
		}return hs;}
//	public static void remove_duplicates(int arr[])
//    {
//	ArrayList<Integer>al=new ArrayList<>();
//	for(int i=0;i<arr.length;i++)
//	{
//		al.add(arr[i]);
//	}
//	for(int i=0;i<al.size();i++)
//	{
//		for(int j=i;j<al.size();j++)
//		{
//			if(arr[i]==al.get(i))
//			{
//				al.remove(i);
//			}
//		}
//	}
//		
//    }
}
