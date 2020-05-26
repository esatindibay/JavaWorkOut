package Java50;

import java.util.HashMap;
import java.util.Map;

public class findFrstUniq {

	public static void main(String[] args) {
	String test = "abcvsaesbekfcc";   // return 3 or v
	
	
	System.out.println(firstUnique2(test));

	}
	
	public static String firtsUnique(String str){

		Map<Character,Integer> m = new HashMap<>();
		
		for(int i=0; i<str.length(); i++){
			
			if(!m.containsKey(str.charAt(i))){
				m.put(str.charAt(i), i);
			}
			else{
				m.put(str.charAt(i), -1);
			}
		}
		
		int min = Integer.MAX_VALUE;
		for(char c : m.keySet()){
			if(m.get(c)> -1 && m.get(c)<min){
				min = m.get(c);
			}
		}
		//return min;
		return str.substring(min,min+1);
	}

	
	public static Character firstUnique2(String str){
		
		for(int i=0; i<str.length(); i++){
			
			if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){
				
				return str.charAt(i);
			}
		}
		return '-';
		
	}
}
