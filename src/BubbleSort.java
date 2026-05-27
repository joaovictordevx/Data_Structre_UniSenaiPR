public class BubbleSort {

    private long comparisons;
    private long swaps;

    public BubbleSort() {
        this.comparisons = 0;
        this.swaps = 0;
    }

    public int[] sort(int[] array) {
        comparisons = 0;
        swaps = 0;

        int[] arr = array.clone();
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                comparisons++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                    swapped = true;
                }
            }
            if (!swapped) break;
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