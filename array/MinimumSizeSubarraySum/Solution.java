package Leetcode.array.MinimumSizeSubarraySum;

public class Solution {
    public int minSubArrayLen(int target, int[] nums){
        int sum=0;
        int length=Integer.MAX_VALUE;
        int i=0;

        for(int j=0; j< nums.length ; j++){
            sum += nums[j];
            while( sum >= target){
                length = Math.min(length,j-i+1);
                sum = sum - nums[i];
                i++;
            }
        }
        if( length == Integer.MAX_VALUE ) return 0;
        return length;

    }
}
