class StarAndPattern {
    public static void main(String[] args) {
        int N = 5;
        for (int i = N; i > 0; i--) {
            for (int j = 1; j <= N; j++) {
                if (j < i) {
                    System.out.print("* ");
                } else if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
