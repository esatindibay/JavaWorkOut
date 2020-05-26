package OOPs;

public class overloading {

	public static void main(String[] args) {
		
System.out.println(mult(2,5));
System.out.println(mult(2,5,8));
	}
	public static int mult(int a, int b){
		return a+b;
	}
	
	public static int mult(int a, int b, int c){
		return a+b+c;
	}

	

}
