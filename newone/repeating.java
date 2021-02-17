package newone;

public class repeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,3,4};
findRepeated(arr);
	}
	public static void findRepeated(int arr[])
	{
	for(int i=0;i<arr.length-1;i++)
	{
		if(arr[i]==arr[i+1])
		{
			System.out.println(arr[i]);
			return;
		}
	}
	}

}
