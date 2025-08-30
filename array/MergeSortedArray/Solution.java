package Leetcode.array.MergeSortedArray;

public class Solution {


    public void merge(int[] nums1,int m , int[] nums2, int n){
        int[] merged = new int[m+n];
        int i = 0;
        int j = 0;
        int k=0;
        while( i <= m -1 && j <= n -1 ){
            if( nums1[i] <= nums2[j]){
                merged[k++] = nums1[i++];
            }else{
                merged[k++] = nums2[j++];
            }
        }

        while (i <= m -1){
            merged[k++] = nums1[i++];
        }

        while (j<= n -1){
            merged[k++] = nums2[j++];
        }
        int x=0;
        for( int num : merged){
            nums1[x++] = num;
        }
    }
}
