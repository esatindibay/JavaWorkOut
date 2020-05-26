package javaExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class inter2 {

	public static void main(String[] args) {
	String x= "Ah benim garib vatanim Ah benim uniformami aldiniz benim hayallerimi..."
			+ " alamayacaksiniz ama coklarinin canini aldiniz ah ulen ah";
	//output should be -->  Ah2 benim3 garib1 vatanim1 ...
	System.out.println(test(x));
	}
	
	public static String test(String str){
		List<String> slist = new ArrayList<String>(Arrays.asList(str.split(" ")));
		Set<String> uniq = new LinkedHashSet<String>(Arrays.asList(str.split(" ")));
		String result = "";

		for(String s : uniq){
			int count = 0;
			for(int j=0; j<slist.size(); j++){
				if(s.equals(slist.get(j))){
					count++;
				}
			}
			result+=s+count+ " \n ";
		}
		
		return result;
		
	}

}
