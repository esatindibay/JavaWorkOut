package Java50;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class findDuplicatesMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findAllChars("cengiz alabacak");
		findOnlyDuplicates("cengiz alabacak");
	}
	
	public static void findAllChars(String str){
		
		char[] c = str.toCharArray();
		Map<Character,Integer> chmap = new LinkedHashMap<>();
		
		for(Character ch: c){
			if(!chmap.containsKey(ch)){
				chmap.put(ch,1);
			}
			else{
				chmap.put(ch, chmap.get(ch)+1);
			}
		}
		
		System.out.println(chmap);
		
		
	}
	public static void findOnlyDuplicates(String str){
		char[] c = str.toCharArray();
		Map<Character,Integer> chmap = new LinkedHashMap<>();
		
		for(Character ch: c){
			if(!chmap.containsKey(ch)){
				chmap.put(ch,1);
			}
			else{
				chmap.put(ch, chmap.get(ch)+1);
			}
		}
		
		Set<Map.Entry<Character,Integer>> entset = chmap.entrySet();
		for(Map.Entry<Character,Integer> x : entset){
			if(x.getValue()>1){
				System.out.printf("%s : %d %n",x.getKey(),x.getValue());
			}
			
		}
	}
}
