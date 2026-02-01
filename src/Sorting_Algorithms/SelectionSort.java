/*
 Definition:-
       Selection Sort is a simple comparison-based sorting algorithm. It works by repeatedly selecting
       the smallest element from the unsorted part of the array and placing it at the beginning.
       After each pass, one element is placed at its correct sorted position.

--------------------------------------------------------------------------------------------------------------------------------------------
 How it works:-
       In Selection Sort, the array is divided into two parts: a sorted part and an unsorted part.
       Initially, the sorted part is empty. In each iteration, we find the minimum element from
       the unsorted part of the array and swap it with the first element of the unsorted part.
       This process continues until the entire array becomes sorted.

--------------------------------------------------------------------------------------------------------------------------------------------
 Example:-

       Let’s say we have this array:
       [64, 25, 12, 22, 11]

       Step-by-step working of Selection Sort:

       First pass:
       Minimum element in the array is 11
       Swap 11 with 64
       Result: [11, 25, 12, 22, 64]

       Second pass:
       Minimum element in the remaining array is 12
       Swap 12 with 25
       Result: [11, 12, 25, 22, 64]

       Third pass:
       Minimum element in the remaining array is 22
       Swap 22 with 25
       Result: [11, 12, 22, 25, 64]

       Fourth pass:
       Remaining elements are already sorted

       Final Sorted Array:
       [11, 12, 22, 25, 64]

--------------------------------------------------------------------------------------------------------------------------------------------
 => Time and Space Complexity

       Best Case      O(n²)
       Average Case   O(n²)
       Worst Case     O(n²)

       Time Complexity Explanation:
       Selection Sort always compares elements even if the array is already sorted,
       so its time complexity remains O(n²) in all cases.

       Space Complexity:
       O(1), because it is an in-place sorting algorithm and does not use extra memory.

--------------------------------------------------------------------------------------------------------------------------------------------
 => Key Points

       “Selection Sort repeatedly selects the smallest element and places it in its correct position.”

       “It performs fewer swaps compared to Bubble Sort, making it useful when swaps are expensive.”

       “Selection Sort is not a stable sorting algorithm.”

       “It is easy to understand and implement, which makes it suitable for learning purposes.”

--------------------------------------------------------------------------------------------------------------------------------------------
 => Summary:-
       Selection Sort is a simple sorting algorithm that works by selecting the minimum element
       from the unsorted part of the array and moving it to the sorted part. Although it is easy
       to understand and uses constant space, it is inefficient for large datasets due to its
       O(n²) time complexity in all cases.

*/

//------------------------------------------------------------------------------------------------------------------------------------------

// code:-


package Sorting_Algorithms;

public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        int[] arr = {8 , 5 , 3 , 9 , 3 , 2 , 4};
        obj.sort(arr);
        for(int n : arr) System.out.print(n+" ");
    }
    public  void sort(int[] arr){
        for(int i = 0 ; i < arr.length-1 ; i++){
            int minIdx = i;
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j ;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
