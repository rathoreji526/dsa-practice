package leetcodeTop75;

/// leetcode 345
//Given a string s, reverse only all the vowels in the string and return it.

//The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

public class ReverseVowels {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);

        int left = 0 , right = s.length()-1;
        while(left < right){
            while(left < right && !isVowel(sb.charAt(right))) right--;
            while(left < right && !isVowel(sb.charAt(left))) left++;

            char temp = sb.charAt(left);
            sb.setCharAt(left , sb.charAt(right));
            sb.setCharAt(right , temp);
            left++;
            right--;
        }
        return sb.toString();
    }
    private boolean isVowel(char c){
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        ReverseVowels rv = new ReverseVowels();
        String res = rv.reverseVowels("IceCreAm");
        System.out.println(res);
    }
}
