public class MergeSort {

    private long comparisons;
    private long swaps;

    public void sort(int[] array) {
        comparisons = 0;
        swaps = 0;
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(int[] array, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    private void merge(int[] array, int left, int mid, int right) {
        int leftSize  = mid - left + 1;
        int rightSize = right - mid;

        int[] leftArr  = new int[leftSize];
        int[] rightArr = new int[rightSize];

        for (int i = 0; i < leftSize; i++)
            leftArr[i] = array[left + i];
        for (int j = 0; j < rightSize; j++)
            rightArr[j] = array[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < leftSize && j < rightSize) {
            comparisons++;
            if (leftArr[i] <= rightArr[j]) {
                array[k] = leftArr[i];
                i++;
            } else {
                array[k] = rightArr[j];
                swaps++;
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            array[k++] = leftArr[i++];
        }

        while (j < rightSize) {
            array[k++] = rightArr[j++];
        }
    }

    public long getComparisons() { return comparisons; }
    public long getSwaps()       { return swaps; }
}