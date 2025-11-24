package Sorting_Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        char[] c = {'a' , 'b' , 'c' , 'd'};

        char[] c2 = {'c', 'd'};

        c = c2;
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        c = sb.toString().toCharArray();
//        System.out.println(String.val);

        System.out.println(c);

    }
}
