package FlowControl;

public class initAndDispCharAlphabetically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character a='s';
		Character b='b';
sort(a, b);
	}
	public static void sort(Character a,Character b)
	{
		if(a.compareTo(b)==0)
		{
			System.out.println(a+","+b);
		}
		else if(a.compareTo(b)>0)
		{
			System.out.println(b+","+a);
		}
		else
		{
			System.out.println(a+","+b);

		}
	}

}
