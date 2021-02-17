package winter_holidays;

import java.util.Stack;

public class stock_span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {30,35,40,38,35};
int s[]=new int[arr.length];
//s[0]=1;      O(n^2) approch
//for(int i=1;i<arr.length;i++)
//{ s[i]=1;
//	for(int j=i-1;j>=0&&arr[j]<arr[i];j--)
//	{
//			s[i]++;
//	}
//}
//for(int x:s)
//{
//	System.out.println(x);
//}
Stack<Integer> stk=new Stack<Integer>();
stk.push(0);
s[0]=1;
for(int i=1;i<arr.length;i++)
{	
	
	while(!stk.isEmpty()&&arr[stk.peek()]<=arr[i])
	{
		stk.pop();
	}
	s[i]=stk.isEmpty()?i+1:i-stk.peek();
	stk.push(i);
	
}
for(int x:s)
{
	System.out.println(x);
}
}
}
