package org.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L2089 {

	public static void main(String[] args) {


	}

	public List<Integer> targetIndices(int[] nums, int target) {


		List<Integer> result=new ArrayList<>();
		List<Integer> nums2=new ArrayList<>();

		for (int num : nums) {
			nums2.add(num);
		}

		Collections.sort(nums2);


		for (int i = 0; i < nums2.size(); i++) {
			if(nums2.get(i)==target) result.add(i);
		}
		return result;
	}

}



