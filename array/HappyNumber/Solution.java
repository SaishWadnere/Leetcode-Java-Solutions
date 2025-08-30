package Leetcode.array.HappyNumber;

import java.util.HashSet;

public class Solution {
    public boolean isHappy( int n){
        HashSet<Integer> set = new HashSet<>();

        while( n != 1 && !set.contains(n)){
            set.add(n);
            n=square(n);
        }
        return n==1;
    }


    public int square(int n){
        int sum = 0;
        while ( n >0 ){
            int lastDigit = n%10;
            sum += lastDigit*lastDigit;
            n =n/10;
        }
        return sum;
    }

}
