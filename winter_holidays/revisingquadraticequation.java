package winter_holidays;

import java.util.Scanner;

public class revisingquadraticequation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		float d= (float) Math.sqrt((b*b)-4*a*c);
		float d1= (-b+d)/(2*a);
		float d2= (-b-d)/(2*a);
		if(d==0)
		{
			System.out.println("roots are real and equal");
		System.out.println(d1);
		System.out.println(d2);}
		else if(d!=0)
		{
			System.out.println("roots are not equal but real ");
			System.out.println(d1);
			System.out.println(d2);
		}
		else
		{
			System.out.println("imaginary roots");
		}
		
	}
   
}
