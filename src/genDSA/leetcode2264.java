package genDSA;
import java.util.*;
// largest 3-same digit number in string 2264 leetcode
public class leetcode2264 {
    public static void main(String[] args){
        String str = "4818042931906802860005960222213336669500011846936171709111";
        System.out.println(largestGoodInteger(str));
    }
    public static String largestGoodInteger(String num){
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < num.length() ; i++){
            if( i!=num.length()-1 && (num.charAt(i)==num.charAt(i+1))){
                int count = 0;
                char c = num.charAt(i);
                while(i < num.length() && num.charAt(i)==c){
                    count++;
                    i++;
                }
                i-=1;

                if(count>=3){
                    if(sb.isEmpty() || ((!sb.isEmpty()) && c > sb.charAt(0))){
                        sb.setLength(0);
                        for(int j = 1 ; j <= 3 ; j++ ){
                            sb.append(c);
                        }
                    }
                }
            }
        }
        return sb.toString();
    }

}


 /*   => Rules of this question

You are given a string num representing a large integer. An integer is good if it meets the following conditions:

It is a substring of num with length 3.
It consists of only one unique digit.
Return the maximum good integer as a string or an empty string "" if no such integer exists.

Note:

A substring is a contiguous sequence of characters within a string.
There may be leading zeroes in num or a good integer.
 */
