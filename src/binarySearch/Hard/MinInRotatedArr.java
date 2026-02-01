package binarySearch.Hard;

public class MinInRotatedArr {
    static int solution(int[] arr){
        int start = 0 , end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[end]) start = mid+1;
            else if(arr[mid]<arr[start]) end = mid;
            else end--;
        }
        return arr[start];
    }
    public static void main(String[] args){
        int[] arr = {2,2,2,0,1}; // before rotation {0, 1, 2 ,2 ,2};
        System.out.println(solution(arr));
    }
}
