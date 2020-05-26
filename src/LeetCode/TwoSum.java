package LeetCode;

import java.util.Arrays;

/*
Given an array of integers, 
return indices of the two numbers
 such that they add up to a specific target.

You may assume that each input
 would have exactly one solution,
  and you may not use the same element twice.
 */
public class TwoSum {

	public static void main(String[] args) {
	
		System.out.println(Arrays.toString(twoSum(new int[]{1,5,12,8,7,10,3,2,1},17)));
	}
	
	 public static int[] twoSum(int[] nums, int target) {
	        
	        int[] result = new int[2];
	        
	        for(int i=0; i<nums.length; i++){
	            
	            for(int j =0; j<nums.length; j++){
	                
	                if(nums[i]+nums[j] == target){
	                    result[0] = i;
	                    result [1] = j;
	                   
	                }
	             
	             
	            }
	        }
	        return result;
	 }
}

