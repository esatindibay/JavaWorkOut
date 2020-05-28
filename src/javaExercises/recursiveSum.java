package javaExercises;
//For function sumtok, write the missing recursive call.
//This function returns the sum of the values from 1 to k.
public class recursiveSum {

	public static void main(String[] args) {
		System.out.println(sumtok(11));
	}
	public static int sumtok(int k) {
	    if(k==1){
	    return 1;
	    }
	  if (k <= 0) {
	    return 0;
	  } else {
	      
	    return sumtok(k-1) + k;
	  }
	}

	public static int sumTok(int n){
		
		if(n%2==0){
			return (n/2)*(n+1);
		}
		else{
			return n*((n+1)/2);
		}
	}
}
