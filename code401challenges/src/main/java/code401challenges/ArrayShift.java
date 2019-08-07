package code401challenges;

public class ArrayShift {
    public static int[] insertShiftArray(int[] arrToBeShifted, int intToBeAdded){
        int[] shiftedArray = new int[arrToBeShifted.length + 1];
        for (int i = 0; i < Math.ceil((arrToBeShifted.length+1)/2); i++) {
            shiftedArray[i] = arrToBeShifted[i];
        }
        shiftedArray[(int)Math.ceil((arrToBeShifted.length+1)/2)] = intToBeAdded;
        for (int i = (int)Math.ceil((arrToBeShifted.length+1)/2); i < arrToBeShifted.length; i++) {
            shiftedArray[i + 1] = arrToBeShifted[i];
        }
        return shiftedArray;
    }
}
