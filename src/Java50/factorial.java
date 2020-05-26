package Java50;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(factR(8));
	}
	
	public static int fact(int n){

		int result = 1;
		for(int i=1; i<=n; i++){
			
			result *=i;
			
		}
		return result;
		
	}

	
	public static int factR(int n){
		if (n==0 || n == 1) return 1;
		return factR(n-1)*n;
	}
}
