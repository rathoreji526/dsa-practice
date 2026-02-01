package binarySearch.Medium;

public class SearchIn2DMat {
    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0 ; i < matrix.length ; i++){
            int si = 0 , ei =matrix[0].length-1;
            while(si<=ei){
                int mid = si+(ei-si)/2;
                if(matrix[i][mid]==target) return true;
                if(matrix[i][mid]<target) si = mid+1;
                else ei = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[][] mat = {
                {1 , 4 , 6 , 8},
                {3 , 5 , 7 , 9},
                {10 , 11 , 16 , 20},
                {23 , 30 , 34 , 60}
        };
        int target = 0;
        System.out.println(searchMatrix(mat , target));
    }
}
