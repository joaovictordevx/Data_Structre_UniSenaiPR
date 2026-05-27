public class InsertionSort {

    private long comparisons;
    private long swaps;

    public InsertionSort() {
        this.comparisons = 0;
        this.swaps = 0;
    }

    public int[] sort(int[] array) {
        comparisons = 0;
        swaps = 0;

        int[] arr = array.clone();
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0) {
                comparisons++;
                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                    swaps++;
                    j--;
                } else {
                    break;
                }
            }
            arr[j + 1] = key;
        }

        return arr;
    }

    public long getComparisons() {
        return comparisons;
    }

    public long getSwaps() {
        return swaps;
    }
}