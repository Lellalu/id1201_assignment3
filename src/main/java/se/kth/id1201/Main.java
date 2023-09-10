package se.kth.id1201;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main( String[] args ) {
        benchmarkSort();
    }

    public static void benchmarkSort(){
        long startTime;
        long endTime;

        int[] unsorted_selection_sort_array;
        int[] unsorted_insertion_sort_array;
        int[] unsorted_merge_sort_array;
        int[] unsorted_quick_sort_array;
        int[] unsorted_array_sort_array;
        int repitition = 10;
        int selectionSumTime;
        int insertSumTime;
        int mergeSumTime;
        int quickSumTime;
        int arraySumTime;

        System.out.printf("# sorting an array of length n, time in ms\n");
        System.out.printf("#%12s%12s%12s%12s%12s%12s\n", "n", "selection", "insert", "merge", "quick", "array");
        for(int length=1024; length < 100000; length*=2){
            selectionSumTime = 0;
            insertSumTime = 0;
            mergeSumTime = 0;
            quickSumTime = 0;
            arraySumTime = 0;
            for(int i = 0; i <= repitition; i++){
            
                unsorted_selection_sort_array = unsortedArray(length);
                unsorted_insertion_sort_array = Arrays.copyOf(unsorted_selection_sort_array, length);
                unsorted_merge_sort_array = Arrays.copyOf(unsorted_selection_sort_array, length);
                unsorted_quick_sort_array = Arrays.copyOf(unsorted_selection_sort_array, length);
                unsorted_array_sort_array = Arrays.copyOf(unsorted_selection_sort_array, length);
                startTime = System.currentTimeMillis();
                SortAlgorithms.selectionSort(unsorted_selection_sort_array);
                endTime = System.currentTimeMillis();
                selectionSumTime += endTime-startTime;


                startTime = System.currentTimeMillis();
                SortAlgorithms.insertionSort(unsorted_insertion_sort_array);
                endTime = System.currentTimeMillis();
                insertSumTime += endTime-startTime;

                startTime = System.currentTimeMillis();
                SortAlgorithms.mergeSort(unsorted_merge_sort_array);
                endTime = System.currentTimeMillis();
                mergeSumTime += endTime-startTime;

                startTime = System.currentTimeMillis();
                SortAlgorithms.quickSort(unsorted_quick_sort_array);
                endTime = System.currentTimeMillis();
                quickSumTime += endTime-startTime;

                startTime = System.currentTimeMillis();
                Arrays.sort(unsorted_array_sort_array);
                endTime = System.currentTimeMillis();
                arraySumTime += endTime-startTime;;
            }
            System.out.printf("%13d", length);
            System.out.printf("%12.2f", (double)selectionSumTime/repitition);
            System.out.printf("%12.2f", (double)insertSumTime/repitition);
            System.out.printf("%12.2f", (double)mergeSumTime/repitition);
            System.out.printf("%12.2f", (double)quickSumTime/repitition);
            System.out.printf("%12.2f\n", (double)arraySumTime/repitition);
        }
    }

    public static int[] unsortedArray(int n){
        Random r = new Random();
        int[] array = new int[n];
        for(int i = 0;i < n; i++){
            array[i] = r.nextInt(100000000);
        }
        return array;
    }
}
    