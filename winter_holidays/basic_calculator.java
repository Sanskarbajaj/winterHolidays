package winter_holidays;

import java.util.Scanner;

public class basic_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		while(true)
		{
			char ch=s.next().charAt(0);
			if(ch=='+')
			{
				int a=s.nextInt();
				int b=s.nextInt();
				int c=a+b;
				System.out.println(c);
			}
			else if(ch=='+')
			{
				int a=s.nextInt();
				int b=s.nextInt();
				int c=a+b;
				System.out.println(c);
			}
			else if(ch=='-')
			{
				int a=s.nextInt();
				int b=s.nextInt();
				int c=a-b;
				System.out.println(c);
			}
			else if(ch=='*')
			{
				int a=s.nextInt();
				int b=s.nextInt();
				int c=a*b;
				System.out.println(c);
			}
			else if(ch=='/')
			{
				int a=s.nextInt();
				int b=s.nextInt();
				int c=a/b;
				System.out.println(c);
			}
			else if(ch=='%')
			{
				int a=s.nextInt();
				int b=s.nextInt();
				int c=a%b;
				System.out.println(c);
			}
			else if(ch=='X'||ch=='x')
			{
				return;
			}
			else
			{
				System.out.println("invalid operation");
			}
		}

	}

}
