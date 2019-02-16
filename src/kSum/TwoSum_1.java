package kSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Given an array of integers, return indices of the two numbers such 
//that they add up to a specific target.
//
//You may assume that each input would have exactly one solution, 
//and you may not use the same element twice.
//
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].
public class TwoSum_1 {
	public static int[] twoSum1(int[] nums, int target) {
		for(int i = 0; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i]+ nums[j] == target ) {
					return new int[] {i,j};
				}
			}
		}
		return null;
	}
	
	public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
        		map.put(nums[i], i);
        }
        for(int j = 0; j < nums.length; j++) {
        		int temp = target - nums[j];
        		if(map.containsKey(temp) && map.get(temp) != j) {
        			return new int[] {j, map.get(temp)};
        		}
        }
		return null;
    }
	
	public static int[] twoSum3(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++) {
			int temp = target - nums[i];
			if(map.containsKey(temp)) {
				return new int[] {map.get(temp), i};
			}
			map.put(nums[i], i);
		}
		return null;
	}
	
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 23, 54, 6};
		int[] a = twoSum3(nums, 8);
		System.out.println(Arrays.toString(a));
	}
}
