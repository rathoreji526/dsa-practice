package leetcodeTop75;

/// Leetcode 151
//A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
//
//Return a string of the words in reverse order concatenated by a single space.
//
//Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.


public class ReverseWordsInString {
    public static void main(String[] args) {
        ReverseWordsInString s1 = new ReverseWordsInString();
        String res =  s1.reverseWords("the sky is blue");
        System.out.println(res);
    }

    void reverse(String[] list){
        int left = 0 , right = list.length-1;
        while(left < right){
            String temp = list[left];
            list[left++] = list[right];
            list[right--] = temp;
        }
    }
    public String reverseWords(String s) {
        String[] list = s.trim().split("\\s+");
        reverse(list);
        return String.join(" ", list);
    }
}
