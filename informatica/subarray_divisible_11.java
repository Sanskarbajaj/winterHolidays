package informatica;

public class subarray_divisible_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4, 5, 0, -2, -3, 1}; 
		         int k = 5;
System.out.println(divi11(arr, k));
	}
	public static int divi11(int arr[],int k)
	{ int max=0;
	int count=0;
		for(int i=0;i<arr.length;i++)
		{ max=0;
			for(int j=i+1;j<arr.length;j++)
			{	
			max=max+arr[j];
			if(max==0||max%11==0)
				count++;
			}
		}
	return count;}
	

}
