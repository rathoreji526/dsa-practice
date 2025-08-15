package binarySearch.Easy;

//Q:- largest 3-same digit number in string 2264 leetcode
public class leetcode2264 {
    public static void main(String[] args){
        String str = "4818042931906802860005960222213336669500011846936171709111";
        System.out.println(largestGoodInteger(str));
    }
    public static String largestGoodInteger(String num){
        StringBuilder sb = new StringBuilder(); // created string builder for less time & space complexity

        for(int i = 0 ; i < num.length() ; i++){  // iterate on every char
            if( i!=num.length()-1 && (num.charAt(i)==num.charAt(i+1))){ // if two same char found check char till length-1
                int count = 0;
                char c = num.charAt(i);
                while(i < num.length() && num.charAt(i)==c){ // check and increase count
                    count++;
                    i++;
                }
                i-=1; // set i at its correct position

                if(count>=3){ // if count is at least 3
                    if(sb.isEmpty() || ((!sb.isEmpty()) && c > sb.charAt(0))){ // check the condition and if found num grater then prev replace it
                        sb.setLength(0); // if there is any string empty it first
                        for(int j = 1 ; j <= 3 ; j++ ){
                            sb.append(c);
                        }
                    }
                }
            }
        }
        return sb.toString(); // returned the final string
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
