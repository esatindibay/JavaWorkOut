package Java50;

import java.util.Arrays;
import java.util.List;

public class reverseArray {

	public static void main(String[] args) {
	//	int[] x = {5,6,9,2};
		List<Integer> l = Arrays.asList(5,6,9,2,9,8,7,78,51,3);
		
		System.out.println(l);
		int hold = 0;
		for(int i=0; i<l.size()/2; i++){
			hold = l.get(i);
			l.set(i, l.get(l.size()-1-i));
			l.set(l.get(l.size()-1-i), hold);
		}
		System.out.println(l);

	}

}
