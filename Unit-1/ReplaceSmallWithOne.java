class ReplaceSmallWithOne {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2 };

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i]) {
                arr[i] = -1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
