package se.kth.id1201;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.assertArrayEquals;

public class SortAlgorithmsTest 
    extends TestCase
{

    public void testSelectionSort()
    {
        int[] sorted_array = new int[]{46,564,24685,1345,531,573,6};
        SortAlgorithms.selectionSort(sorted_array);
        int[] expected_array = new int[]{6,46,531,564,573,1345,24685};
        assertArrayEquals(expected_array, sorted_array);

        sorted_array = new int[]{0,1,0,1};
        SortAlgorithms.selectionSort(sorted_array);
        expected_array = new int[]{0,0,1,1};
        assertArrayEquals(expected_array, sorted_array);
    }

    public void testInsertionSort()
    {
        int[] sorted_array = new int[]{46,564,24685,1345,531,573,6};
        SortAlgorithms.insertionSort(sorted_array);
        int[] expected_array = new int[]{6,46,531,564,573,1345,24685};
        assertArrayEquals(expected_array, sorted_array);

        sorted_array = new int[]{0,1,0,1};
        SortAlgorithms.insertionSort(sorted_array);
        expected_array = new int[]{0,0,1,1};
        assertArrayEquals(expected_array, sorted_array);
    }

    public void testMerge()
    {
        int[] array_1 = new int[]{6,7,8,9,1,2,3,4};
        int[] array_2 = new int[8];
        SortAlgorithms.merge(array_1, array_2, 0, 3, 7);
        int[] expected_array = new int[]{1,2,3,4,6,7,8,9};
        assertArrayEquals(expected_array, array_1);

        array_1 = new int[]{6,7,8,9,1,2,3};
        array_2 = new int[7];
        SortAlgorithms.merge(array_1, array_2, 0, 3, 6);
        expected_array = new int[]{1,2,3,6,7,8,9};
        assertArrayEquals(expected_array, array_1);

        array_1 = new int[]{99,99,0,1,0,1,99};
        array_2 = new int[7];
        SortAlgorithms.merge(array_1, array_2, 2, 3, 5);
        expected_array = new int[]{99,99,0,0,1,1,99};
        assertArrayEquals(expected_array, array_1);
    }

    public void testMergeSort()
    {
        int[] sorted_array = new int[]{46,564,24685,1345,531,573,6};
        SortAlgorithms.mergeSort(sorted_array);
        int[] expected_array = new int[]{6,46,531,564,573,1345,24685};
        assertArrayEquals(expected_array, sorted_array);

        sorted_array = new int[]{0,1,0,1};
        SortAlgorithms.mergeSort(sorted_array);
        expected_array = new int[]{0,0,1,1};
        assertArrayEquals(expected_array, sorted_array);
    }

    public void testQuickSort()
    {
        int[] sorted_array = new int[]{46,564,24685,1345,531,573,6};
        SortAlgorithms.quickSort(sorted_array);
        int[] expected_array = new int[]{6,46,531,564,573,1345,24685};
        assertArrayEquals(expected_array, sorted_array);

        sorted_array = new int[]{0,1,0,1};
        SortAlgorithms.quickSort(sorted_array);
        expected_array = new int[]{0,0,1,1};
        assertArrayEquals(expected_array, sorted_array);
    }
}
