/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw1;

/**
 *
 * @author furkan
 */
public class H_QuickSort {

    /* This function takes first element as pivot, and
       places all the elements smaller than the pivot on the
       left side and all the elements greater than the pivot
       on the right side. It returns the index of the last
       element on the smaller side*/
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low - 1, j = high + 1;

        while (true) {
            // Find leftmost element greater
            // than or equal to pivot
            do {
                i++;
            } while (arr[i] < pivot);

            // Find rightmost element smaller
            // than or equal to pivot
            do {
                j--;
            } while (arr[j] > pivot);

            // If two pointers met.
            if (i >= j) {
                return j;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            // swap(arr[i], arr[j]);
        }
    }

    /* The main function that implements QuickSort
    arr[] --> Array to be sorted,
    low --> Starting index,
    high --> Ending index */
    static void sort(int[] arr, int low, int high) {
        
        if (low < high) {  
            /* pi is partitioning index,
            arr[p] is now at right place */
            
            int pi = partition(arr, low, high);
            
            if (pi - low <= high - (pi + 1)){
                sort(arr, low, pi);
                low = pi + 1;
            } else {
                sort(arr, pi+1, high);
                high = pi;
            }
            
        }
    }
}