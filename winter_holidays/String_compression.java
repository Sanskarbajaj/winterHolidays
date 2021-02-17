package winter_holidays;

public class String_compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaabbccds";
		int count=0;
		for(int i=0;i<str.length();i++)
		{count=0;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
				}
				else
				{
					break;
				}
			}
			if(count==0)
			{
				System.out.print(str.charAt(i));
			}
			else
			{int countt = count+1;
			  System.out.print(str.charAt(i));
			  System.out.print(countt);
			}
			i=i+count;
		}

	}

}
