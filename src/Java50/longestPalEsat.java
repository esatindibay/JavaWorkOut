package Java50;

public class longestPalEsat {

	public static void main(String[] args) {
	//	System.out.println(intPal("adanali",2,4));
		
		System.out.println(longest("ankadaran geldim"));
		System.out.println(longest("was it a rat i saw"));
		System.out.println(longest("9912321456"));
		System.out.println(longest("9912333321456"));
		System.out.println(longest("12145445499"));
		System.out.println(longest("1223213"));
		System.out.println(longest("abb"));
		

	}
	
	public static String longest(String str){
		if (str == null) return null;
		
		String max = str.substring(0,1);
		
		for(int i=0; i<str.length()-1; i++){
			String pal = intPal(str,i,i);
			if(max.length()<pal.length()){
				max = pal;
			}
			pal = intPal(str,i,i+1);
			if(max.length()<pal.length()){
				max = pal;
			}
		}
		return max;
	}
	 static public String intPal(String str, int x, int y){
		while (x >= 0 && y < str.length() 
				&& str.charAt(x) == str.charAt(y)){
			x--;
			y++;
		}
		return str.substring(x+1,y);
	}
}
