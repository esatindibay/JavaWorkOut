package Java50;
//153,371...
public class isAms {

	public static void main(String[] args) {

		System.out.println(isAmstrong(371));
	}
	
	public static boolean isAmstrong(int n){
			int remain = 0;
			int result = 0;
			int hold = n;
		while(hold!=0){
			remain = hold%10;
			result +=remain*remain*remain;
			hold /=10;
		}
		return result == n;
		
	}

}
