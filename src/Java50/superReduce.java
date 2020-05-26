package Java50;

import java.util.Scanner;

public class superReduce {

	public static void main(String[] args) {
		System.out.println(reduce("abbacddd"));
		    }
		
	
	public static String reduce(String str){
		
		
		for(int i=1; i<str.length(); i++){
			
			if(str.charAt(i)==str.charAt(i-1)){
				str = str.substring(0,i-1) + str.substring(i+1);
				i=0;
			}
			
		}
		return str.length()==0? "empty string":str;
		
	}
	}











//Scanner scanner = new Scanner(System.in);
//String str = scanner.next();
//for (int i = 1; i < str.length(); i++) {
//    if (str.charAt(i) == str.charAt(i-1)) {
//        str = str.substring(0, i-1) + str.substring(i+1);
//        i = 0;
//    }
//}
//if (str.length() == 0) {
//    System.out.println("Empty String");
//} else {
//    System.out.println (str);
//}
//scanner.close();