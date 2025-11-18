package sliding_window;

import java.util.HashMap;

public class LongestSubstringWhthoutRepeatingChar {
    static void solution(String str){
        HashMap<Character , Integer> map = new HashMap<>();
        int maxLen = 0;
        int  n = str.length() , i = 0 , j = 0;

        while(i < n && j < n){

            char c = str.charAt(j);
            if(map.containsKey(c) && map.get(c)>=i){
                    i = map.get(c)+1;
            }
                map.put(c , j);

            maxLen = Math.max(maxLen , j-i+1);
            j++;
        }
        System.out.println(maxLen);

    }
    public static void main(String[] args) {
        solution("aaa");
    }
}