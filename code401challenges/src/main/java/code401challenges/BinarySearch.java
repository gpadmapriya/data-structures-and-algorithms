package code401challenges;

public class BinarySearch {
    public static int binarySearch(int[] sortedArray, int searchKey) {
        int beginIndex = 0;
        int endIndex = sortedArray.length - 1;
        int midpoint = 0;

        while (beginIndex <= endIndex){
            midpoint = (beginIndex + endIndex) / 2;
            if (sortedArray[midpoint] == searchKey) {
                return midpoint;
            } else if (sortedArray[midpoint] < searchKey) {
                beginIndex = midpoint + 1;
            } else if (sortedArray[midpoint] > searchKey) {
                endIndex = midpoint - 1;
            }
        }
        return -1;
    }

}
