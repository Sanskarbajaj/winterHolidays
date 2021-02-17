package recursion;

public class subset_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3};
		int tgt=3;
		int c=sp(arr,0,0,"",tgt);
System.out.println(c);
	}
	 public static int sp(int[] arr, int idx,int ssf,String ans,int target)
	 {
	  
	      if(idx == arr.length){
	            
	          if(target == ssf){
	              System.out.print(ans+" ");
	          
	              return 1;
	          }
	           return 0;
	      }

	      int cnt = 0;
	      cnt += sp(arr,idx + 1,ssf + arr[idx],ans + arr[idx]+" ",target);
          cnt += sp(arr,idx + 1,ssf,ans,target);

	      return cnt;
	  }

}
