package mywork;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap {

	public static void main(String[] args) {
		
		String str="aabbaacaab";
		HashMap<Character,Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++)
		{
			char cc=str.charAt(i);
			if(map.containsKey(cc))
			{
				int up=map.get(cc);
				int nv=up+1;
				map.put(cc,nv);
			}
			else
			{
				map.put(cc,1);
			}
		}
		char maxx='\0';
		int max=0;
		Set<Map.Entry<Character,Integer>> entries=map.entrySet();
		for(Map.Entry<Character,Integer> entry:entries)
		{
			if(entry.getValue()>max)
			{
				max=entry.getValue();
				maxx=entry.getKey();
			}
		}
		System.out.println(maxx);
	}

}
