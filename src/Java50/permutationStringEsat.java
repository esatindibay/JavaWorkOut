package Java50;

import java.util.HashSet;
import java.util.Set;

public class permutationStringEsat {

	public static void main(String[] args) {
		System.out.println(mix("esatindibay",6,'e'));
		System.out.println(perm("ahmet"));
	}
	
	public static Set<String> perm(String str){
		Set<String> s = new HashSet<>();
		if(str.equals(null)) return null;
		else if(str.length()==0){
			s.add("");
			return s;
		}
		char first = str.charAt(0);
		String remain = str.substring(1);
		Set<String> r = perm(remain);
		for(String letters : r){
			for(int i=0; i<=letters.length(); i++){
				s.add(mix(letters,i,first));
			}
		}
		return s;
	}
	
	public static String mix(String str, int i, char c){
		return (str.substring(0,i) + Character.toString(c) + str.substring(i));
	}

}
