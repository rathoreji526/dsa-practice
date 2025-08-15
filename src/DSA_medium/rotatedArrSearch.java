package DSA_medium;

public class rotatedArrSearch {

        public static boolean search(int[] nums, int target) {
            int si = 0 , ei = nums.length-1;
            while(si<=ei){
                int mid = si+(ei-si)/2;
                if(nums[mid]==target)return true;
                // handle duplicates
                if (nums[si] == nums[mid]) {
                    si++;
                    continue;
                }
                // if no duplicates found
                if(nums[si]<=nums[mid]){ // mean left part is sorted
                    if(target>=nums[si] && target<nums[mid]){
                        ei = mid-1;
                    }else si = mid+1;
                }else{
                    if(target>nums[mid] && target <= nums[ei]){
                        si = mid+1;
                    }else ei = mid-1;
                }
            }
            return false;
        }

    public static void main(String[] args){
        int[] arr = {2,5,6,0,0,1,2};
        int target = 3;
        System.out.println(search(arr , target));
    }
}
