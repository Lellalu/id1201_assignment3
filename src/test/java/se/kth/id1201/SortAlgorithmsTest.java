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
}
