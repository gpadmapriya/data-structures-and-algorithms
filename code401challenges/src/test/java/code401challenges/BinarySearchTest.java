package code401challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test public void testBinarySearch_firstIndex(){
        int[] sortedArray = new int[]{3,6,8,9};
        assertEquals("Number found in array", BinarySearch.binarySearch(sortedArray, 3), 0);
    }

    @Test public void testBinarySearch_lastIndex(){
        int[] sortedArray = new int[]{3,6,8,9};
        assertEquals("Number found in array", BinarySearch.binarySearch(sortedArray, 9), 3);
    }

    @Test public void testBinarySearch_randomIndex(){
        int[] sortedArray = new int[]{4,8,15,16,23,42};
        assertEquals("Number found in array", BinarySearch.binarySearch(sortedArray, 15), 2);
    }

    @Test public void testBinarySearch_failure(){
        int[] sortedArray = new int[]{11,22,33,44,55,66,77};
        assertEquals("Number not in array", BinarySearch.binarySearch(sortedArray, 90), -1);
    }

    @Test public void testBinarySearch_emptyArray(){
        int[] sortedArray = new int[]{};
        assertEquals("Number not in array", BinarySearch.binarySearch(sortedArray, -1), -1);
    }
}
