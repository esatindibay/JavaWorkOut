package Java50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class palindrome {

	public static void main(String[] args) {
	String txt = "adakada";
	String rev = reverse(txt);
	System.out.println(txt + "  ---->  " + rev);
	System.out.println(isPal2(txt));
	}
	
	public static String reverse(String str){
		
		String result ="";
		List<String> lis = new ArrayList<String>(Arrays.asList(str.split("")));
		
		for(String x : lis){
			
			result = x+result;
		}
		return result;
		
	}
	public static boolean isPal(String str){

		return str.equals(reverse(str));
	}
	public static boolean isPalB(String str){
// its mutable
		
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString().equals(str);
		
	}
	
	 private static boolean isPal2(String str) {
	        for (int i = 0; i < str.length() / 2; i++) {
	            if (str.charAt(i) != str.charAt(str.length() - i - 1))
	                return false;
	        }
	        return true;
	    }
}
