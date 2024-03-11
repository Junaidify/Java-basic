public class Palindrome {
  public static void main(String args[]) {
    int[] arr = {1, 2, 3, 4, 3, 2, 1};
    int asend = 0;
    int dsend = 0;

    int i;
    for (i = 0; i < arr.length; i++) {
      asend = arr[i];
    }
    System.out.println();

    int j;
    for (j = arr.length - 1; j >= 0; j--) {
      dsend = arr[j];
    }

    if (asend == dsend) {
      System.out.println(true);
    } else {
      System.out.println("false");
    }
  }
}
