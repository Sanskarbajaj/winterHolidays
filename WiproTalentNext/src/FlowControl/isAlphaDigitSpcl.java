package FlowControl;

public class isAlphaDigitSpcl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character a='%';
		isAlphaDigit(a);
	}
public static void isAlphaDigit(Character a)
{
	if(a.isLetter(a))
	{
		System.out.println("Letter");
	}
	else if(a.isDigit(a))
	{
		System.out.println("Digit");
	}
	else
	{
		System.out.println("special Chars");
	}
}
}
