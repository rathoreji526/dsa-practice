/*
 Definition:-
       Bubble Sort is a simple comparison-based sorting algorithm. It works by repeatedly swapping adjacent elements if they are in the wrong order. The largest elements 'bubble up' to the end of the array after each pass. This process continues until the array is completely sorted.
 --------------------------------------------------------------------------------------------------------------------------------------------
 How it works:-
       In Bubble Sort, we compare each pair of adjacent elements and swap them if they are in the wrong order. After the first full pass through the array, the largest element is moved to the end. We then repeat the process for the remaining elements until the whole array is sorted.

---------------------------------------------------------------------------------------------------------------------------------------------
 Example:-


 Let’s say we have this array:
[5, 3, 8, 4, 2]

Let me walk you through how Bubble Sort works step by step:

First pass:

Compare 5 and 3 → Swap → [3, 5, 8, 4, 2]

Compare 5 and 8 → No swap

Compare 8 and 4 → Swap → [3, 5, 4, 8, 2]

Compare 8 and 2 → Swap → [3, 5, 4, 2, 8]

Second pass:

Compare 3 and 5 → No swap

Compare 5 and 4 → Swap → [3, 4, 5, 2, 8]

Compare 5 and 2 → Swap → [3, 4, 2, 5, 8]

Third pass:

Compare 3 and 4 → No swap

Compare 4 and 2 → Swap → [3, 2, 4, 5, 8]

Fourth pass:

Compare 3 and 2 → Swap → [2, 3, 4, 5, 8]

Now the array is fully sorted.
--------------------------------------------------------------------------------------------------------------------------------------------
=>Time and Space complexity

Best Case	    O(n)
Average Case	O(n²)
Worst Case	    O(n²)

Best Case: When the array is already sorted. We can optimize Bubble Sort by adding a flag to stop if no swaps are made in a pass.
Space Complexity: O(1), because it’s an in-place sorting algorithm (no extra space is used).

--------------------------------------------------------------------------------------------------------------------------------------------
=>Key points

“Bubble Sort is not efficient for large datasets, but it's great for explaining basic sorting logic and teaching algorithmic thinking.”

“It is easy to understand and implement, which is why it's commonly used for learning purposes.”

“It can be optimized by checking whether any swap occurred in a pass; if no swap, we can stop early.”

--------------------------------------------------------------------------------------------------------------------------------------------

=>Summary:-
       Bubble Sort is a basic sorting algorithm that compares and swaps adjacent elements to sort an array. After each pass, the largest unsorted element moves to its correct position. It has a time complexity of O(n²), but in the best case (when the array is already sorted), it can perform in O(n) time. It's simple to implement but inefficient for large datasets.

*/

//------------------------------------------------------------------------------------------------------------------------------------------

// code:-

package Sorting_Algorithms;

public class bubbleSort {
    static void sortUsingBubbleSort(int[] arr){
        int n = arr.length;

        for(int i = 0 ; i < n-1 ; i++){

            boolean swapped = false;

            for(int j = 0 ; j < n-i-1 ; j++){

                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                    swapped = true;
                }
            }
            if(!swapped)break;
        }

    }
    public static void  main(String[] args){
        int[] arr = {5, 3, 8, 4, 2};
        //Sort the array
        sortUsingBubbleSort(arr);
        //print the array
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
