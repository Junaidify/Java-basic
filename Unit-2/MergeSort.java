public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 11, 25, 12, 3, 14, 1 };
        int low = 0;
        int high = arr.length - 1;

        mergeSort(arr, low, high);

        System.out.println("Sorted Array:");
        printMergeSort(arr);
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int firstHalfLength = mid - low + 1;
        int secondHalfLength = high - mid;

        int[] firstHalf = new int[firstHalfLength];
        int[] secondHalf = new int[secondHalfLength];

        for (int i = 0; i < firstHalfLength; i++) {
            firstHalf[i] = arr[low + i];
        }

        for (int j = 0; j < secondHalfLength; j++) {
            secondHalf[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = low;

        while (i < firstHalfLength && j < secondHalfLength) {
            if (firstHalf[i] < secondHalf[j]) {
                arr[k] = firstHalf[i];
                i++;
            } else {
                arr[k] = secondHalf[j];
                j++;
            }
            k++;
        }

        while (i < firstHalfLength) {
            arr[k] = firstHalf[i];
            i++;
            k++;
        }

        while (j < secondHalfLength) {
            arr[k] = secondHalf[j];
            j++;
            k++;
        }
    }

    static void printMergeSort(int[] sortedArray) {
        for (int i : sortedArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
