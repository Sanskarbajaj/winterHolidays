package mywork;

import java.util.Scanner;

public class stacknextg {
public static void main(String[] args)  {
	printm(0, 0,2,2,"");
}
public static void printm(int cr,int cc,int er,int ec,String res)
{
	if(cc==ec&&cr==er)
	{
		System.out.println(res);
		return;
	}
	if(cr>er||cc>ec)
	{
		return;
	}
	printm(cr, cc+1, er, ec, res+"H");
	printm( cr+1, cc, er, ec, res+"V");
	printm( cr+1, cc+1, er, ec, res+"D");
}
}