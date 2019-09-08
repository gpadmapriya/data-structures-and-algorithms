package algorithms;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class InsertionSortTest {
    @Test
    public void testInsertionSort_happyPath() {
        int arr[] = { 12, 11, 13, 5, 6 };

        InsertionSort is = new InsertionSort();
        is.insertionSort(arr);
        assertArrayEquals(new int[]{5, 6, 11, 12, 13}, arr);

    }

    @Test
    public void testInsertionSort_elementsInOrder() {
        int arr[] = {5, 6, 11, 12, 13  };

        InsertionSort is = new InsertionSort();
        is.insertionSort(arr);
        assertArrayEquals(new int[]{5, 6, 11, 12, 13}, arr);

    }

    @Test
    //Also test zero value for an array element
    public void testInsertionSort_elementsInDescendingOrder() {
        int arr[] = {13, 12, 11, 6, 5, 0 };

        InsertionSort is = new InsertionSort();
        is.insertionSort(arr);
        assertArrayEquals(new int[]{0, 5, 6, 11, 12, 13}, arr);

    }

    @Test
    public void testInsertionSort_evenNumberOfElements() {
        int arr[] = {23, 13, 45, 56, 9, 32 };

        InsertionSort is = new InsertionSort();
        is.insertionSort(arr);
        assertArrayEquals(new int[]{9, 13, 23, 32, 45, 56}, arr);

    }

    @Test
    public void testInsertionSort_emptyArray() {
        int arr[] = { };

        InsertionSort is = new InsertionSort();
        is.insertionSort(arr);
        assertArrayEquals(new int[]{}, arr);

    }

    @Test
    public void testInsertionSort_arrayWithDuplicates() {
        int arr[] = {23, 13, 45, 56, 9, 32, 13 };

        InsertionSort is = new InsertionSort();
        is.insertionSort(arr);
        assertArrayEquals(new int[]{9, 13, 13, 23, 32, 45, 56}, arr);

    }
    @Test
    //All same values - could be zeroes.
    public void testInsertionSort_arrayWithAllSameValues() {
        int arr[] = {13, 13, 13 };

        InsertionSort is = new InsertionSort();
        is.insertionSort(arr);
        assertArrayEquals(new int[]{13, 13, 13}, arr);

    }
}
