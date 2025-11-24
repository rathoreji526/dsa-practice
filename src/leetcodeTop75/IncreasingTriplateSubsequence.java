package leetcodeTop75;

//Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.


public class IncreasingTriplateSubsequence {

    public static void main(String[] args) {
        Solution_IncreasingTriplateSubsequence SI = new Solution_IncreasingTriplateSubsequence();
         boolean res = SI.increasingTriplet(new int[] {1,2,3,4,5}); //true  // 5,4,3,2,1 //false;
        System.out.println(res);
    }
}

class Solution_IncreasingTriplateSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int x : nums) {
            if (x <= first) {

                first = x;
            } else if (x <= second) {

                second = x;
            } else {

                return true;
            }
        }
        return false;
    }
}
