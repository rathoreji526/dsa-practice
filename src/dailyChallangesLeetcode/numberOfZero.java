package dailyChallangesLeetcode;

public class numberOfZero {
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
