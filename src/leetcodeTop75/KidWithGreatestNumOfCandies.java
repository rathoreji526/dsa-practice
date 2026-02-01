package leetcodeTop75;

import java.util.ArrayList;
import java.util.List;

 class KidWithGreatestNumOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>(candies.length);
        int max = 0;
        for(int candy : candies)max = Math.max(max , candy);

        for(int candy : candies){
            res.add(candy+extraCandies >= max);
        }
        return res;
    }

    public static void main(String[] args) {
        KidWithGreatestNumOfCandies s = new KidWithGreatestNumOfCandies();
        int[] candies  = {2,3,5,1,3};
        int extraCandies = 3;

        List<Boolean> res = s.kidsWithCandies(candies , extraCandies);

        System.out.print("Result:[ ");
        for(boolean b : res){
            System.out.print(b+" ");
        }
        System.out.println("]");
    }
}
