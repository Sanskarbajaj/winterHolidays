package informatica;

public class substring_divisible_by_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="122164154695";
		System.out.println(div(str,0,11));

	}
	public static boolean div(String str,int l,int m)
	{
		if(sume(str, l, m)-sumo(str, l, m)==0||(sume(str, l, m)-sumo(str, l, m))%11==0)
			return true;
	return false;}
	public static int sumo(String str,int l,int m)
	{
		int ans=0;
		for(int i=l;i<=m;i++){
			if(i%2==0){
			ans=ans+(int)(str.charAt(i)-48);
			System.out.println(ans+"->o"+" ");}
		}
	return ans;}
	public static int sume(String str,int l,int m){
		int ans=0;
		for(int i=l;i<=m;i++){
			if(i%2!=0){
			ans=ans+(int)(str.charAt(i)-48);
			System.out.println(ans+"->e"+" ");}
		}
	return ans;
	}

}
