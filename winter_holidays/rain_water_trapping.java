package winter_holidays;

public class rain_water_trapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0 ,1,  0,  2,  1 , 0,  1,  3,  2,  1,  2,  1};
		int brr[]=new int[arr.length];
		int crr[]=new int[arr.length];
		for(int i=1;i<arr.length;i++)
		{
			brr[0]=arr[0];
			brr[i]=Math.max(arr[i], brr[i-1]);
			
		}
		for(int i=arr.length-2;i>=0;i--)
		{
			crr[arr.length-1]=arr[arr.length-1];
			crr[i]=Math.max(crr[i+1],arr[i]);
		}
		int water=0;
		for(int i=0;i<arr.length;i++)
		{
			water=water+(Math.min(brr[i],crr[i])-arr[i]);
		}
		System.out.println(water);

	}

}
