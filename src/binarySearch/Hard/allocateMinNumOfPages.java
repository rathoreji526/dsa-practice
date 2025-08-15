package binarySearch.Hard;

//Q:- Allocate Minimum Number Of Pages "Accio Jobs"

public class allocateMinNumOfPages {
    //function to check at specific load is it possible to distribute load to all students!
    public static boolean isPossible(int[] arr ,int students ,  long maxLoad){
        int currStudents = 1;
        long currLoad = 0;

        for(int i = 0 ; i < arr.length ; i++){
            currLoad+=arr[i];

            if(currLoad>maxLoad){
                currStudents++;
                currLoad = arr[i];
            }
            if(currStudents>students){
                return false;
            }
        }
        return true;
    }
    public static long minPages(int[] arr , int students){
        if(arr.length<students)return -1; // can't distribute books
        long si = 0 , ei = 0 , ans = 0;
        // find start and end
        for(long a : arr){
            si = Math.max(si , a);
            ei += a;
        }
        //apply binary search
        while(si<=ei){
            long maxLoad = si+(ei-si)/2;
            if(isPossible(arr , students , maxLoad)){
                ans = maxLoad;
                ei = maxLoad-1;
            }else si = maxLoad+1;
        }
        return ans;
    }
    public static void main(String[] args){
        int students = 2;
        int[] arr = {12 , 34 , 67 , 90};
        long ans = (minPages(arr , students));
        System.out.print(ans);
    }
}

/* =>rules & input output

You are given N number of books. Every ith book has A[i] number of pages.

You have to allocate contagious books to M number of students. There can be many ways or permutations to do so. In each permutation, one of the M students will be allocated the maximum number of pages. Out of all these permutations, the task is to find that particular permutation in which the maximum number of pages allocated to a student is minimum of those in all the other permutations and print this minimum value.

Each book will be allocated to exactly one student. Each student has to be allocated at least one book

Input Format
First line contains a two integers N denoting number of books and M number of students

Second Line contains N integers where ith integer denotes number pages in ith book

Output Format
Print minimum value of maximum number of pages allocated to any one student

Example 1

Input
4 2
12 34 67 90
Output
113

*/
