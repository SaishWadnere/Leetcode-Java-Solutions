package Leetcode.array.GenerateParenthesis;

import java.util.ArrayList;
import java.util.List;

public class Solution {


    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        recurse(result,0,0 ,n,"");
        return result;
    }

    private void recurse(List<String> res,int i ,int j,int n, String str){
        if( str.length() == 2*n){
            res.add(str);
            return;
        }

        if( i < n){
            recurse(res, i+1,j,n,str+'(');
        }

        if( j < i){
            recurse(res,i,j+1,n, str+')');
        }
    }


}
