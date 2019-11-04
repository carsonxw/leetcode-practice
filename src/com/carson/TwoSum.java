package com.carson;

import java.util.HashMap;

public class TwoSum {
    /**
     * tc: O(n), sc: O(n)
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSumWithHaspMap(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len ; i++) {
            final Integer value = map.get(nums[i]);
            if ( value != null ) {
                return new int[] {value ,i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }

    /**
     * Two sum with brute force method
     * tc: O(n^2) = n, sc: O(1)
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSumWithBruteForce(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len ; j++ ) {
                if (nums[j] == target - nums[i]) {
                    return new int[] {i ,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
