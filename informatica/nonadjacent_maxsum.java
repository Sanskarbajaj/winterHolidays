package informatica;

public class nonadjacent_maxsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,1,1,4,2,1};
		System.out.println(non(arr));

	}
	public static int non(int arr[])
	{
		int inc,exc;
		inc=arr[0];
		int temp=inc;
		exc=0;
		for(int i=1;i<arr.length;i++)
		{ 
			inc=Math.max(arr[i]+exc,inc);
			exc=temp;
			temp=inc;
		}
	return Math.max(inc,exc);}

}
