package algorithms;

public class MergeSort {
    public void mergeSort(int[] arr, int begin, int end){
        if (begin < end) {
            int mid = (begin + end)/2;

            mergeSort(arr,begin, mid );
            mergeSort(arr, mid+1, end);
            merge(arr, begin, mid, end);
        }
    }

    public void merge(int[] arr, int begin, int mid, int end){
        int n1 = mid - begin + 1;
        int n2 = end - mid;

        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];

        for (int i = 0; i < n1; i++){
            leftArray[i] = arr[begin + i];
        }

        for (int j = 0; j < n2; j++){
            rightArray[j] = arr[mid + 1 + j];
        }
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = begin;
        while (i < n1 && j < n2)
        {
            if (leftArray[i] <= rightArray[j])
            {
                arr[k] = leftArray[i];
                i++;
            }
            else
            {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1)
        {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
