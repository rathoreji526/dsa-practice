/*
Given an integer array nums, return the number of subarrays filled with 0.

A subarray is a contiguous non-empty sequence of elements within an array.



Example 1:

Input: nums = [1,3,0,0,2,0,0,4]
Output: 6
Explanation:
There are 4 occurrences of [0] as a subarray.
There are 2 occurrences of [0,0] as a subarray.
There is no occurrence of a subarray with a size more than 2 filled with 0. Therefore, we return 6.
Example 2:

Input: nums = [0,0,0,2,0,0]
Output: 9
Explanation:
There are 5 occurrences of [0] as a subarray.
There are 3 occurrences of [0,0] as a subarray.
There is 1 occurrence of [0,0,0] as a subarray.
There is no occurrence of a subarray with a size more than 3 filled with 0. Therefore, we return 9.
Example 3:

Input: nums = [2,10,2019]
Output: 0
Explanation: There is no subarray filled with 0. Therefore, we return 0.
 */

package dailyChallangesLeetcode;

public class NumberOfZero {
    static long countSubStrings(int n){
        return (long)n*(n+1)/2;
    }

     public static long zeroFilledSubarray(int[] nums) {
        long count = 0;

        //count zeros and store subString in count variable

        for(int i = 0 ; i < nums.length; i++){
            if(nums[i]==0){
                int currCount = 0;
                while(i<=nums.length-1 && nums[i]==0){
                    currCount++;
                    i++;
                }
                i-=1;
                //formula of counting substrings of n => "n*(n+1)/2"
                count+= countSubStrings(currCount);
            }
        }
        return count;
    }
    public static void main(String[] args){

        int[] arr = {1,3,0,0,2,0,0,4};

        System.out.println(zeroFilledSubarray(arr));

    }
}
