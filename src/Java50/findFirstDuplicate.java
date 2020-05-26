package Java50;

import java.util.HashSet;
import java.util.Set;

public class findFirstDuplicate {

	public static void main(String[] args) {
 System.out.println(firstD(new int[] {1,5,6,9,4,5,8,1,2,5,2,2,4,5,1}));//5
 System.out.println(firstD(new int[] {1,2,3,6}));//-1
 System.out.println(firstD(new int[] {3,1,2,1,2,3,6}));//1
 System.out.println("*************************************");
 System.out.println(firsDup(new int[] {3,1,2,1,2,3,6}));//1		
 System.out.println(firsDup(new int[] {1,2,3,6}));//-1
 System.out.println(firsDup(new int[] {1,5,6,9,4,5,8,1,2,5,2,2,4,5,1}));//5
	}
	
	public static int firstD(int[] x){
		int min = x.length;
		
		for(int i=0; i<x.length; i++){
			for(int j=i+1; j<x.length; j++){
				if(x[i]==x[j]){
					min = Math.min(min,j);
				}
			}
		}
		if(min == x.length) return -1;
		else return x[min];
	}

	
	public static int firsDup(int[] x){
		int result = -1;
		Set<Integer> s = new HashSet<>();
		for(int i=0; i<x.length; i++){
			if(!s.contains(x[i])){
				s.add(x[i]);
			}
			else {
				result = x[i];
				break;
			}
			
		}
		return result;
	}
}
