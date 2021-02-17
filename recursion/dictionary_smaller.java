package recursion;

public class dictionary_smaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="cab";
		String qq=str;
		pp(str, "", qq);

	}
	 public static void pp(String ques, String ans,String orig) {
         
        if (ques.length() == 0) 
        {
            
            if(ans.compareTo(orig) > 0)
            {
                System.out.println(ans+" ");
            }
            return;
        }
        
        int cnt = 0;
        for (int i = 0; i < ques.length(); i++)
        {
        
        	char ch = ques.charAt(i);
            
        	String roq = ques.substring(0, i) + ques.substring(i + 1);
        	
            pp(roq, ans + ch,orig);
        }
    }

}
