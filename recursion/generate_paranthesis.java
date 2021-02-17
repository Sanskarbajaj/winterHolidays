package recursion;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class generate_paranthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=2;
		ArrayList<String> ans=new ArrayList<>();
		System.out.println(gp(2));

	}
	 public static ArrayList<String> gp(int n) {
	        ArrayList<String> ans = new ArrayList();
	        pparen(ans, "", 0, 0, n);
	        return ans;
	    }
	public static void pparen(ArrayList<String> ans, String cur, int open, int close, int max)
	{
		        if (cur.length() == max * 2) {
		            ans.add(cur);
		            return;
		        }

		        if (open < max)
		            pparen(ans, cur+"(", open+1, close, max);
		        if (close < open)
		            pparen(ans, cur+")", open, close+1, max);
		    }
}
