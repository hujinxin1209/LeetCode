package kSum;

import java.util.Arrays;
import java.util.LinkedList;

//Given an array nums of n integers, are there elements a, b, c in nums 
//such that a + b + c = 0? Find all unique triplets in the array 
//which gives the sum of zero.
//The solution set must not contain duplicate triplets.
//
//Given array nums = [-1, 0, 1, 2, -1, -4],
//
//A solution set is:
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]

import java.util.List;

public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums){
		Arrays.sort(nums);
		List<List<Integer>> res = new LinkedList<List<Integer>>();
		for(int i = 0; i < nums.length; i++) {
			if(i > 0 && nums[i]== nums[i-1] ) continue;
			int l = i + 1;
			int r = nums.length - 1;
			int sum = 0 - nums[i];
			while(l < r) {
				if(nums[l] + nums[r] == sum) {
					res.add(Arrays.asList(nums[i], nums[l++], nums[r--]));
					while(r > l && nums[l] == nums[l-1]) l++;
					while(r > l && nums[r] == nums[r+1]) r--;
				} else if(nums[l] + nums[r] > sum) {
					r--;
				} else {
					l++;
				}
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] nums = new int[] {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> res = threeSum(nums);
		System.out.println(Arrays.toString(res.toArray()));
	}
}
