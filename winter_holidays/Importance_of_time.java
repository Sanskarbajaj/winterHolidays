package winter_holidays;

public class Importance_of_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue_implementation q=new Queue_implementation();
		

	}
	public static void func(Queue_implementation q,int n,int[] arr)throws Exception{
        int ans = 0;
        for(int j = 0;j<n;j++) {
            if(q.front() == arr[j]) {
                ans++;
                q.dequeue();
            }else {
                while(q.front() != arr[j]) {
                int var = q.front();
                q.enqueue(var);
                q.dequeue();
                ans++;
                }
                ans++;
                q.dequeue();
            }

    }
    System.out.println(ans);

}


}
