package Java50;

public class integerPalindrome {

	public static void main(String[] args) {
		System.out.println(isPal(1218));	
	}
	
	public static boolean isPal(int x){
		int reverse = 0;
		int remain = 0;
		int hold = x;
		while(hold!=0){
			remain = hold%10;
			reverse = reverse*10 + remain;
			hold /=10;
		}
		return reverse == x ; 
		
	}

}
