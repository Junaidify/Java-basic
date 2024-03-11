class PackerAndMovers {
    public static void main(String[] args) {
        int k = 3;
        int n = 3;

        int[] trucks = { 1, 2, 3 };

        int transport = numberOfWays(k, n, trucks, 0);
        System.out.println(transport);
    }

    public static int numberOfWays(int k, int n, int[] trucks, int idx) {
        if (k == 0) {
            return 1;
        } else if (k < 0 || n == idx) {
            return 0;
        }

        int ways = 0;
        for (int i = idx; i < trucks.length; i++) {
            ways += numberOfWays(k - trucks[i], n, trucks, idx);
        }
        return ways;

        // optinal of above for loop :

        // return numberOfWays(k-trucks[idx], n, trucks, idx)+
        // numberOfWays(k-trucks[idx], n, trucks, idx+1);

    }
}
