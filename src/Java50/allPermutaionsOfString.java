package Java50;

import java.util.HashSet;
import java.util.Set;

public class allPermutaionsOfString {

	public static void main(String[] args) {
	System.out.println(permutationFinder("esat"));
	}
	
	    public static Set<String> permutationFinder(String str) {
	        Set<String> perm = new HashSet<String>();
	        if (str == null) {
	            return null;
	        } else if (str.length() == 0) {
	            perm.add("");
	            return perm;
	        }
	        char initial = str.charAt(0); // first character
	        String remain = str.substring(1); // Full string without first character
	        Set<String> words = permutationFinder(remain);
	        for (String strNew : words) {
	            for (int i = 0;i<=strNew.length();i++){
	                perm.add(charInsert(strNew, initial, i));
	            }
	        }
	        System.out.println(perm.size());
	        return perm;
	    }
	    
	    public static String charInsert(String str, char c, int j) {

	        String begin = str.substring(0, j);
	        String end = str.substring(j);
	        return begin + c + end;
	    }

	    
}
