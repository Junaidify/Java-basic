public class Pattern {
  public static void main(String args[]) {

    // * * * * *
    // * * * * 
    // * * *
    // * *
    // * 
    
    int num = 5;
    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= num; j++) {
        if (j == 1 || i == 5 || i == 1) {
          if (j < num) {
            System.out.print("* ");
          } else {
            System.out.print("*");
          }
        }
      }
      System.out.println();
    }
  }
}
