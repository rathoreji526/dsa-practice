package leetcodeTop75;
///leetcode 238
//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//You must write an algorithm that runs in O(n) time and without using the division operation.

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int[] input = {1,2,3,4};
        int[] arr;
        arr = productOfArrayExceptSelf.productExceptSelf(input);
        for(int a : arr) System.out.print(a+" ");
    }
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        //step 1 : prefix product
        res[0] = 1;
        for(int i = 1 ; i < n ; i++){
            res[i] = nums[i-1] * res[i-1];
        }

        //step 2 : suffix product
        int suffix = 1;
        for(int i = n-1 ; i >= 0 ; i--){
            res[i] = res[i] * suffix;
            suffix *= nums[i];
        }
        return res;
    }
}
