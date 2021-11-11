package org.manticorps.I01_sum;

import java.util.HashMap;

/**
 * source : https://leetcode.com/problems/two-sum/
 */
public class SumSolution {

    public static int[] solution1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }

    public static int[] solution2(int[] nums, int target) {

        HashMap<Integer, Integer> hashSet = new HashMap<>();

        int index = 0;
        for (int num : nums) {

            Integer diffToReachTarget = target - num;
            Integer diffIndex = hashSet.get(diffToReachTarget);
            if (diffIndex != null) {
                return new int[]{diffIndex, index};
            }
            hashSet.put(num, index++);
        }

        return new int[]{};
    }
}
