package Java50;

public class prime {

	public static void main(String[] args) {
		int x = 1222454541;
	
		System.out.println(isPrime(x));
		

	}
	
	public static boolean isPrime(int n){ // this is faster!!
		boolean result = true;
		int sqt = (int)Math.sqrt(n)+1;	
		for(int i=2; i<sqt; i++){
			if(n%i==0){
				result = false;
			}
		}
		return result;
	}

	public static boolean isPrime2(int n){// if the number is 56546123215 then it lasts a lot
		boolean result = true;
		for(int i=2; i<n; i++){
			if(n%i==0){
				result = false;
			}
		}
		return result;
	}
}
