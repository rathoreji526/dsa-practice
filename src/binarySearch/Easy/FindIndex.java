package binarySearch.Easy;

public class FindIndex {

    public  static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 10, 12, 17, 19, 22, 30};
        int x = 19; // number to find in array
        int si = 0, ei = arr.length - 1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (arr[mid] == x) {
                System.out.print(mid);
                return;
            }
            if(arr[mid]<x)si = mid+1;
            else ei = mid-1;
        }
        System.out.print(-1); // if index not found!
    }
}

// => find index using binary search

