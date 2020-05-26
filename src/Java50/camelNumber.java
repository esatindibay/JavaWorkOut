package Java50;

public class camelNumber {

	public static void main(String[] args) {
	String a ="esatIndibayBogaziciUniversity";
	String b ="barlaHanimIstanbul";
	System.out.println(camel(b));

	}
	
	public static int camel(String str){
		
		int c = 1;
		
		for(int i=0; i<str.length(); i++){
			if(Character.isUpperCase(str.charAt(i)))
				c++;
		}
		return c;
	}

}
