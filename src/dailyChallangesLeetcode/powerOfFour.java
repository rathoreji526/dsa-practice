package dailyChallangesLeetcode;

public class powerOfFour {
    static boolean powOfFour(int num){
        if(num==1)return true;
        if(num<1 || num % 4 != 0)return false;
        return powOfFour(num/4);
    }
    public static void main(String[] args){
        int num = 16 ;  //num can be only 4^1/2/3/4/5/6/7/8/9......
        System.out.println(powOfFour(num));
    }
}

/*
=> rules
Given an integer n, return true if it is a power of four. Otherwise, return false.

An integer n is a power of four, if there exists an integer x such that n == 4^x.
 */