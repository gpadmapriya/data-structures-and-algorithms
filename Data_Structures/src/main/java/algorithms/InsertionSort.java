package algorithms;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int j = i - 1;
            int temp = arr[i];

            while ( (j>=0) && (temp < arr[j]) ){
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args){
        int arr[] = {23, 13, 45, 56, 9, 32, 13 };

        InsertionSort is = new InsertionSort();
        is.insertionSort(arr);
        printArray(arr);
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }


}
