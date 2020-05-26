package Java50;
/*
Write a Java program to print the Fibonacci
 series up to a given number or create
  a simple Java program to calculate
   Fibonacci number
 */
public class fibonacci {

	public static void main(String[] args) {
		
	System.out.println(fib2(10));
	
	}
	
	public static int fib(int n){
		if(n==1 || n==2){
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}
	public static void writeFib(int n){
		for (int i=1; i<=n; i++){
			System.out.print(fib(i) + "  ");
		}
	}

	
	public static int fib2(int n){
		if(n==0) return 0;
		if(n==1 || n==2) return 1;
		int x =1;
		int y=1;
		int z = 1;
		for(int i=3; i<=n; i++){
			x = y+z;
			y = z; 
			z = x;

		}	
		return z;
	}
	
}
