package code401challenges;

import java.util.Arrays;

public class ArrayReverse {
  public static void main(String[] args){
    int[] toBeReversed = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};

    System.out.println(Arrays.toString(reverseArray(toBeReversed)));
  }
  public static int[] reverseArray(int[] arr){
    // int j = arr.length - 1;
    // int[] reversedArray = new int[arr.length];
    // for (int i = 0; i < arr.length; i++){
    //   reversedArray[j] = arr[i];
    //   j = j - 1;
    // }

    //Stretch goal - inplace swap 
    //O(1) space as new array is used
    //O(n) time as it is one iteration till mid point of the array.
    int tempHolder = 0;
    for (int i = 0; i <= arr.length / 2; i++){
      tempHolder = arr[i];
      arr[i] = arr[arr.length - 1 - i];
      arr[arr.length - 1 - i] = tempHolder;
    }
    return arr;
  }
}