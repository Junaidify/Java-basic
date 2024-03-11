class TrappedWater {
    public static void main(String[] args) {
        int[] trappedWater = { 3, 2, 0, 4, 6 };
        int N = trappedWater.length;

        calculateTrappedWater(trappedWater, N);
    }

    public static void calculateTrappedWater(int[] trappedWater, int N) {
        int[] left = new int[N];
        int[] right = new int[N];
        int sum = 0;

        left[0] = trappedWater[0];
        for (int i = 1; i < N; i++) {
            left[i] = Math.max(left[i - 1], trappedWater[i]);
        }

        right[N - 1] = trappedWater[N - 1];
        for (int i = N - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], trappedWater[i]);
        }

        for (int i = 0; i < N; i++) {
            int store = Math.min(left[i], right[i]);
            sum += Math.max(store - trappedWater[i], 0);
        }

        System.out.println(sum);
    }

}
