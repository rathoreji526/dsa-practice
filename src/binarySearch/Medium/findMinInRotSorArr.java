package binarySearch.Medium;

public class findMinInRotSorArr {
    static int searchMin(int[] arr){
        int si = 0 , ei = arr.length-1;
        while(si < ei){
            int mid = si+(ei-si)/2;
            if(arr[mid]>arr[ei]){
                si = mid+1;
            }else ei = mid;
        }
        return arr[si];
    }
    public static void main(String[] args){
        int[] arr = {4 , 5 , 6 , 7 , 8 , 1 , 2 , 3};
        System.out.println(searchMin(arr));
    }
}
