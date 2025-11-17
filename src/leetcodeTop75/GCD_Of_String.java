package leetcodeTop75;
/*
 * Greatest Common Divisor of Strings
 *
 * Definition:
 * For two strings s and t, "t divides s" if and only if:
 *      s = t + t + t + ... + t   (t repeated one or more times)
 *
 * Goal:
 * Given two strings str1 and str2, return the largest string x
 * such that x divides both str1 and str2.
 *
 * Key Insight:
 * Two strings have a valid common divisor string only when:
 *
 *      (str1 + str2).equals(str2 + str1)
 *
 * If this condition is false, then no common repeating pattern exists
 * and the result must be an empty string ("").
 *
 * Why this works:
 * - If both strings are formed from the same base pattern,
 *   then concatenating them in any order produces the same result.
 *
 * Examples:
 *  str1 = "ABCABC", str2 = "ABC"     → base pattern = "ABC"
 *  str1 = "ABABAB", str2 = "ABAB"    → base pattern = "AB"
 *  str1 = "LEET",    str2 = "CODE"   → no common pattern
 *
 * Step to find the largest divisor string:
 * 1. Check: (str1 + str2).equals(str2 + str1)
 *      - If false → return ""
 *
 * 2. If true:
 *      - Compute gcd(len(str1), len(str2))
 *      - The gcd value gives the length of the largest possible divisor string
 *
 * 3. Final answer:
 *      str1.substring(0, gcd_length)
 *
 * This substring is the largest string that divides both str1 and str2.
 */




public class GCD_Of_String {
    public static String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals( str2+str1))return "";
        return str1.substring(0 , GCD(str1.length(),str2.length()));
    }
     static int GCD(int a , int b){
        if(b==0)return a;
        return GCD(b , a%b);
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC" , "ABC"));
    }
}
