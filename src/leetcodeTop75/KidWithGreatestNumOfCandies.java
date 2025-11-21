package leetcodeTop75;

import java.util.ArrayList;
import java.util.List;

 class Solution_KidWithGreatestNumOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>(candies.length);
        int max = 0;
        for(int candy : candies)max = Math.max(max , candy);

        for(int candy : candies){
            res.add(candy+extraCandies >= max);
        }
        return res;
    }
}
public class KidWithGreatestNumOfCandies {

    public static void main(String[] args) {
        Solution_KidWithGreatestNumOfCandies s = new Solution_KidWithGreatestNumOfCandies();
        int[] candies  = {2,3,5,1,3};
        int extraCandies = 3;

        s.kidsWithCandies(candies , extraCandies);
    }
}
