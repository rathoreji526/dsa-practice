package leetcodeTop75;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Solution_ProductOfArrayExceptSelf productOfArrayExceptSelf = new Solution_ProductOfArrayExceptSelf();
        int[] input = {1,2,3,4};
        int[] arr;
        arr = productOfArrayExceptSelf.productExceptSelf(input);
        for(int a : arr) System.out.print(a+" ");
    }
}
class Solution_ProductOfArrayExceptSelf {
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
