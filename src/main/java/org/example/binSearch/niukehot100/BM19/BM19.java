package org.example.binSearch.niukehot100.BM19;

public class BM19 {
//   1 2 1 3 5 6 4
    public int findPeakElement (int[] nums) {
        int left=0;
        int right=nums.length-1;
        while (left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]<nums[mid+1]){
                left=mid+1;
            }else {
//                right=left;
                right=mid;
            }
        }
        return  left;
        // write code here
    }
     public static void main(String[] args){

     }
}
