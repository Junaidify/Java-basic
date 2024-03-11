import java.text.DecimalFormat;
import java.util.*;

class GPRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        DecimalFormat df = new DecimalFormat("#.0000");
        System.out.println(df.format(geometricSum(n, r)));

        sc.close();
    }

    static double geometricSum(int n, int r) {
        double sum = 0;
        if (n == 0)
            return 1;

        sum += 1 / Math.pow(r, n);
        sum += geometricSum(n - 1, r);
        return sum;
    }
}
