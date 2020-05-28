package javaExercises;

public class inter {

	public static void main(String[] args) {
		String name = "esati";
		//c1e1n1
		System.out.println(test(name));

	}
	
	public static String test(String s){
		
		String str = "";
		String result = "";
		for(int i=0; i<s.length(); i++){
		
				if(!str.contains(s.substring(i,i+1))){
					str+=s.substring(i,i+1);	
			}
		}
		
		for(int i=0; i<str.length(); i++){
			int count=0;
			for(int j=0; j<s.length(); j++){
				if(str.charAt(i)==s.charAt(j)){
					count++;
				}
			}	result+=str.substring(i,i+1) + count;
		}
		return result;
		
	}
	
	

}
