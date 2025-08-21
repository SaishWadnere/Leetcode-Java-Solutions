package Leetcode.array.GroupAnagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {


    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for( String s : strs){
            char[] arr = new char[26];
            for(char ch : s.toCharArray()){
                arr[ch-'a']++;
            }
            String key = String.valueOf(arr);

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }


}
