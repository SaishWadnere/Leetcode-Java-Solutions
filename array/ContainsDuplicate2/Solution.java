package Leetcode.array.ContainsDuplicate2;

import java.util.HashSet;

public class Solution {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (set.contains(nums[j])) {
                return true;
            }
            set.add(nums[j]);

            if (j - i >= k) {
                set.remove(nums[i]);
                i++;
            }
        }
        return false;
    }
}

