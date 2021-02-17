package winter_holidays;

public class reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,3,4,5,6};
		int b[]=new int[a.length];
		for(int i=a.length-1;i>=0;i--)
		{
			b[i]=a[i];
			System.out.println(b[i]);
		}

	}

}
