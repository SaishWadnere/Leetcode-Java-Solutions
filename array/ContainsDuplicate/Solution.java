package Leetcode.array.ContainsDuplicate;

import java.util.HashSet;

public class Solution {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for( int num : nums){
            if(set.contains(num)) return  true;
            set.add(num);
        }
        return false;
    }
}


