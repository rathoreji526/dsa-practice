package leetcodeTop75;
//Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

public class CanPlaceFlower {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;

        for(int i = 0 ; i < len ; i++){
            if(n==0)break;
            int curr = flowerbed[i];

            //single element case
            if(len==1){
                if(curr==0){
                    flowerbed[0]=1;
                    n--;
                    break;
                }
            }//edge element case
            else if(i==0 || i==len-1){
                if(i==0 && curr==0 && flowerbed[i+1]==0){   // starting element
                    flowerbed[i] = 1;
                    n--;
                }else if(i==len-1 && flowerbed[len-1]==0 && flowerbed[len-2]==0){ //last element
                    flowerbed[i] = 1;
                    n--;
                }
            }else{
                //at any point check left and right and place flower
                if(curr !=1 && flowerbed[i-1]!=1 && flowerbed[i+1]!=1){
                    flowerbed[i++] = 1;
                    n--;
                }
            }

        }
        return n<=0;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1};
        int n = 1;
        System.out.println(canPlaceFlowers(arr , n));
    }
}
