package winter_holidays;

public class array_wavw_columnwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{11, 12 ,13, 14}, {21 ,22 ,23 ,24} , {31 ,32 ,33 ,34} ,{41 ,42 ,43 ,44}};
		for(int i=0;i<arr.length;i++)
	     {
	    	 if(i%2==0)
	    	 {
	    		 for(int j=0;j<arr.length;j++)
	    		 {
	    			 System.out.println(arr[j][i]);
	    		 }
	    	 }
	    	 else
	    	 {
	    		 for(int j=arr.length-1;j>=0;j--)
	    		 {
	    			 System.out.println(arr[j][i]);
	    		 }
	    	 }
	     }

	}

}
