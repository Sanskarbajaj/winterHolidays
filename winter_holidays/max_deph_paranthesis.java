package winter_holidays;

import java.util.Stack;

public class max_deph_paranthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println(maxdep("(((X))(((Y))))"));
	}
public static int maxdep(String str)
{
	int counter=0;
	int ans=0;
	Stack<Character> stk=new Stack<>();
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='(')
		{
			stk.push(str.charAt(i));
			counter++;
			if(counter>ans)
			{
				ans=counter;
			}
		}
		
		else if(str.charAt(i)==')')
		{
			Character close=stk.pop();
			if(counter>0&&close=='(')
			{
				counter--;
			}
			else
				return -1;
		}
	}
	if(!stk.isEmpty())
	{
		return -1;
	}
	return ans;
}
}
