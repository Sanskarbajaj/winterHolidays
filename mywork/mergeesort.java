package mywork;

public class mergeesort {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b= {6,7,8,9};
		int [] yo=merge2(a, b);
		System.out.println(yo);
         
	}
	public static int[] merge2(int[] a,int[] b)
	{
		int i=0,j=0,k=0;
		int[] mer=new int[a.length+b.length];
		while(i<=a.length&&j<=b.length)
		{
			if(a[i]<=b[j])
			{
				mer[i]=a[i];
				i++;
				k++;
			}
			else
			{
				mer[i]=b[j];
				j++;
				k++;
			}
			
		}
		if(a[i]<b[j])
		{
			mer[i]=b[j];
			j++;
			k++;
		}
		if(b[i]<a[j])
		{
			mer[i]=a[i];
			i++;
			k++;
		}
		return mer;
		
	}

}
