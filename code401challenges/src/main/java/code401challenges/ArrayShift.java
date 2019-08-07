package code401challenges;

public class ArrayShift {
    public static int[] insertShiftArray(int[] arrToBeShifted, int intToBeAdded){
        int[] shiftedArray = new int[arrToBeShifted.length + 1];
        /* Divide array length by a double to get a double result that can be rounded up as required. Iterate input array till midpoint and copy to output array*/
        for (int i = 0; i < Math.ceil(arrToBeShifted.length/2.0); i++) {
            shiftedArray[i] = arrToBeShifted[i];
        }
        /* Insert new element at midpoint*/
        shiftedArray[(int)Math.ceil(arrToBeShifted.length/2.0)] = intToBeAdded;
        /* Copy rest of the elements from input array to output array */
        for (int i = (int)Math.ceil(arrToBeShifted.length/2.0); i < arrToBeShifted.length; i++) {
            shiftedArray[i + 1] = arrToBeShifted[i];
        }
        return shiftedArray;
    }
}
