public class SelectionSort {

    private long comparisons;
    private long swaps;

    public SelectionSort() {
        this.comparisons = 0;
        this.swaps = 0;
    }

    public int[] sort(int[] array) {
        comparisons = 0;
        swaps = 0;

        int[] arr = array.clone();
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                comparisons++;
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
                swaps++;
            }
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