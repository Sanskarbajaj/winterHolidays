package winter_holidays;

public class Array_binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		int beg=0,end=a.length-1,mid=0,find=5;
		while(beg<end)
		{
			mid=(beg+end)/2;
			if(a[mid]==find)
			{
				System.out.println(mid);
				return;
			}
			else if(a[mid]>find)
			{
				end=mid-1;
			}
			else
			{
				beg=mid+1;
			}
			
		}

	}

}
