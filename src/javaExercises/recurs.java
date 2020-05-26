package javaExercises;

public class recurs {

	public static void main(String[] args) {
		
		//boolean x = array6({2,6,4},0);
		
			
	}
	
	public static boolean array6(int[] nums, int index)
	{
		if(index == nums.length)
	  	return false;
	  if(nums[index] == 6)
	  	return true;
	  return array6(nums, index + 1);
	}

}
