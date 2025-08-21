package Leetcode.array.TopKFrequentElements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public int[] topKFrequent(int[] nums, int k){
       HashMap<Integer,Integer> map = new HashMap<>();

       for( int num : nums){
           map.put( num, map.getOrDefault(num,0)+1);
       }

       List<Integer>[] list = new ArrayList[nums.length+1];
       for( int val : map.keySet()) {
           int freq = map.get(val);
           if (list[freq] == null) list[freq] = new ArrayList<>();
           list[freq].add(val);
       }
        int[] result = new int[k];
        int j =0;
        for( int i = nums.length; i >= 0 && j <k; i-- ){
            if( list[i] != null) {
                for(int num : list[i]){
                    result[j] = num;
                    j++;
                }
            }
       }
        return result;
    }
}
