package winter_holidays;

public class array_wave_row_wise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[][]= {{11, 12 ,13, 14}, {21 ,22 ,23 ,24} , {31 ,32 ,33 ,34} ,{41 ,42 ,43 ,44}};
     for(int i=0;i<arr.length;i++)
     {
    	 for(int j=0;j<arr.length;j++)
    	 {
    		 if(i%2==0)
    		 {
    			 System.out.println(arr[i][j]);
    		 }
    		 else
    		 {
    			 System.out.println(arr[i][arr.length-j-1]);
    		 }
    	 }
     }
	}

}
