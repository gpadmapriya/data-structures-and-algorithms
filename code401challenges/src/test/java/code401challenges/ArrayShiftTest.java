package code401challenges;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class ArrayShiftTest {
    @Test public void testinsertShiftArray() {
        int[] expectedArray = new int[]{2,4,5,6,8};
        int[] inputArray = new int[]{2,4,6,8};
        assertArrayEquals("insertShiftArray should return the expected array(new value inserted in the middle index)", expectedArray, ArrayShift.insertShiftArray(inputArray, 5));

    }

    @Test public void testinsertShiftArray_1() {
        int[] expectedArray = new int[]{4,8,15,16,23,42};
        int[] inputArray = new int[]{4,8,15,23,42};
        assertArrayEquals("insertShiftArray should return the expected array(new value inserted after middle index-array with odd number of elements)", expectedArray, ArrayShift.insertShiftArray(inputArray, 16));
    }

    @Test public void testinsertShiftArray_edgecase() {
        int[] expectedArray = new int[]{4};
        int[] inputArray = new int[]{};
        assertArrayEquals("insertShiftArray should return the expected array(new value inserted after middle index-array with odd number of elements)", expectedArray, ArrayShift.insertShiftArray(inputArray, 4));

    }
    @Test public void testinsertShiftArray_expectedfailure() {
        int[] expectedArray = new int[]{4,8,16,15,23,42};
        int[] inputArray = new int[]{4,8,15,23,42};
        assertFalse("insertShiftArray should not insert new value before middle index-array with odd number of elements)", Arrays.equals(expectedArray, ArrayShift.insertShiftArray(inputArray, 16)));

    }
}