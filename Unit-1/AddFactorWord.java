public class AddFactorWord {
    public static void main(String args[]) {

        int sum = 0;
        int N = 12;
        boolean isFirstFactor = true;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                if (isFirstFactor) {
                    System.out.print("Factor ");
                    isFirstFactor = false;
                } else {
                    System.out.print(", ");
                }
                System.out.print(i);
                sum += i;
            }
        }
        System.out.print("\nSum of Factors: " + sum);
    }
}
