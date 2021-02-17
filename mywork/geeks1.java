package mywork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class geeks1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> arr=new ArrayList<Character>();
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		char ch,chh,chhh;
		int n;
		while(t!=0)
		{
			t--;
			n=s.nextInt();
			while(n!=0)
			{
				ch=s.next().charAt(0);
				if(ch=='i')
				{ chh=s.next().charAt(0);
					arr.add(chh);
				}
				else
				{  
				chhh=s.next().charAt(0);
				System.out.println(Collections.frequency(arr,chhh));		
				}
			}
		}
		

	}

}
