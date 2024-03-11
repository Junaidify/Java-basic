public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 12, 88, 22, 3, 11, 37, 6, 4 };
        // Bubble sort :
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
