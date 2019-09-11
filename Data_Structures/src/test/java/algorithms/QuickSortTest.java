package algorithms;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {
    @Test
    public void testQuickSort_happyPath() {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        QuickSort newSort = new QuickSort();

        newSort.quickSort(arr, 0, arr.length-1);
        assertArrayEquals(new int[]{5, 6, 7, 11, 12, 13}, arr);
    }

    @Test
    public void testQuickSort_elementsInOrder() {
        int arr[] = {5, 6, 7, 11, 12, 13  };

        QuickSort newSort = new QuickSort();
        newSort.quickSort(arr, 0 , arr.length - 1);
        assertArrayEquals(new int[]{5, 6, 7, 11, 12, 13}, arr);

    }
    @Test
    //Also test zero value for an array element
    public void testQuickSort_elementsInDescendingOrder() {
        int arr[] = {13, 12, 11, 7, 6, 5, 0 };

        QuickSort newSort = new QuickSort();
        newSort.quickSort(arr, 0 , arr.length - 1);
        assertArrayEquals(new int[]{0, 5, 6, 7, 11, 12, 13}, arr);
    }

    @Test
    public void testQuickSort_emptyArray() {
        int arr[] = { };

        QuickSort newSort = new QuickSort();
        newSort.quickSort(arr, 0 , arr.length - 1);
        assertArrayEquals(new int[]{}, arr);

    }

    @Test
    public void testQuickSort_arrayWithDuplicates() {
        int arr[] = {23, 13, 45, 56, 9, 32, 13 };

        QuickSort newSort = new QuickSort();
        newSort.quickSort(arr, 0 , arr.length - 1);
        assertArrayEquals(new int[]{9, 13, 13, 23, 32, 45, 56}, arr);

    }
    @Test
    //All same values - could be zeroes.
    public void testQuickSort_arrayWithAllSameValues() {
        int arr[] = {13, 13, 13 };

        QuickSort newSort = new QuickSort();
        newSort.quickSort(arr, 0 , arr.length - 1);
        assertArrayEquals(new int[]{13, 13, 13}, arr);
    }
}
