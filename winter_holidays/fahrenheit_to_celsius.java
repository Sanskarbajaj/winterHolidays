package winter_holidays;

import java.util.Scanner;

public class fahrenheit_to_celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int min=s.nextInt();
		int max=s.nextInt();
		int step=s.nextInt();
		int c=0;
		for(int i=min;i<max;i++)
		{
			c=(5/9)*(min
					-32);
			System.out.println(c);
		}

	}
	

}
