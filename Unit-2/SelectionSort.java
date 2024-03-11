public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 38, 22, 13, 11, 137, 6, 2 };
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = i; j < length; j++) {

                if (arr[j] < arr[i]) {
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
