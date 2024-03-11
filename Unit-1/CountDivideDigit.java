public class CountDivideDigit {
    
  public static void main(String args[]) {

    
    int left = 5;
    int right = 6;
    int k = 1;

    int count = 0;
    for (int i = left; i <= right; i++) {
      if (i % k == 0) {
        count++;
      }
    }

    System.out.println(count);
  }
}
