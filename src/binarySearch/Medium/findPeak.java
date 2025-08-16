//problem number: 162 : leetcode

package binarySearch.Medium;

public class findPeak {
    public static int findPeakEl(int[] arr){
        int start = 0 , end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){ // peak element is avaliable in right side
                start = mid+1;
            }else end = mid; // else mid can be the peak element or peak element is avaliable in the left
        }
        return start;
    }
    public static void main(String[] args){
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println(findPeakEl(arr));
    }
}

/*
=> Question:

A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.

 */
