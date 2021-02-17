package winter_holidays;

import java.util.Stack;

public class balanced_paranthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	boolean ans=isbalanced("(())");
	if(ans==true)
	{
		System.out.println("yes");
	}
	else
		System.out.println("no");
		

	}

	public static boolean isbalanced(String str)
	{
		Stack<Character> stk=new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='('||str.charAt(i)=='['||str.charAt(i)=='{')
			{
				stk.push(str.charAt(i));
			}
			else if(str.charAt(i)==')'||str.charAt(i)==']'||str.charAt(i)=='}')
			{
				if(stk.isEmpty())
				{ 
					return false;
				}
				else if(!ism(stk.pop(),str.charAt(i)))
				{
					return false;
				}
				
			}
		}
		
		
		return true;
	}
	public static boolean ism(Character c,Character ch)
	{
		if(c=='('&&ch==')')
			return true;
		else if(c=='{'&&ch=='}')
			return true;
		else if(c=='['&&ch==']')
			return true;
		
		return false;
	}
}
