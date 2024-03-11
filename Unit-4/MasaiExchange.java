import java.util.*;

class MasaiExchange {
    static HashMap<Integer, Long> hm = new HashMap<>();

    public static void main(String[] args) {

        int n = 12;

        long res = exchange(n);
        System.out.println(res);

    }

    public static long exchange(int n) {
        long maxValue = Integer.MAX_VALUE;
        if (n <= 1) {
            return n;
        }

        if (hm.containsKey(n)) {
            return hm.get(n);
        }

        maxValue = Math.max(n, exchange(n / 2) + exchange(n / 3) + exchange(n / 4));
        hm.put(n, maxValue);
        return maxValue;
    }

}
