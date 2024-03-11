import java.util.ArrayList;

public class ArrayListCommaRem {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 10 };
        int K = 3; // Assuming K is some constant value
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);

            if (i % 2 == 0) {
                al.add(arr[i] * 2);
            } else {
                al.add(arr[i] + K);
            }
        }

        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
    }
}
