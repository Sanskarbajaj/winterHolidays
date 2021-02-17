package FlowControl;

import java.util.Scanner;

public class CheckNumberIsPosNegOrZero {

	public static void main(String[] args) {
	
Scanner s=new Scanner(System.in);
int n=s.nextInt();
negPosZero(n);
	}
	public static void negPosZero(int n)
	{
		if(n>0)
		{
			System.out.println("Positive");
			return;
		}
		else if(n<0)
		{
			System.out.println("Negative");
			return;
		}
		System.out.println("Zero");
	return;}

}
